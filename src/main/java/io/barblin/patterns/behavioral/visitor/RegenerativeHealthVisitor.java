package io.barblin.patterns.behavioral.visitor;

public final class RegenerativeHealthVisitor implements HealthVisitor {

    private static final int PLAYER_REGEN_INCREMENT = 10;
    private static final int BOSS_REGEN_INCREMENT = 20;

    @Override
    public void visit(Player player) {
        player.increaseHealth(PLAYER_REGEN_INCREMENT);
    }

    @Override
    public void visit(Boss boss) {
        boss.increaseHealth(BOSS_REGEN_INCREMENT);
    }
}
