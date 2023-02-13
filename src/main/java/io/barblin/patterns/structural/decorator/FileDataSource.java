package io.barblin.patterns.structural.decorator;

import java.io.*;

public class FileDataSource implements DataSource {

    private final String name;

    public FileDataSource(String name) {
        this.name = name;
    }

    @Override
    public void write(String data) {
        File file = new File(name);
        try (OutputStream os = new FileOutputStream(file)) {
            os.write(data.getBytes(), 0, data.length());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    @Override
    public String read() {
        char[] buffer = null;
        File file = new File(name);

        try (FileReader reader = new FileReader(file)) {
            buffer = new char[(int) file.length()];
            reader.read(buffer);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        return new String(buffer);
    }
}
