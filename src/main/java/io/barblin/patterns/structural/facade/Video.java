package io.barblin.patterns.structural.facade;

import java.util.Map;
import java.util.Objects;

public record Video(String fileName, Codec codec) {

    public Video {
        Objects.requireNonNull(fileName);
        Objects.requireNonNull(codec);
    }

    public enum Codec {
        MP4("mp4"),
        OGG("ogg");

        private static final Map<String, Codec> FILE_ENDING_TO_CODED = Map.of(
                MP4.value, MP4,
                OGG.value, OGG
        );
        private final String value;

        Codec(String value) {
            this.value = value;
        }

        public String value() {
            return value;
        }

        public static Codec of(String value) {
            return FILE_ENDING_TO_CODED.getOrDefault(value, MP4);
        }
    }
}