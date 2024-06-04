public class Arrayss {

    public static int[] substitute(int[] numbers) {

        int[] number = {2, 3, 5, 2, 5, 3};

        for (int count = 0; count < number.length; count++) {
            numbers[count] = number[count] * 2;
        }
        return numbers;
    }


}
