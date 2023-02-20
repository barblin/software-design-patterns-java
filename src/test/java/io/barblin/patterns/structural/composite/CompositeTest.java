package io.barblin.patterns.structural.composite;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CompositeTest {


    @Test
    void createFileSystemShouldCalculateSize() {
        Folder root = new Folder("/", new ArrayList<>());
        Folder home = new Folder("home", new ArrayList<>());
        File file1 = new File("1.txt", 100);
        File file2 = new File("2.txt", 300);
        File file3 = new File("3.txt", 900);

        root.addComponent(home);
        home.addComponent(file1);
        home.addComponent(file2);
        home.addComponent(file3);

        assertEquals(1300, root.getSize());
    }
}