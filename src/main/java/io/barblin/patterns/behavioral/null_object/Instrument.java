package io.barblin.patterns.behavioral.null_object;

import java.util.Map;

public interface Instrument {

    Map<String, Instrument> MUSICAL_ENSEMBLE = Map.of("drum", new Drum());

    boolean isNull();

    void playSound(Recorder recorder);
}
