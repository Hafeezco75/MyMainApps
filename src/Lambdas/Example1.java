package Lambdas;

import java.util.List;
import java.util.function.Consumer;

public class Example1 {

    public static void main(String[] args) {
        List<String> list = List.of("Expendables","Mavericks","Enigmas","Titans","Constructors");

        Consumer consumer = (text)-> System.out.println("Hello ");

        consumer.accept(list);

        list.forEach(consumer);
    }
}
