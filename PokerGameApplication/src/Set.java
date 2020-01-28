import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 * Set.java
 * Purpose: a set of cards.
 *
 * @author Xing Wei
 * @version 1.0 1/12/2020
 * @version 2.0 1/19/2020
 * @version 2.1 1/20/2020
 * @version 3.0 1/23/2020
 * ----------------------------------------- All rights reserved. ------------------------------------------------------
 */
public class Set {

    /**
     * Constructor to tell the list of Cards in the Set.
     *
     * @since 1.0
     */
    ArrayList<Card> set;

    /**
     * Public constructor to initiate a Set with empty Cards.
     */
    public Set() {
        this.set = new ArrayList<>();
    }

    /**
     * Add a given Card to the Set.
     *
     * @since 1.0
     * @param card The given Card.
     */
    public void add(Card card) {
        this.set.add(card);
    }

    /**
     * Remove a given Card from the Set if it exists.
     *
     * @since 2.0
     * @param card The given Card.
     */
    public void remove(Card card) {
        this.set.removeIf(c -> c.suit == card.suit && c.count == card.count);
    }

    /**
     * Clear all Cards in this Set.
     *
     * @since 3.0
     */
    public void clear() {
        this.set = new ArrayList<>();
    }

    /**
     * Initiate a Set of random Cards with given size and given Poker type.
     *
     * @since 2.1
     * @param size The given size of the Set.
     * @param type The given Poker type of the Set.
     */
    public void initiate(int size, String type) {
        Set output = new Set();
        Library tempLib = new Library();
        switch (type) {
            case "type1" : tempLib = new Library(1); break;
            case "type2" : tempLib = new Library(2); break;
            case "type3" : tempLib = new Library(3); break;
        }
        Set range = tempLib.data;
        ArrayList<Integer> indexList = new ArrayList<>();
        for (int i = 0; i < range.set.size(); i++) {
            indexList.add(i, i + 1);
        }
        Random r = new Random();
        Collections.shuffle(indexList, r);
        for (int j = 0; j < size; j++) {
            Card temp = new Card(indexList.get(j));
            output.add(temp);
        }
        this.set = output.set;
    }

    /**
     * Print the Set of Cards.
     *
     * @since 1.0
     */
    public void display() {
        if (this.set.size() != 0) {
            int s = this.set.size();
            for (Card card : this.set) {
                card.display();
            }
            System.out.println();
        } else {
            System.out.println(" ");
        }
    }
}
