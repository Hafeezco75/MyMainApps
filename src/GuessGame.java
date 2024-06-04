import java.util.Scanner;
public class GuessGame {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int guess = 30;

        System.out.println("Guess a number between 1 and 100");
        System.out.println("Enter your guess");
        int answer = sc.nextInt();

        while (answer != guess) {
            if (answer >= guess) {
                System.out.println("Your guess is too high");
            }
            if (answer <= guess) {
                System.out.println("Your guess is too low");
            }
            answer = sc.nextInt();
        }
        System.out.println("Congratulations,You are correct,You guessed right");
    }
}
