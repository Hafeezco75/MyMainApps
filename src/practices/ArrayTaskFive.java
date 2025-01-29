package practices;

import java.util.Arrays;

public class ArrayTaskFive {

    public static void main(String[] args) {

        int[] number = {30, 45, 98, 31, 93, 48, 21, 70};

        int[] result = arrayelement(number);

        System.out.println(Arrays.toString(result));

    }

    public static int[] arrayelement(int[] number) {

        int[] elements = new int[8];

        for (int count = 0; count < number.length; count++) {
            if (number[count] % 2 == 1) {
                elements[count] = number[count];
            }
        }
        return elements;
    }
}
