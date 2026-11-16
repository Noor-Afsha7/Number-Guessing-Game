
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int randomNumber = random.nextInt(100) + 1;
        int guess;
        int attempts = 0;

        System.out.println("===== NUMBER GUESSING GAME =====");
        System.out.println("I have selected a number between 1 and 100.");
        System.out.println("Try to guess it!");

        do {
            System.out.print("\nEnter your guess: ");
            guess = sc.nextInt();

            attempts++;

            if (guess < randomNumber) {
                System.out.println("Too low! Try a higher number.");
            }
            else if (guess > randomNumber) {
                System.out.println("Too high! Try a lower number.");
            }
            else {
                System.out.println("Congratulations! You guessed the correct number.");
                System.out.println("The number was: " + randomNumber);
                System.out.println("Total attempts: " + attempts);
            }

        } while (guess != randomNumber);

        System.out.println("\n===== GAME OVER =====");

        sc.close();
    }
}
