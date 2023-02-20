package io.barblin.patterns.behavioral.command;

public record TurnRightCommand(Player player) implements Command {
    @Override
    public void execute() {
        player.rotateRight();
    }
}
