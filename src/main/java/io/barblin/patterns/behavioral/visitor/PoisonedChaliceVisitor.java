package io.barblin.patterns.behavioral.visitor;

public final class PoisonedChaliceVisitor implements HealthVisitor {

    private static final int PLAYER_POISON_DECREMENT = 80;
    private static final int BOSS_POISON_DECREMENT = 100;

    @Override
    public void visit(Player player) {
        player.inflictDamage(PLAYER_POISON_DECREMENT);
    }

    @Override
    public void visit(Boss boss) {
        boss.inflictDamage(BOSS_POISON_DECREMENT);
    }
}
