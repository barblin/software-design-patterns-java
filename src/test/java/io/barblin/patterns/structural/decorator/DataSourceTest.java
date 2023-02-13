package io.barblin.patterns.structural.decorator;

import org.junit.jupiter.api.Test;

class DataSourceTest {

    @Test
    void shouldSucceed() {
        String record = "Name,Salary\nJohn Smith, 100000\nSteven Jobs,912000";
        DataSourceDecorator encoded = new CompressionDecorator(
                new EncryptionDecorator(
                        new FileDataSource("./file.txt")
                )
        );

        encoded.write(record);
        DataSource plain = new FileDataSource("./file.txt");

        System.out.println("---------------- Input ----------------");
        System.out.println(record);
        System.out.println("---------------- Encoded --------------");
        System.out.println(plain.read());
        System.out.println("---------------- Decoded --------------");
        System.out.println(encoded.read());
    }
}