import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {

         Scanner scanner = new Scanner(System.in);

        while (true) {
            String[] rps = {"r", "p", "s"};
            String computerMove = rps[new Random().nextInt(rps.length)];


            String playerMove;

            while (true) {
                System.out.println("Velg neste trekk (r, p, or s)");
                playerMove = scanner.nextLine();
                if (playerMove.equals("r") || playerMove.equals("p") || playerMove.equals("s")) {
                    break;
                }
                System.out.println(playerMove + " er ikke mulig trekk. ");
            }

            System.out.println("Datamaskinen spiller: " + computerMove);

            if (playerMove.equals(computerMove)) {
                System.out.println("Det ble uavgjort!");
            } else if (playerMove.equals("r")) {
                if (computerMove.equals("p")) {
                    System.out.println("Du tapte!");

                } else if (computerMove.equals("s")) {
                    System.out.println("Du vant!");
                }
            } else if (playerMove.equals("p")) {
                if (computerMove.equals("r")) {
                    System.out.println("Du vant!");

                } else if (computerMove.equals("s")) {
                    System.out.println("Du tapte!");
                }
            } else if (playerMove.equals("s")) {
                if (computerMove.equals("p")) {
                    System.out.println("Du vant!");

                } else if (computerMove.equals("r")) {
                    System.out.println("Du vant!");
                }
            }
            System.out.println(" Spille igjen ? (velg: j/n)");
            String playAgain = scanner.nextLine();

            if (!playAgain.equals("j")){
                break;
            }
        }
    }
}

            ;
