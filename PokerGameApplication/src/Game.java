import java.util.Random;
import java.util.Scanner;

/**
 * Game.java
 * Purpose: the set of games.
 *
 * @author Xing Wei
 * @version 1.0 1/12/2020
 * @version 2.0 1/19/2020
 * @version 2.1 1/20/2020
 * @version 3.0 1/23/2020
 * ----------------------------------------- All rights reserved. ------------------------------------------------------
 */
public class Game {

    /**
     * Constructor to tell the numeric number of the poker game.
     *
     * @since 1.0
     */
    int gameNumber;

    /**
     * Public constructor to tell the numeric number of the game.
     *
     * @since 1.0
     * @param gameNumber The numeric number of the game.
     */
    public Game(int gameNumber) {
        this.gameNumber = gameNumber;
    }

    /**
     * Runs the given poker game.
     *
     * @since 3.0
     */
    public void run() {
        switch (this.gameNumber) {
            case 1 : gameDouDiZhu(); break;
            case 2 : gameTexasHoldem(); break;
            case 3 : gameSlap(); break;
        }
    }

    /**
     * The Dou Di Zhu game.
     *
     * @since 2.0
     */
    public void gameDouDiZhu() {
        //todo
    }

    /**
     * The Texas Hold'em game.
     *
     * @since 2.1
     */
    public void gameTexasHoldem() {
        //todo
    }

    /**
     * The Slap game.
     *
     * @since 3.0
     */
    public void gameSlap() {
        System.out.println("##############################################################################################");
        System.out.println("#################### Welcome to Slap. The rules for this game is below: ######################");
        System.out.println("1. There are two players in this game: You and the computer. #################################");
        System.out.println("2. During your turn, you deal the top card in your hand on the deck. #########################");
        System.out.println("3. Roll the dice if the card you just dault has the same count as the first card on the deck. ");
        System.out.println("4. If your number is bigger or equal than computer you get all the card on deck. #############");
        System.out.println("5. If not computer get all the card on deck. #################################################");
        System.out.println("6. Whoever gets all the 52 cards wins the game. ##############################################");
        System.out.println("##############################################################################################");
        Set player = new Set();
        Set computer = new Set();
        Set deck = new Set();
        Library temp1 = new Library(3);
        boolean playerTurn = true, computerTurn = false;
        int turnCount = 1;
        player.initiate(26, "type3");
        for (Card c : player.set) {
            temp1.data.remove(c);
        }
        computer.set = temp1.data.set;
        while (player.set.size() != 0 || computer.set.size() != 0) {
            Scanner s = new Scanner(System.in);
            System.out.println("##############################################################################################");
            System.out.print("### Turn ");
            System.out.print(turnCount);
            System.out.println(" #################################################################################");
            System.out.println("##############################################################################################");
            System.out.println("### Player Cards: ############################################################################");
            player.display();
            System.out.println("##############################################################################################");
            System.out.println("### Computer Cards: ##########################################################################");
            computer.display();
            System.out.println("##############################################################################################");
            System.out.println("### Deck: ####################################################################################");
            deck.display();
            System.out.println("##############################################################################################");
            System.out.println("### Continue? (Y/N) ##########################################################################");
            String decision = s.nextLine();
            System.out.println("##############################################################################################");
            if (decision.equals("N")) {
                break;
            }
            if (deck.set.size() == 0 && playerTurn) {
                Card currCard = player.set.get(0);
                switch (currCard.count) {
                    case 'A' : currCard.assign(1); break;
                    case '2' : currCard.assign(2); break;
                    case '3' : currCard.assign(3); break;
                    case '4' : currCard.assign(4); break;
                    case '5' : currCard.assign(5); break;
                    case '6' : currCard.assign(6); break;
                    case '7' : currCard.assign(7); break;
                    case '8' : currCard.assign(8); break;
                    case '9' : currCard.assign(9); break;
                    case 'X' : currCard.assign(10); break;
                    case 'J' : currCard.assign(11); break;
                    case 'Q' : currCard.assign(12); break;
                    case 'K' : currCard.assign(13); break;
                }
                deck.add(currCard);
                player.remove(currCard);
                playerTurn = false;
                computerTurn = true;
                turnCount++;
            } else if (deck.set.size() == 0 && computerTurn) {
                Card currCard = computer.set.get(0);
                switch (currCard.count) {
                    case 'A' : currCard.assign(1); break;
                    case '2' : currCard.assign(2); break;
                    case '3' : currCard.assign(3); break;
                    case '4' : currCard.assign(4); break;
                    case '5' : currCard.assign(5); break;
                    case '6' : currCard.assign(6); break;
                    case '7' : currCard.assign(7); break;
                    case '8' : currCard.assign(8); break;
                    case '9' : currCard.assign(9); break;
                    case 'X' : currCard.assign(10); break;
                    case 'J' : currCard.assign(11); break;
                    case 'Q' : currCard.assign(12); break;
                    case 'K' : currCard.assign(13); break;
                }
                deck.add(currCard);
                computer.remove(currCard);
                computerTurn = false;
                playerTurn = true;
                turnCount++;
            } else if (deck.set.size() > 0 && playerTurn) {
                Card currCard = player.set.get(0);
                switch (currCard.count) {
                    case 'A' : currCard.assign(1); break;
                    case '2' : currCard.assign(2); break;
                    case '3' : currCard.assign(3); break;
                    case '4' : currCard.assign(4); break;
                    case '5' : currCard.assign(5); break;
                    case '6' : currCard.assign(6); break;
                    case '7' : currCard.assign(7); break;
                    case '8' : currCard.assign(8); break;
                    case '9' : currCard.assign(9); break;
                    case 'X' : currCard.assign(10); break;
                    case 'J' : currCard.assign(11); break;
                    case 'Q' : currCard.assign(12); break;
                    case 'K' : currCard.assign(13); break;
                }
                if (currCard.equalValue(deck.set.get(0))) {
                    Random playerRoll = new Random();
                    Random computerRoll = new Random();
                    int playerChance, computerChance;
                    playerChance = playerRoll.nextInt(6) + 1;
                    computerChance = computerRoll.nextInt(6) + 1;
                    if (playerChance >= computerChance) {
                        deck.add(currCard);
                        player.remove(currCard);
                        player.set.addAll(deck.set);
                        deck.set.clear();
                    } else {
                        deck.add(currCard);
                        player.remove(currCard);
                        computer.set.addAll(deck.set);
                        deck.set.clear();
                    }
                } else {
                    deck.add(currCard);
                    player.remove(currCard);
                }
                playerTurn = false;
                computerTurn = true;
                turnCount++;
            } else if (deck.set.size() > 0 && computerTurn) {
                Card currCard = computer.set.get(0);
                switch (currCard.count) {
                    case 'A' : currCard.assign(1); break;
                    case '2' : currCard.assign(2); break;
                    case '3' : currCard.assign(3); break;
                    case '4' : currCard.assign(4); break;
                    case '5' : currCard.assign(5); break;
                    case '6' : currCard.assign(6); break;
                    case '7' : currCard.assign(7); break;
                    case '8' : currCard.assign(8); break;
                    case '9' : currCard.assign(9); break;
                    case 'X' : currCard.assign(10); break;
                    case 'J' : currCard.assign(11); break;
                    case 'Q' : currCard.assign(12); break;
                    case 'K' : currCard.assign(13); break;
                }
                if (currCard.equalValue(deck.set.get(0))) {
                    Random playerRoll = new Random();
                    Random computerRoll = new Random();
                    int playerChance, computerChance;
                    playerChance = playerRoll.nextInt(6) + 1;
                    computerChance = computerRoll.nextInt(6) + 1;
                    if (playerChance >= computerChance) {
                        deck.add(currCard);
                        computer.remove(currCard);
                        player.set.addAll(deck.set);
                        deck.set.clear();
                    } else {
                        deck.add(currCard);
                        computer.remove(currCard);
                        computer.set.addAll(deck.set);
                        deck.set.clear();
                    }
                } else {
                    deck.add(currCard);
                    computer.remove(currCard);
                }
                computerTurn = false;
                playerTurn = true;
                turnCount++;
            }
        }
        if (player.set.size() == 0) {
            System.out.println("##############################################################################################");
            System.out.println("############################### Congratulations, you win! ####################################");
            System.out.println("##############################################################################################");
        } else if (computer.set.size() == 0) {
            System.out.println("##############################################################################################");
            System.out.println("################################### R.I.P, you lose! #########################################");
            System.out.println("##############################################################################################");
        } else {
            System.out.println("################################# You quitted the game. ######################################");
            System.out.println("##############################################################################################");
        }
    }
}
