import java.util.Arrays;

public class ArrayInput {

    public static void main(String[] args) {

        int[] arrays = {4, 5, 8, 8, 8, 2, 9};

        boolean[] riders = numbers(arrays);

        System.out.println(Arrays.toString(riders));

    }
public static boolean[] numbers (int[] arrays) {

    boolean[] result = new boolean[arrays.length];

    for (int count = 0; count < arrays.length; count++) {
        if (arrays[count] % 2 == 0) {result[count] = false;}
        else {result[count] = true;}
    }
    return result;
    }
}

