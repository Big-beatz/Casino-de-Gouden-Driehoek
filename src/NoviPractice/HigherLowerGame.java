package NoviPractice;

 import java.util.Random;
 import java.util.Scanner;

    public class HigherLowerGame {
        private Scanner inputScanner;
        private boolean gameIsRunning;
        //Consructor
        public HigherLowerGame(Scanner inputScanner) {
            this.inputScanner = inputScanner;
        }

        public void playGame() {
            gameIsRunning = true;

            // Here you should generate the number to guess
            Random winningNumber = new Random();
            int upperbound = 101;
            int randomWinningnumber = winningNumber.nextInt(upperbound);
//            System.out.println("Het winnende nummer is " + randomWinningnumber);
            int amountOfTurns = 0;

            while (gameIsRunning) {
                System.out.println("Make a guess");

                var input = inputScanner.nextInt();
                System.out.println("You typed: " + input);

                if (input < randomWinningnumber){
                    amountOfTurns++;
                    System.out.println("That number is too low!");
                } else if (input > randomWinningnumber){
                    amountOfTurns++;
                    System.out.println("That number is too high");
                }else if (input == randomWinningnumber){
                    amountOfTurns++;
                    gameIsRunning = false;
                    System.out.println("Correct! You guessed the number in " + amountOfTurns +" turns");
                }


                // Check if the guess is correct, if so end the game
            }
        }
    }