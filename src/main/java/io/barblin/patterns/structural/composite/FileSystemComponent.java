package io.barblin.patterns.structural.composite;

public sealed interface FileSystemComponent permits File, Folder {

    long getSize();
}
