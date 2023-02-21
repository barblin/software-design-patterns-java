package io.barblin.patterns.behavioral.nullobject;

public class Drum implements Instrument {

    private static final String DRUM_SOUND = "Badabum";

    @Override
    public boolean isNull() {
        return false;
    }

    @Override
    public void playSound(Recorder recorder) {
        recorder.record(DRUM_SOUND);
    }
}
