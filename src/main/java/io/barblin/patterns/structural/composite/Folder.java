package io.barblin.patterns.structural.composite;

import java.util.List;
import java.util.Objects;

public record Folder(String name, List<FileSystemComponent> components) implements FileSystemComponent {

    public void addComponent(FileSystemComponent component) {
        components.add(component);
    }

    public void removeComponent(FileSystemComponent component) {
        components.remove(component);
    }

    @Override
    public long getSize() {
        long size = 0;
        for (FileSystemComponent component : components) {
            size += component.getSize();
        }
        return size;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Folder folder = (Folder) o;
        return name.equals(folder.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
