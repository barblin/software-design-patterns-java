package io.barblin.patterns.behavioral.interpreter;

public sealed interface Expression permits Number, Add, Subtract {

    enum Operator {
        ADD("+"),
        SUBTRACT("-");

        private final String sign;

        Operator(String sign) {
            this.sign = sign;
        }

        String sign() {
            return sign;
        }
    }

    int interpret();
}
