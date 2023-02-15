package io.barblin.patterns.structural.facade;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class VideoConverterFacadeTest {


    @Test
    void converterShouldConvertFileFromMp4ToOgg() {
        Video convertedVideo = VideoConverterFacade.convert("video.mp4", "ogg");
        assertEquals("video.ogg", convertedVideo.fileName());
        assertEquals(Video.Codec.OGG, convertedVideo.codec());
    }

    @Test
    void converterShouldConvertFileFromMp4ToMp4() {
        Video convertedVideo = VideoConverterFacade.convert("video.mp4", "mp4");
        assertEquals("video.mp4", convertedVideo.fileName());
        assertEquals(Video.Codec.MP4, convertedVideo.codec());
    }

    @Test
    void converterShouldConvertFileFromOggToMp4() {
        Video convertedVideo = VideoConverterFacade.convert("video.ogg", "mp4");
        assertEquals("video.mp4", convertedVideo.fileName());
        assertEquals(Video.Codec.MP4, convertedVideo.codec());
    }
}