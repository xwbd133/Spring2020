import java.util.Random;

/**
 * Card.java
 * Purpose: a single card.
 *
 * @author Xing Wei
 * @version 1.0 1/12/2020
 * @version 2.0 1/19/2020
 * @version 2.1 1/20/2020
 * @version 3.0 1/23/2020
 * @copyright real_xw
 * ----------------------------------------- All rights reserved. ------------------------------------------------------
 */
public class Card {

    /**
     * Constructor to tell the general index position of the Card (1 - 54).
     *
     * @since 1.0
     */
    int index;

    /**
     * Constructor to tell the count value of the Card (A, 2, 3, 4, 5, 6, 7, 8, 9, X, J, Q, K, M, N).
     *
     * @since 1.0
     */
    char count;

    /**
     * Constructor to tell the suit of the Card (C, D, H, S, W).
     *
     * @since 1.0
     */
    char suit;

    /**
     * Constructor to tell the numeric order of the count value of a given Card (1 - 13).
     *
     * @since 2.0
     */
    int countNumber;

    /**
     * Public constructor to initiate a new random Card.
     *
     * @since 1.0
     */
    public Card() {
        Random r = new Random();
        this.index = r.nextInt(54) + 1;
        switch (index) {
            case 1 : this.suit = 'C'; this.count = 'A'; break;
            case 2 : this.suit = 'C'; this.count = '2'; break;
            case 3 : this.suit = 'C'; this.count = '3'; break;
            case 4 : this.suit = 'C'; this.count = '4'; break;
            case 5 : this.suit = 'C'; this.count = '5'; break;
            case 6 : this.suit = 'C'; this.count = '6'; break;
            case 7 : this.suit = 'C'; this.count = '7'; break;
            case 8 : this.suit = 'C'; this.count = '8'; break;
            case 9 : this.suit = 'C'; this.count = '9'; break;
            case 10 : this.suit = 'C'; this.count = 'X'; break;
            case 11 : this.suit = 'C'; this.count = 'J'; break;
            case 12 : this.suit = 'C'; this.count = 'Q'; break;
            case 13 : this.suit = 'C'; this.count = 'K'; break;
            case 14 : this.suit = 'D'; this.count = 'A'; break;
            case 15 : this.suit = 'D'; this.count = '2'; break;
            case 16 : this.suit = 'D'; this.count = '3'; break;
            case 17 : this.suit = 'D'; this.count = '4'; break;
            case 18 : this.suit = 'D'; this.count = '5'; break;
            case 19 : this.suit = 'D'; this.count = '6'; break;
            case 20 : this.suit = 'D'; this.count = '7'; break;
            case 21 : this.suit = 'D'; this.count = '8'; break;
            case 22 : this.suit = 'D'; this.count = '9'; break;
            case 23 : this.suit = 'D'; this.count = 'X'; break;
            case 24 : this.suit = 'D'; this.count = 'J'; break;
            case 25 : this.suit = 'D'; this.count = 'Q'; break;
            case 26 : this.suit = 'D'; this.count = 'K'; break;
            case 27 : this.suit = 'H'; this.count = 'A'; break;
            case 28 : this.suit = 'H'; this.count = '2'; break;
            case 29 : this.suit = 'H'; this.count = '3'; break;
            case 30 : this.suit = 'H'; this.count = '4'; break;
            case 31 : this.suit = 'H'; this.count = '5'; break;
            case 32 : this.suit = 'H'; this.count = '6'; break;
            case 33 : this.suit = 'H'; this.count = '7'; break;
            case 34 : this.suit = 'H'; this.count = '8'; break;
            case 35 : this.suit = 'H'; this.count = '9'; break;
            case 36 : this.suit = 'H'; this.count = 'X'; break;
            case 37 : this.suit = 'H'; this.count = 'J'; break;
            case 38 : this.suit = 'H'; this.count = 'Q'; break;
            case 39 : this.suit = 'H'; this.count = 'K'; break;
            case 40 : this.suit = 'S'; this.count = 'A'; break;
            case 41 : this.suit = 'S'; this.count = '2'; break;
            case 42 : this.suit = 'S'; this.count = '3'; break;
            case 43 : this.suit = 'S'; this.count = '4'; break;
            case 44 : this.suit = 'S'; this.count = '5'; break;
            case 45 : this.suit = 'S'; this.count = '6'; break;
            case 46 : this.suit = 'S'; this.count = '7'; break;
            case 47 : this.suit = 'S'; this.count = '8'; break;
            case 48 : this.suit = 'S'; this.count = '9'; break;
            case 49 : this.suit = 'S'; this.count = 'X'; break;
            case 50 : this.suit = 'S'; this.count = 'J'; break;
            case 51 : this.suit = 'S'; this.count = 'Q'; break;
            case 52 : this.suit = 'S'; this.count = 'K'; break;
            case 53 : this.suit = 'W'; this.count = 'M'; break;
            case 54 : this.suit = 'W'; this.count = 'N'; break;
        }
    }

    /**
     * Public constructor to initiate a new Card with given index.
     *
     * @since 1.0
     * @param index The standard stack number of a Poker card.
     */
    public Card(int index) {
        this.index = index;
        switch (index) {
            case 1 : this.suit = 'C'; this.count = 'A'; break;
            case 2 : this.suit = 'C'; this.count = '2'; break;
            case 3 : this.suit = 'C'; this.count = '3'; break;
            case 4 : this.suit = 'C'; this.count = '4'; break;
            case 5 : this.suit = 'C'; this.count = '5'; break;
            case 6 : this.suit = 'C'; this.count = '6'; break;
            case 7 : this.suit = 'C'; this.count = '7'; break;
            case 8 : this.suit = 'C'; this.count = '8'; break;
            case 9 : this.suit = 'C'; this.count = '9'; break;
            case 10 : this.suit = 'C'; this.count = 'X'; break;
            case 11 : this.suit = 'C'; this.count = 'J'; break;
            case 12 : this.suit = 'C'; this.count = 'Q'; break;
            case 13 : this.suit = 'C'; this.count = 'K'; break;
            case 14 : this.suit = 'D'; this.count = 'A'; break;
            case 15 : this.suit = 'D'; this.count = '2'; break;
            case 16 : this.suit = 'D'; this.count = '3'; break;
            case 17 : this.suit = 'D'; this.count = '4'; break;
            case 18 : this.suit = 'D'; this.count = '5'; break;
            case 19 : this.suit = 'D'; this.count = '6'; break;
            case 20 : this.suit = 'D'; this.count = '7'; break;
            case 21 : this.suit = 'D'; this.count = '8'; break;
            case 22 : this.suit = 'D'; this.count = '9'; break;
            case 23 : this.suit = 'D'; this.count = 'X'; break;
            case 24 : this.suit = 'D'; this.count = 'J'; break;
            case 25 : this.suit = 'D'; this.count = 'Q'; break;
            case 26 : this.suit = 'D'; this.count = 'K'; break;
            case 27 : this.suit = 'H'; this.count = 'A'; break;
            case 28 : this.suit = 'H'; this.count = '2'; break;
            case 29 : this.suit = 'H'; this.count = '3'; break;
            case 30 : this.suit = 'H'; this.count = '4'; break;
            case 31 : this.suit = 'H'; this.count = '5'; break;
            case 32 : this.suit = 'H'; this.count = '6'; break;
            case 33 : this.suit = 'H'; this.count = '7'; break;
            case 34 : this.suit = 'H'; this.count = '8'; break;
            case 35 : this.suit = 'H'; this.count = '9'; break;
            case 36 : this.suit = 'H'; this.count = 'X'; break;
            case 37 : this.suit = 'H'; this.count = 'J'; break;
            case 38 : this.suit = 'H'; this.count = 'Q'; break;
            case 39 : this.suit = 'H'; this.count = 'K'; break;
            case 40 : this.suit = 'S'; this.count = 'A'; break;
            case 41 : this.suit = 'S'; this.count = '2'; break;
            case 42 : this.suit = 'S'; this.count = '3'; break;
            case 43 : this.suit = 'S'; this.count = '4'; break;
            case 44 : this.suit = 'S'; this.count = '5'; break;
            case 45 : this.suit = 'S'; this.count = '6'; break;
            case 46 : this.suit = 'S'; this.count = '7'; break;
            case 47 : this.suit = 'S'; this.count = '8'; break;
            case 48 : this.suit = 'S'; this.count = '9'; break;
            case 49 : this.suit = 'S'; this.count = 'X'; break;
            case 50 : this.suit = 'S'; this.count = 'J'; break;
            case 51 : this.suit = 'S'; this.count = 'Q'; break;
            case 52 : this.suit = 'S'; this.count = 'K'; break;
            case 53 : this.suit = 'W'; this.count = 'M'; break;
            case 54 : this.suit = 'W'; this.count = 'N'; break;
        }
    }

    /**
     * Assigning a count number to a Card.
     *
     * @since 2.0
     * @param countNumber The numerical order of the count value.
     */
    public void assign(int countNumber) {
        this.countNumber = countNumber;
    }

    /**
     * Determines whether the two Cards are of equal game value.
     *
     * @since 2.1
     * @param c The comparing Card.
     * @return A boolean value.
     */
    public boolean equalValue(Card c) {
        return this.countNumber == c.countNumber;
    }

    /**
     * Determines whether the given Card has greater game value than the comparing Card.
     *
     * @since 3.0
     * @param c The comparing Card.
     * @return A boolean value.
     */
    public boolean greaterThan(Card c) {
        if (this.suit != 'W' && c.suit != 'W') {
            return this.countNumber > c.countNumber;
        } else if (this.suit == 'W' && c.suit != 'W') {
            return true;
        } else if (this.suit != 'W' && c.suit == 'W') {
            return false;
        } else if (this.suit == 'W' && c.suit == 'W') {
            if (this.count == 'M' && c.count == 'N') {
                return false;
            } else return this.count == 'N' && c.count == 'M';
        }
        return false;
    }

    /**
     * Print the given Card.
     *
     * @since 1.0
     */
    public void display() {
        switch (this.index) {
            case 1 : System.out.print("♣A "); break;
            case 2 : System.out.print("♣2 "); break;
            case 3 : System.out.print("♣3 "); break;
            case 4 : System.out.print("♣4 "); break;
            case 5 : System.out.print("♣5 "); break;
            case 6 : System.out.print("♣6 "); break;
            case 7 : System.out.print("♣7 "); break;
            case 8 : System.out.print("♣8 "); break;
            case 9 : System.out.print("♣9 "); break;
            case 10 : System.out.print("♣10 "); break;
            case 11 : System.out.print("♣J "); break;
            case 12 : System.out.print("♣Q "); break;
            case 13 : System.out.print("♣K "); break;
            case 14 : System.out.print("♦A "); break;
            case 15 : System.out.print("♦2 "); break;
            case 16 : System.out.print("♦3 "); break;
            case 17 : System.out.print("♦4 "); break;
            case 18 : System.out.print("♦5 "); break;
            case 19 : System.out.print("♦6 "); break;
            case 20 : System.out.print("♦7 "); break;
            case 21 : System.out.print("♦8 "); break;
            case 22 : System.out.print("♦9 "); break;
            case 23 : System.out.print("♦10 "); break;
            case 24 : System.out.print("♦J "); break;
            case 25 : System.out.print("♦Q "); break;
            case 26 : System.out.print("♦K "); break;
            case 27 : System.out.print("♥A "); break;
            case 28 : System.out.print("♥2 "); break;
            case 29 : System.out.print("♥3 "); break;
            case 30 : System.out.print("♥4 "); break;
            case 31 : System.out.print("♥5 "); break;
            case 32 : System.out.print("♥6 "); break;
            case 33 : System.out.print("♥7 "); break;
            case 34 : System.out.print("♥8 "); break;
            case 35 : System.out.print("♥9 "); break;
            case 36 : System.out.print("♥10 "); break;
            case 37 : System.out.print("♥J "); break;
            case 38 : System.out.print("♥Q "); break;
            case 39 : System.out.print("♥K "); break;
            case 40 : System.out.print("♠A "); break;
            case 41 : System.out.print("♠2 "); break;
            case 42 : System.out.print("♠3 "); break;
            case 43 : System.out.print("♠4 "); break;
            case 44 : System.out.print("♠5 "); break;
            case 45 : System.out.print("♠6 "); break;
            case 46 : System.out.print("♠7 "); break;
            case 47 : System.out.print("♠8 "); break;
            case 48 : System.out.print("♠9 "); break;
            case 49 : System.out.print("♠10 "); break;
            case 50 : System.out.print("♠J "); break;
            case 51 : System.out.print("♠Q "); break;
            case 52 : System.out.print("♠K "); break;
            case 53 : System.out.print("小王 "); break;
            case 54 : System.out.print("大王 "); break;
        }
    }
}
