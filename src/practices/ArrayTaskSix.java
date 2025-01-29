package practices;

import java.util.Arrays;

public class ArrayTaskSix {

    public static void main(String[] args) {

        int[] numbers = {12, 15, 18, 38, 98, 43, 92, 75};

        int[] result = arrayelement(numbers);

        System.out.println(Arrays.toString(result));

    }

    public static int[] arrayelement(int[] numbers) {

        int[] element = new int[8];

        for (int count = 0; count < numbers.length; count++) {
            if (numbers[count] % 2 == 0) {
                element[count] = numbers[count];
            }
        }
        return element;
    }

}
