package io.barblin.patterns.structural.facade;

public final class OggCompression implements Compression {
    @Override
    public Video compress(Video sourceVideo, Video.Codec destinationCodec) {
        String newFileName = sourceVideo.fileName().split("\\.")[0] + "." + destinationCodec.value();

        // Ogg specific compression

        return new Video(newFileName, destinationCodec);
    }
}
