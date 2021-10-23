package NoviPractice;
import NoviPractice.Blackjack.BlackJackGame;

import java.util.Scanner;




public class Main {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        BlackJackGame game = new BlackJackGame(inputScanner);
        game.playGame();
    }
}