import java.util.HashMap;

public class Hashmapps {

    public static void main(String[] args) {

        int[] inputs = {2, 3, 5, 3, 3, 2, 5};

        HashMap<Integer, Integer> numbers = new HashMap<Integer, Integer>(); {

            for (Integer count : inputs) {
                if (numbers.containsKey(count + 1)) {
                    numbers.put(count,count+1); numbers.get(count + 1);
                }

                System.out.println(count + ":" + (numbers.get(count) + 1));
            }

        }

    }

}