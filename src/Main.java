import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String moveA, moveB, playAgain;

        do {
            do {
                System.out.print("Move A, please enter your move (R, P, S): ");
                moveA = scanner.nextLine().trim().toUpperCase();
            } while (!moveA.equals("R") && !moveA.equals("P") && !moveA.equals("S"));

            do {
                System.out.print("Move B, please enter your move (R, P, S): ");
                moveB = scanner.nextLine().trim().toUpperCase();
                if (!moveB.equals("R") && !moveB.equals("P") && !moveB.equals("S")) {
                    System.out.println("You have made an invalid move! Please enter R, P, or S.");
                }
            } while (!moveB.equals("R") && !moveB.equals("P") && !moveB.equals("S"));

            if (moveA.equals(moveB)) {
                System.out.println(moveA + " vs " + moveB + " it's a Tie!");
            } else if (moveA.equals("R") && moveB.equals("S")) {
                System.out.println("Rock breaks Scissors. Move A wins!");
            } else if (moveA.equals("P") && moveB.equals("R")) {
                System.out.println("Paper covers Rock. Move A wins!");
            } else if (moveA.equals("S") && moveB.equals("P")) {
                System.out.println("Scissors cuts Paper. Move A wins!");
            } else if (moveB.equals("R") && moveA.equals("S")) {
                System.out.println("Rock breaks Scissors. Move B wins!");
            } else if (moveB.equals("P") && moveA.equals("R")) {
                System.out.println("Paper covers Rock. Move B wins!");
            } else if (moveB.equals("S") && moveA.equals("P")) {
                System.out.println("Scissors cuts Paper. Move B wins!");
            }

            System.out.print("Would you like to play again? (Y/N): ");
            playAgain = scanner.nextLine().trim().toUpperCase();

        } while (playAgain.equals("Y"));

        System.out.println("Thank you so much for playing!");
        scanner.close();
    }
}

