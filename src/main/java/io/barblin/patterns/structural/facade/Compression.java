package io.barblin.patterns.structural.facade;

public interface Compression {

    Video compress(Video sourceVideo, Video.Codec destinationCodec);
}
