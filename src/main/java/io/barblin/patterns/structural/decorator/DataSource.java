package io.barblin.patterns.structural.decorator;

public interface DataSource {

    void write(String data);

    String read();

}


