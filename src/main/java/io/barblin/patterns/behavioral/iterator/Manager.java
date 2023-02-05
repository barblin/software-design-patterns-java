package io.barblin.patterns.behavioral.iterator;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;

public final class Manager extends Employee {

    private Set<Employee> subordinates;

    public Manager(int id) {
        super(id);
        subordinates = new HashSet<>();
    }

    public void addSubordinate(Employee employee) {
        subordinates.add(employee);
    }

    @Override
    public Role identify() {
        return Role.MANAGER;
    }

    @Override
    public Iterator<Employee> iterator() {
        return new ManagerIterator(this);
    }

    private static class ManagerIterator implements Iterator<Employee> {
        private LinkedList<Employee> employees = new LinkedList<>();

        public ManagerIterator(Manager manager) {
            employees.add(manager);
            for (Employee subordinate : manager.subordinates) {
                for (Employee employee : subordinate) {
                    employees.addLast(employee);
                }
            }
        }

        @Override
        public boolean hasNext() {
            return !employees.isEmpty();
        }

        @Override
        public Employee next() {
            return employees.removeFirst();
        }
    }
}
