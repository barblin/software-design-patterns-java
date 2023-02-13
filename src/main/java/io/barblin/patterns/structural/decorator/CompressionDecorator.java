package io.barblin.patterns.structural.decorator;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Base64;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.InflaterInputStream;

public class CompressionDecorator extends DataSourceDecorator {

    private int compressionLevel = 6;

    CompressionDecorator(DataSource dataSource) {
        super(dataSource);
    }

    public int getCompressionLevel() {
        return compressionLevel;
    }

    public void setCompressionLevel(int level) {
        this.compressionLevel = level;
    }

    @Override
    public void write(String data) {
        super.write(compress(data));
    }

    @Override
    public String read() {
        return decompress(super.read());
    }

    private String compress(String stringData) {
        byte[] data = stringData.getBytes();

        try (ByteArrayOutputStream bout = new ByteArrayOutputStream(512);
             DeflaterOutputStream dos = new DeflaterOutputStream(bout, new Deflater(compressionLevel))) {

            dos.write(data);

            return Base64.getEncoder().encodeToString(bout.toByteArray());
        } catch (IOException ex) {
            return null;
        }
    }

    private String decompress(String stringData) {
        byte[] data = Base64.getDecoder().decode(stringData);

        try (InputStream in = new ByteArrayInputStream(data);
             InflaterInputStream iin = new InflaterInputStream(in);
             ByteArrayOutputStream bout = new ByteArrayOutputStream(512)) {

            int b;
            while ((b = iin.read()) != -1) {
                bout.write(b);
            }

            return new String(bout.toByteArray());

        } catch (IOException e) {
            return null;
        }
    }
}
