package io.barblin.patterns.behavioral.command;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CommandTest {

    @Test
    void playerShouldTurnRightAndLeft() {
        Player player = new Player();

        TurnLeftCommand turnLeftCommand = new TurnLeftCommand(player);
        TurnRightCommand turnRightCommand = new TurnRightCommand(player);

        RemoteControl control = new RemoteControl();
        control.register(RemoteControl.Button.LEFT_ARROW, turnLeftCommand);
        control.register(RemoteControl.Button.RIGHT_ARROW, turnRightCommand);

        assertEquals(Player.Direction.NORTH, player.getDirection());

        control.press(RemoteControl.Button.LEFT_ARROW);
        control.press(RemoteControl.Button.LEFT_ARROW);

        assertEquals(Player.Direction.SOUTH, player.getDirection());

        control.press(RemoteControl.Button.RIGHT_ARROW);
        control.press(RemoteControl.Button.RIGHT_ARROW);
        control.press(RemoteControl.Button.RIGHT_ARROW);

        assertEquals(Player.Direction.EAST, player.getDirection());

        control.press(RemoteControl.Button.RIGHT_ARROW);
        control.press(RemoteControl.Button.RIGHT_ARROW);
        control.press(RemoteControl.Button.RIGHT_ARROW);
        control.press(RemoteControl.Button.RIGHT_ARROW);

        assertEquals(Player.Direction.EAST, player.getDirection());
    }

    @Test
    void playerShouldNotTurnForButtonNotFound() {
        Player player = new Player();

        TurnLeftCommand turnLeftCommand = new TurnLeftCommand(player);
        TurnRightCommand turnRightCommand = new TurnRightCommand(player);

        RemoteControl control = new RemoteControl();
        control.register(RemoteControl.Button.LEFT_ARROW, turnLeftCommand);
        control.register(RemoteControl.Button.RIGHT_ARROW, turnRightCommand);

        control.press(null);

        assertEquals(Player.Direction.NORTH, player.getDirection());
    }
}