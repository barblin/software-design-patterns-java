package io.barblin.patterns.structural.decorator;

public abstract class DataSourceDecorator implements DataSource {

    private DataSource wrappee;

    DataSourceDecorator(DataSource dataSource) {
        this.wrappee = dataSource;
    }

    @Override
    public void write(String data) {
        wrappee.write(data);
    }

    @Override
    public String read() {
        return wrappee.read();
    }
}
