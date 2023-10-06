package Lab4_CardsGame.ofCards;

import java.util.Arrays;
import java.util.Scanner;

public class GameDemo {
    public static void main(String[] args) {

        /*Enum Rank and Suit:
        for (Suit s: Suit.values()){
            for (Rank r: Rank.values()) {
                System.out.println(r + " of " + s);
                //System.out.println(s);
            }
        }*/

        //class Card:
        //Card c1 = new Card(Suit.HEARTS, Rank.FOUR);
        //System.out.println(c1);
        //Card c2 = new Card(Suit.SPADES, Rank.ACE);
        //System.out.println(c2);
        //System.out.println(c2.getValue());
        //System.out.println(c2.getSuit());
        //System.out.println(c2.getRank());

        //class Deck:
        //Deck d1 = new Deck();
        //for(Deck d: d1.)
        //System.out.println(d1.getCards().toString());
        //System.out.println(d1.dealCard());

        //class Hand:
        /*Hand h1 = new Hand();
        int x =5;
        Card c1 = new Card(Suit.HEARTS, Rank.FOUR);
        Card c2 = new Card(Suit.SPADES, Rank.ACE);
        for (int i = 0; i < x; i++){
            h1.addCard(c2);
            h1.addCard(c1);
            System.out.println(h1.playCards(i));
        }
        System.out.println(h1.getCards());//prints address*/

        //class Game:
        //Game g1 = new Game(4);
        //g1.dealInitialCards();
        //int[] i = {0,1,2,3,4};
        //System.out.println(g1.playRound(i));
        //System.out.println(g1.getPlayersHand());

        final int num = 4;
        Game game = new Game(num);
        game.dealInitialCards();

        Scanner sc = new Scanner(System.in);
        for (int round = 1; round <= 5; round++){
            int[] cardIndices = new int[num];
            System.out.println("Round " + round);
            for (int i = 0; i < num; i++){
                System.out.println("Player " + (i + 1) + "'s turn:" );
                System.out.println(Arrays.toString(game.getPlayersHand()[i].getCards()));
                System.out.println("Select a card index (0-based) to play: ");
                cardIndices[i] = sc.nextInt();
            }
            int winner = game.playRound(cardIndices);
            if(winner == -1){
                System.out.println("The round was a draw!");
            }else{
                System.out.println("Player " + (winner + 1) + " wins the round!");
            }
        }
        sc.close();

        /*final int NUM_PLAYERS = 4;
        Game game = new Game(NUM_PLAYERS);
        game.dealInitialCards();

        Scanner scanner = new Scanner(System.in);
        for (int round = 1; round <= 5; round++) {
            int[] cardIndices = new int[NUM_PLAYERS];
            System.out.println("Round " + round);
            for (int i = 0; i < NUM_PLAYERS; i++) {
                System.out.println("Player " + (i + 1) + "'s turn:");
                System.out.println(Arrays.toString(game.getPlayersHand()[i].getCards()));
                System.out.print("Select a card index (0-based) to play: ");
                cardIndices[i] = scanner.nextInt();
            }
            int winner = game.playRound(cardIndices);
            if (winner == -1) {
                System.out.println("The round was a draw!");
            } else {
                System.out.println("Player " + (winner + 1) + " wins the round!");
            }
        }
        scanner.close();*/

    }
}
