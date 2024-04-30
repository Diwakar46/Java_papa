import java.util.Scanner;

public class NumberGuesser {

    static void Guess(int randomNumber,int noOfGuesses){
        Scanner scanner = new Scanner(System.in);
        for(int i = 0 ; i<noOfGuesses ; i++){
            System.out.println("Guesses no "+ (i+1)+" :");
            int guess = scanner.nextInt();
            if(guess> randomNumber){
                System.out.println("Your number "+guess + " is greater than the number !! Come Lower");

            }
            else if(guess< randomNumber){
                System.out.println("Your number "+guess + " is lesser than the number !! Come Higher");
            }
            else  if(guess ==  randomNumber){
                System.out.println("Your guess is correct");
                System.out.println("Congrats!!");
                break;
            }
        }
        System.out.println("The number was :" +randomNumber);

    }
    static int getRandomNumber(int min,int max){
        int randomNumber = (int) (Math.random()*(max - min + 1)) + min;
        return randomNumber;
    }
    }

