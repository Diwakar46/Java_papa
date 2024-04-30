import java.util.*;

public class Main {

    int minRange;
    int maxRange;
    int myRandomNumber;
    int noOfGuesses;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Main main = new Main();
        System.out.println("Guess a Number");
        System.out.println("From :");
         main.minRange =  scanner.nextInt();
        System.out.println("to :");
        main.maxRange = scanner.nextInt();
        System.out.println("How many guesses you want to have!!");
        main.noOfGuesses = scanner.nextInt();
        System.out.println(" Good Luck!! .You have "+ main.noOfGuesses+" guesses. Guess your number from Range "+main.minRange + " to " + main.maxRange);
        main.myRandomNumber = NumberGuesser.getRandomNumber( main.minRange,main.maxRange);
        NumberGuesser.Guess(main.myRandomNumber,main.noOfGuesses);
      }
    }
