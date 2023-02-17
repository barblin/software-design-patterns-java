package io.barblin.patterns.structural.proxy;

import io.barblin.patterns.structural.flyweight.Texture;

import java.time.LocalDateTime;
import java.util.LinkedList;
import java.util.List;

public class SmartProxyTexture {

    private final String fileName;
    private Texture texture;
    private LocalDateTime lastInteraction;
    private LinkedList<String> userAccesses;

    public SmartProxyTexture(String fileName, String userId) {
        this.fileName = fileName;
        this.lastInteraction = LocalDateTime.now();
        this.userAccesses = new LinkedList<>();
        this.userAccesses.addLast(userId);
    }

    public Texture get(String userId) {
        this.lastInteraction = LocalDateTime.now();
        this.userAccesses.addLast(userId);

        if (texture == null) {
            this.texture = new Texture(this.fileName);
        }

        return this.texture;
    }

    public LocalDateTime lastInteraction() {
        return this.lastInteraction;
    }

    public String getLastUser() {
        return userAccesses.getLast();
    }

    public List getAllUsers() {
        return this.userAccesses;
    }
}
