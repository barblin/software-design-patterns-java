package io.barblin.patterns.behavioral.visitor;

public sealed interface HealthVisitor permits RegenerativeHealthVisitor, PoisonedChaliceVisitor {

    void visit(Player player);

    void visit(Boss boss);
}
