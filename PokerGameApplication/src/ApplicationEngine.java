import java.util.Scanner;

/**
 * ApplicationEngine.java
 * Purpose: a game loading engine.
 *
 * @author Xing Wei
 * @version 1.0 1/20/2020
 * @version 2.0 1/23/2020
 * @copyright real_xw
 * ----------------------------------------- All rights reserved. ------------------------------------------------------
 */
public class ApplicationEngine {

    /**
     * The running engine of the application system.
     *
     * @since 1.0
     * @param args not used.
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("##############################################################################################");
        System.out.println("####################### Welcome to Self-select Card Game! ####################################");
        System.out.println("##############################################################################################");
        System.out.println("### Please select your game mode: ############################################################");
        System.out.println("### Dou Di Zhu (1) ### Texas Hold'em (2) ### Slap (3) ### Quit (Q) ###########################");
        String userChoice = s.nextLine();
        System.out.println("##############################################################################################");
        switch (userChoice) {
            case "1" :
                System.out.println("### Sorry, this game mode is temporarily unavailable. ########################################");
                System.out.println("##############################################################################################");
                break;
            case "2" :
                System.out.println("### Sorry, this game mode is temporarily unavailable. ########################################");
                System.out.println("##############################################################################################");
                break;
            case "3" :
                Game test = new Game(3);
                test.run();
                System.out.println("################################ Thank you for playing! ######################################");
                System.out.println("##############################################################################################");
                break;
            case "Q" :
                System.out.println("################################ Thank you for playing! ######################################");
                System.out.println("##############################################################################################");
                break;
        }
    }
}
