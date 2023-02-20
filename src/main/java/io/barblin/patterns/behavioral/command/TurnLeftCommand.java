package io.barblin.patterns.behavioral.command;

public record TurnLeftCommand(Player player) implements Command {
    @Override
    public void execute() {
        player.rotateLeft();
    }
}
