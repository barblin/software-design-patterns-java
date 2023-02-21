package io.barblin.patterns.behavioral.nullobject;

public class UnknownInstrument implements Instrument {
    @Override
    public boolean isNull() {
        return true;
    }

    @Override
    public void playSound(Recorder recorder) {
        // ignore recorder
    }
}
