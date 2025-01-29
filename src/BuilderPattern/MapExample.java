package BuilderPattern;

import java.util.*;

public class MapExample {

    public static void main(String[] args) {
        Map<String, Integer> map = new TreeMap<>();
        map.put("TWO", 2);
        map.put("FIVE", 5);
        map.put("SIX", 6);
        map.put("THREE", 3);
        map.put("FOUR", 4);

        System.out.println(map);

        Collection<Integer> values = new TreeSet<>();

        values.addAll(Collections.singleton(5));
    }
}
