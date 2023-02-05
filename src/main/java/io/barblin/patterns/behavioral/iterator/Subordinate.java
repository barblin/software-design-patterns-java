package io.barblin.patterns.behavioral.iterator;

import java.util.Iterator;

public final class Subordinate extends Employee {

    public Subordinate(int id) {
        super(id);
    }

    @Override
    public Iterator<Employee> iterator() {
        return new EmployeeIterator(this);
    }

    private static class EmployeeIterator implements Iterator<Employee> {

        private boolean hasNext;
        private Subordinate subordinate;

        public EmployeeIterator(Subordinate subordinate) {
            hasNext = true;
            this.subordinate = subordinate;
        }

        @Override
        public boolean hasNext() {
            boolean temp = hasNext;
            hasNext = false;
            return temp;
        }

        @Override
        public Employee next() {
            return subordinate;
        }
    }
}
