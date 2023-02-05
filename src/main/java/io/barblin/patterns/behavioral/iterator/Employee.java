package io.barblin.patterns.behavioral.iterator;

import java.util.Objects;

public abstract class Employee implements Iterable<Employee> {

    private final int id;

    public Employee(int id) {
        this.id = id;
    }

    enum Role {
        EMPLOYEE,
        MANAGER
    }

    public int showId() {
        return id;
    }

    abstract Role identify();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
