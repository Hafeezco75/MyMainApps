package Lambdas;

import java.util.function.UnaryOperator;

public class UnaryOperatorSample {

    public static void main(String[] args) {

        UnaryOperator<Integer> unaryOperator = number -> number * 3;

        System.out.println(unaryOperator.apply(73));
    }
}
