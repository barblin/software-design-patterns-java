package io.barblin.patterns.behavioral.null_object;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NullObjectTest {

    @Test
    void shouldGetInstrumentAndNullInstrument() {
        Recorder recorder = new Recorder() {
            private String sound;

            @Override
            public void record(String sound) {
                this.sound = sound;
            }

            @Override
            public String playback() {
                return sound;
            }
        };

        Instrument drum = Instrument.MUSICAL_ENSEMBLE.getOrDefault("drum", new UnknownInstrument());
        drum.playSound(recorder);

        assertFalse(drum.isNull());
        // instrument is known, recorder does record the sound
        assertEquals("Badabum", recorder.playback());

        Instrument unknown = Instrument.MUSICAL_ENSEMBLE.getOrDefault("unknown", new UnknownInstrument());
        assertTrue(unknown.isNull());
        /* instrument is not known, recorder does not record the sound and still
           plays the sound from the first recording */
        assertEquals("Badabum", recorder.playback());
    }
}