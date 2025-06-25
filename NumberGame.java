import java.util.Random;
import java.util.Scanner;

public class NumberGame {
   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int Min = 1;
        int Max = 100;
        int Attempts = 5;
        int Points = 0;
        
        System.out.println("Happy To See You Here\n");
        System.out.println("Welcome to the GAME");
        boolean playAgain = true;
        
        while (playAgain) {
            int targetNumber = random.nextInt(Max + Min + 1) + Min;
            System.out.printf("NumberRange: %d to %d\n",Min, Max);
            System.out.println("You have " + Attempts + " attempts.\n");
            
            int attempts = 0;
            boolean guessedCorrectly = false;
            
            while (attempts < Attempts) {
                System.out.print("Enter your number: ");
                int userGuess = scanner.nextInt();
                
                attempts++;
                
                if (userGuess == targetNumber) {
                    System.out.printf("Correct! You guessed the number in %d attempts.\n", attempts);
                    Points += attempts;
                    guessedCorrectly = true;
                    break;
                } else if (userGuess < targetNumber) {
                    System.out.println("Too low! Try again.\n");
                } else {
                    System.out.println("Too high! Try again.\n");
                }
            }
            
            if (!guessedCorrectly) {
                System.out.println("Sorry, your attempts are over.\n" +"**** The correct number was " + targetNumber+" ****");
            }
            System.out.println("=========================");
            System.out.println("Your final score: " + Points + "\n");
            
            System.out.print("Do you want to play another round? (yes/no): ");
            String playAgainResponse = scanner.next().toLowerCase();
            if (!playAgainResponse.equals("yes")) {
                playAgain = false;
            }
        }
        
        System.out.println("Thank you for playing! Your final score: " + Points);
        
        scanner.close();
    }
}
