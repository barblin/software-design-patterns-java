package io.barblin.patterns.structural.facade;

import java.util.EnumMap;

public final class VideoConverterFacade {
    private final static EnumMap<Video.Codec, Compression> CODEC_TO_COMPRESSION =
            new EnumMap<>(Video.Codec.class);

    static {
        CODEC_TO_COMPRESSION.put(Video.Codec.MP4, new Mp4Compression());
        CODEC_TO_COMPRESSION.put(Video.Codec.OGG, new OggCompression());
    }

    private VideoConverterFacade() {
    }

    public static Video convert(String fileName, String format) {
        Video source = new Video(fileName, Video.Codec.of(fileName.split("\\.")[1]));
        Video.Codec destinationCoded = Video.Codec.of(format);

        if (destinationCoded.equals(source.codec())) {
            return source;
        }

        Compression videoCompressor = CODEC_TO_COMPRESSION.get(destinationCoded);
        return videoCompressor.compress(source, destinationCoded);
    }
}
