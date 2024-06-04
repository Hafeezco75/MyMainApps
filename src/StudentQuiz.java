import java.util.Scanner;

public class StudentQuiz {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        final int finalQuestions = 5;
        int count = 0;
        int correctCount = 0;
        String result = " ";
        long startTime = System.nanoTime();

        while (count < finalQuestions) {
            int number1 = (int) (Math.random() * 10);
            int number2 = (int) (Math.random() * 10);

            if (number1 < number2) {
                int temp = number1;
                number1 = number2;
                number2 = temp;
            }

            System.out.println("What is " + number1 + "-" + number2 + "?");
            int answer = sc.nextInt();

            if (number1 - number2 == answer) {
                System.out.println("You are correct");
                correctCount++;
            }
            else
                System.out.println("You are wrong.\n" + number1 + "-" + number2 + " should be " + (number1 - number2));
            count++;

            result += "\n" + number1 + "-" + number2 + "=" + answer + ((number1 - number2 == answer) ? "correct" : "wrong");
        }

        long endTime = System.nanoTime();
        long totalTime = endTime - startTime;

        System.out.println("Correct Count is : " + correctCount + " and Test time is " + totalTime / 1000 + "seconds" + result);
    }


}