package Lambdas;

import java.util.function.Predicate;

public class PredicateSamples {

    public static void main(String[] args) {
        Predicate<String> predicate = (name)-> name.endsWith("g");

        System.out.println(predicate.test("John"));

    }
}
