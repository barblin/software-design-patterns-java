package io.barblin.patterns.structural.composite;

import java.util.Objects;

public record File(String name, int size) implements FileSystemComponent {
    @Override
    public long getSize() {
        return size;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        File file = (File) o;
        return name.equals(file.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
