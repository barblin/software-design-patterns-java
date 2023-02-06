package io.barblin.patterns.behavioral.visitor;

public sealed interface HealthVisitor permits RegenerativeHealthVisitor {

    void visit(Player player);

    void visit(Boss boss);
}
