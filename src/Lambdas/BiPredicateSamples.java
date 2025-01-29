package Lambdas;

import java.util.function.BiPredicate;

public class BiPredicateSamples {

    public static void main(String[] args) {
        BiPredicate<String, Integer> biPredicate = (day, figure)-> day.length() == figure;

        System.out.println(biPredicate.test("Monday", 8));
    }
}
