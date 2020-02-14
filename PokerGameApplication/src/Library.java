/**
 * Library.java
 * Purpose: a set of cards serving a particular game.
 *
 * @author Xing Wei
 * @version 1.0 1/12/2020
 * @version 2.0 1/19/2020
 * @version 2.1 1/20/2020
 * @version 3.0 1/23/2020
 * @copyright real_xw
 * ----------------------------------------- All rights reserved. ------------------------------------------------------
 */
public class Library {

    /**
     * Constructor to tell the name of the given Library.
     *
     * @since 1.0
     */
    String libraryName;

    /**
     * Constructor to tell the ordered Set of Cards in the Library.
     *
     * @since 1.0
     */
    Set data;

    /**
     * Public constructor to initiate a new empty Library.
     *
     * @since 3.0
     */
    public Library() { }

    /**
     * Public constructor to initiate a new Library with given type.
     *
     * @since 1.0
     * @param type The given type of the Library.
     */
    public Library(int type) {
        switch (type) {
            case 1 : typeDouDiZhu(); break;
            case 2 : typeTexasHoldem(); break;
            case 3 : typeSlap(); break;
        }
    }

    /**
     * Dou Di Zhu game poker hands.
     *
     * @since 2.0
     */
    public void typeDouDiZhu() {
        this.libraryName = "DouDiZhu";
        this.data = new Set();
        this.data.add(new Card(3));
        this.data.add(new Card(4));
        this.data.add(new Card(5));
        this.data.add(new Card(6));
        this.data.add(new Card(7));
        this.data.add(new Card(8));
        this.data.add(new Card(9));
        this.data.add(new Card(10));
        this.data.add(new Card(11));
        this.data.add(new Card(12));
        this.data.add(new Card(13));
        this.data.add(new Card(1));
        this.data.add(new Card(2));
        this.data.add(new Card(16));
        this.data.add(new Card(17));
        this.data.add(new Card(18));
        this.data.add(new Card(19));
        this.data.add(new Card(20));
        this.data.add(new Card(21));
        this.data.add(new Card(22));
        this.data.add(new Card(23));
        this.data.add(new Card(24));
        this.data.add(new Card(25));
        this.data.add(new Card(26));
        this.data.add(new Card(14));
        this.data.add(new Card(15));
        this.data.add(new Card(29));
        this.data.add(new Card(30));
        this.data.add(new Card(31));
        this.data.add(new Card(32));
        this.data.add(new Card(33));
        this.data.add(new Card(34));
        this.data.add(new Card(35));
        this.data.add(new Card(36));
        this.data.add(new Card(37));
        this.data.add(new Card(38));
        this.data.add(new Card(39));
        this.data.add(new Card(27));
        this.data.add(new Card(28));
        this.data.add(new Card(42));
        this.data.add(new Card(43));
        this.data.add(new Card(44));
        this.data.add(new Card(45));
        this.data.add(new Card(46));
        this.data.add(new Card(47));
        this.data.add(new Card(48));
        this.data.add(new Card(49));
        this.data.add(new Card(50));
        this.data.add(new Card(51));
        this.data.add(new Card(52));
        this.data.add(new Card(40));
        this.data.add(new Card(41));
        this.data.add(new Card(53));
        this.data.add(new Card(54));
        this.data.set.get(0).assign(1);
        this.data.set.get(1).assign(2);
        this.data.set.get(2).assign(3);
        this.data.set.get(3).assign(4);
        this.data.set.get(4).assign(5);
        this.data.set.get(5).assign(6);
        this.data.set.get(6).assign(7);
        this.data.set.get(7).assign(8);
        this.data.set.get(8).assign(9);
        this.data.set.get(9).assign(10);
        this.data.set.get(10).assign(11);
        this.data.set.get(11).assign(12);
        this.data.set.get(12).assign(13);
        this.data.set.get(13).assign(1);
        this.data.set.get(14).assign(2);
        this.data.set.get(15).assign(3);
        this.data.set.get(16).assign(4);
        this.data.set.get(17).assign(5);
        this.data.set.get(18).assign(6);
        this.data.set.get(19).assign(7);
        this.data.set.get(20).assign(8);
        this.data.set.get(21).assign(9);
        this.data.set.get(22).assign(10);
        this.data.set.get(23).assign(11);
        this.data.set.get(24).assign(12);
        this.data.set.get(25).assign(13);
        this.data.set.get(26).assign(1);
        this.data.set.get(27).assign(2);
        this.data.set.get(28).assign(3);
        this.data.set.get(29).assign(4);
        this.data.set.get(30).assign(5);
        this.data.set.get(31).assign(6);
        this.data.set.get(32).assign(7);
        this.data.set.get(33).assign(8);
        this.data.set.get(34).assign(9);
        this.data.set.get(35).assign(10);
        this.data.set.get(36).assign(11);
        this.data.set.get(37).assign(12);
        this.data.set.get(38).assign(13);
        this.data.set.get(39).assign(1);
        this.data.set.get(40).assign(2);
        this.data.set.get(41).assign(3);
        this.data.set.get(42).assign(4);
        this.data.set.get(43).assign(5);
        this.data.set.get(44).assign(6);
        this.data.set.get(45).assign(7);
        this.data.set.get(46).assign(8);
        this.data.set.get(47).assign(9);
        this.data.set.get(48).assign(10);
        this.data.set.get(49).assign(11);
        this.data.set.get(50).assign(12);
        this.data.set.get(51).assign(13);
        this.data.set.get(52).assign(14);
        this.data.set.get(53).assign(15);
    }

    /**
     * Texas Hold'em game poker hands.
     *
     * @since 2.1
     */
    public void typeTexasHoldem() {
        this.libraryName = "TexasHoldem";
        this.data = new Set();
        this.data.add(new Card(1));
        this.data.add(new Card(2));
        this.data.add(new Card(3));
        this.data.add(new Card(4));
        this.data.add(new Card(5));
        this.data.add(new Card(6));
        this.data.add(new Card(7));
        this.data.add(new Card(8));
        this.data.add(new Card(9));
        this.data.add(new Card(10));
        this.data.add(new Card(11));
        this.data.add(new Card(12));
        this.data.add(new Card(13));
        this.data.add(new Card(14));
        this.data.add(new Card(15));
        this.data.add(new Card(16));
        this.data.add(new Card(17));
        this.data.add(new Card(18));
        this.data.add(new Card(19));
        this.data.add(new Card(20));
        this.data.add(new Card(21));
        this.data.add(new Card(22));
        this.data.add(new Card(23));
        this.data.add(new Card(24));
        this.data.add(new Card(25));
        this.data.add(new Card(26));
        this.data.add(new Card(27));
        this.data.add(new Card(28));
        this.data.add(new Card(29));
        this.data.add(new Card(30));
        this.data.add(new Card(31));
        this.data.add(new Card(32));
        this.data.add(new Card(33));
        this.data.add(new Card(34));
        this.data.add(new Card(35));
        this.data.add(new Card(36));
        this.data.add(new Card(37));
        this.data.add(new Card(38));
        this.data.add(new Card(39));
        this.data.add(new Card(40));
        this.data.add(new Card(41));
        this.data.add(new Card(42));
        this.data.add(new Card(43));
        this.data.add(new Card(44));
        this.data.add(new Card(45));
        this.data.add(new Card(46));
        this.data.add(new Card(47));
        this.data.add(new Card(48));
        this.data.add(new Card(49));
        this.data.add(new Card(50));
        this.data.add(new Card(51));
        this.data.add(new Card(52));
        this.data.add(new Card(53));
        this.data.add(new Card(54));
        this.data.set.get(0).assign(1);
        this.data.set.get(1).assign(2);
        this.data.set.get(2).assign(3);
        this.data.set.get(3).assign(4);
        this.data.set.get(4).assign(5);
        this.data.set.get(5).assign(6);
        this.data.set.get(6).assign(7);
        this.data.set.get(7).assign(8);
        this.data.set.get(8).assign(9);
        this.data.set.get(9).assign(10);
        this.data.set.get(10).assign(11);
        this.data.set.get(11).assign(12);
        this.data.set.get(12).assign(13);
        this.data.set.get(13).assign(1);
        this.data.set.get(14).assign(2);
        this.data.set.get(15).assign(3);
        this.data.set.get(16).assign(4);
        this.data.set.get(17).assign(5);
        this.data.set.get(18).assign(6);
        this.data.set.get(19).assign(7);
        this.data.set.get(20).assign(8);
        this.data.set.get(21).assign(9);
        this.data.set.get(22).assign(10);
        this.data.set.get(23).assign(11);
        this.data.set.get(24).assign(12);
        this.data.set.get(25).assign(13);
        this.data.set.get(26).assign(1);
        this.data.set.get(27).assign(2);
        this.data.set.get(28).assign(3);
        this.data.set.get(29).assign(4);
        this.data.set.get(30).assign(5);
        this.data.set.get(31).assign(6);
        this.data.set.get(32).assign(7);
        this.data.set.get(33).assign(8);
        this.data.set.get(34).assign(9);
        this.data.set.get(35).assign(10);
        this.data.set.get(36).assign(11);
        this.data.set.get(37).assign(12);
        this.data.set.get(38).assign(13);
        this.data.set.get(39).assign(1);
        this.data.set.get(40).assign(2);
        this.data.set.get(41).assign(3);
        this.data.set.get(42).assign(4);
        this.data.set.get(43).assign(5);
        this.data.set.get(44).assign(6);
        this.data.set.get(45).assign(7);
        this.data.set.get(46).assign(8);
        this.data.set.get(47).assign(9);
        this.data.set.get(48).assign(10);
        this.data.set.get(49).assign(11);
        this.data.set.get(50).assign(12);
        this.data.set.get(51).assign(13);
        this.data.set.get(52).assign(14);
        this.data.set.get(53).assign(15);
    }

    /**
     * Slap game poker hands.
     *
     * @since 3.0
     */
    public void typeSlap() {
        this.libraryName = "Slap";
        this.data = new Set();
        this.data.add(new Card(1));
        this.data.add(new Card(2));
        this.data.add(new Card(3));
        this.data.add(new Card(4));
        this.data.add(new Card(5));
        this.data.add(new Card(6));
        this.data.add(new Card(7));
        this.data.add(new Card(8));
        this.data.add(new Card(9));
        this.data.add(new Card(10));
        this.data.add(new Card(11));
        this.data.add(new Card(12));
        this.data.add(new Card(13));
        this.data.add(new Card(14));
        this.data.add(new Card(15));
        this.data.add(new Card(16));
        this.data.add(new Card(17));
        this.data.add(new Card(18));
        this.data.add(new Card(19));
        this.data.add(new Card(20));
        this.data.add(new Card(21));
        this.data.add(new Card(22));
        this.data.add(new Card(23));
        this.data.add(new Card(24));
        this.data.add(new Card(25));
        this.data.add(new Card(26));
        this.data.add(new Card(27));
        this.data.add(new Card(28));
        this.data.add(new Card(29));
        this.data.add(new Card(30));
        this.data.add(new Card(31));
        this.data.add(new Card(32));
        this.data.add(new Card(33));
        this.data.add(new Card(34));
        this.data.add(new Card(35));
        this.data.add(new Card(36));
        this.data.add(new Card(37));
        this.data.add(new Card(38));
        this.data.add(new Card(39));
        this.data.add(new Card(40));
        this.data.add(new Card(41));
        this.data.add(new Card(42));
        this.data.add(new Card(43));
        this.data.add(new Card(44));
        this.data.add(new Card(45));
        this.data.add(new Card(46));
        this.data.add(new Card(47));
        this.data.add(new Card(48));
        this.data.add(new Card(49));
        this.data.add(new Card(50));
        this.data.add(new Card(51));
        this.data.add(new Card(52));
        this.data.set.get(0).assign(1);
        this.data.set.get(1).assign(2);
        this.data.set.get(2).assign(3);
        this.data.set.get(3).assign(4);
        this.data.set.get(4).assign(5);
        this.data.set.get(5).assign(6);
        this.data.set.get(6).assign(7);
        this.data.set.get(7).assign(8);
        this.data.set.get(8).assign(9);
        this.data.set.get(9).assign(10);
        this.data.set.get(10).assign(11);
        this.data.set.get(11).assign(12);
        this.data.set.get(12).assign(13);
        this.data.set.get(13).assign(1);
        this.data.set.get(14).assign(2);
        this.data.set.get(15).assign(3);
        this.data.set.get(16).assign(4);
        this.data.set.get(17).assign(5);
        this.data.set.get(18).assign(6);
        this.data.set.get(19).assign(7);
        this.data.set.get(20).assign(8);
        this.data.set.get(21).assign(9);
        this.data.set.get(22).assign(10);
        this.data.set.get(23).assign(11);
        this.data.set.get(24).assign(12);
        this.data.set.get(25).assign(13);
        this.data.set.get(26).assign(1);
        this.data.set.get(27).assign(2);
        this.data.set.get(28).assign(3);
        this.data.set.get(29).assign(4);
        this.data.set.get(30).assign(5);
        this.data.set.get(31).assign(6);
        this.data.set.get(32).assign(7);
        this.data.set.get(33).assign(8);
        this.data.set.get(34).assign(9);
        this.data.set.get(35).assign(10);
        this.data.set.get(36).assign(11);
        this.data.set.get(37).assign(12);
        this.data.set.get(38).assign(13);
        this.data.set.get(39).assign(1);
        this.data.set.get(40).assign(2);
        this.data.set.get(41).assign(3);
        this.data.set.get(42).assign(4);
        this.data.set.get(43).assign(5);
        this.data.set.get(44).assign(6);
        this.data.set.get(45).assign(7);
        this.data.set.get(46).assign(8);
        this.data.set.get(47).assign(9);
        this.data.set.get(48).assign(10);
        this.data.set.get(49).assign(11);
        this.data.set.get(50).assign(12);
        this.data.set.get(51).assign(13);
    }
}
