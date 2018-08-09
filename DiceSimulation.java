import java.util.*;

public class DiceSimulation {

    private static Random rollDice = new Random();

    public static void main(String[] args) {

        final int ROLLCOUNT = 10000;
        final int SIDES = 6;
        int counter, die1, die2;

        //an array with elements to keep count
        int [] doubleCounts = new int [SIDES];

        // display welcome message. no other purpose but trial
        welcome ();

        /**
         * Set counter to start from 1 and go till desired constant number
         * Rolling two separate dices and storing values in dice1 & dice 2       respectively
         */
        for (counter=1; counter<=ROLLCOUNT;counter++){

            die1=roll(SIDES);
            die2=roll(SIDES);

            if (die1==die2){
                doubleCounts[die1-1]++;
            }

        }

        // Display results totals of paired rolls 
        for (int idx=0; idx<doubleCounts.length; idx++){
            System.out.format(" You rolled set of %d %d times\n",(idx+1), doubleCounts[idx]);
        }
    }
    private static int roll(int sides){
        return rollDice.nextInt(sides) +  1;
    }
    public static void welcome () {
        System.out.println("welcome to dice world!");
    }
}