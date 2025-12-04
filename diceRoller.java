import java.util.Scanner;
import java.util.Random;

public class diceRoller {
    public static void main (String[]args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        //DECLARE VARIABLES

        int numOfDice;
        int roll;
        int total = 0;

        //ASK FOR INPUT

        System.out.print("Enter the # of dice: ");
        numOfDice = scanner.nextInt();

        if(numOfDice <= 0) {
            while(numOfDice <= 0) {
                    System.out.println("Enter # of dice > 0");
                    System.out.print("Enter the # of dice: ");
                    numOfDice = scanner.nextInt();
            }
        }


        //CALCULATE TOTAL

        else {
            for(int i = 0 ; i<numOfDice; i++) {
                roll = random.nextInt(1,7);
                System.out.println("Roll: "+roll);
                printDie(roll);
                total = total + roll;
            }
        }
        System.out.println("Total: "+ total);

    }

    //DISPLAY ASCII (printDie method)

    static void printDie(int roll) {
        String dice1 = """
                 -------
                |       |        
                |   *   |
                |       |
                 -------
            """;

        String dice2 = """
                 -------
                | *     |        
                |       |
                |     * |
                 -------
            """;

        String dice3 = """
                 -------
                | *     |        
                |   *   |
                |     * |
                 -------
            """;

        String dice4 = """
                 -------
                | *   * |        
                |       |
                | *   * |
                 -------
            """;

        String dice5 = """
                 -------
                | *   * |        
                |   *   |
                | *   * |
                 -------
            """;

        String dice6 = """
                 -------
                | * * * |        
                |       |
                | * * * |
                 -------
            """;


        switch(roll) {
            case 1 -> System.out.println(dice1);
            case 2 -> System.out.println(dice2);
            case 3 -> System.out.println(dice3);
            case 4 -> System.out.println(dice4);
            case 5 -> System.out.println(dice5);
            case 6 -> System.out.println(dice6);
            default -> System.out.println("Invalid roll");
        }

            
    }


}
