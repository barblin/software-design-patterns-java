package io.barblin.patterns.behavioral.memento;

class GameState {

    private String state;

    public void set(String state) {
        this.state = state;
    }

    public Memento quickSave() {
        return new Memento(this.state);
    }

    public void restore(Memento memento) {
        this.state = memento.get();
    }

    public String get() {
        return this.state;
    }

    public static class Memento {
        private final String state;

        public Memento(String state) {
            this.state = state;
        }

        private String get() {
            return state;
        }
    }
}
