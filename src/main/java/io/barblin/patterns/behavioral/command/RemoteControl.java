package io.barblin.patterns.behavioral.command;

import java.util.EnumMap;

public final class RemoteControl {

    enum Button {
        LEFT_ARROW,
        RIGHT_ARROW
    }

    private final EnumMap<Button, Command> commands;


    public RemoteControl() {
        commands = new EnumMap<>(Button.class);
    }

    public void register(Button button, Command command) {
        commands.put(button, command);
    }

    public void press(Button button) {
        commands.getOrDefault(button, () -> {
        }).execute();
    }
}
