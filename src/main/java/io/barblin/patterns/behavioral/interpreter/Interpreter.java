package io.barblin.patterns.behavioral.interpreter;

import java.util.LinkedList;

public class Interpreter {

    private Expression parse(String input) {
        LinkedList<Expression> stack = new LinkedList<>();

        for (String token : input.split(" ")) {
            if (Expression.Operator.ADD.sign().equals(token)) {
                Expression right = stack.removeFirst();
                Expression left = stack.removeFirst();
                stack.push(new Add(left, right));
            } else if (Expression.Operator.SUBTRACT.sign().equals(token)) {
                Expression right = stack.removeFirst();
                Expression left = stack.removeFirst();
                stack.push(new Subtract(left, right));
            } else {
                stack.push(new Number(Integer.parseInt(token)));
            }
        }

        return stack.removeFirst();
    }

    public int interpret(String input) {
        Expression expression = parse(input);
        return expression.interpret();
    }
}
