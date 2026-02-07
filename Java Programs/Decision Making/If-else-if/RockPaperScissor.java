// Rock Paper Scissors game using if-else
import java.util.Scanner;

class RockPaperScissor {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("======== WELCOME ========");
        System.out.println("Enter your choice:");
        System.out.println("1. Rock\n2. Paper\n3. Scissor");

        int dgtUser = sc.nextInt();
        String user = "";

        // User Implementation
        if (dgtUser == 1)
            user = "ROCK";
        else if (dgtUser == 2)
            user = "PAPER";
        else if (dgtUser == 3)
            user = "SCISSOR";
        else {
            System.out.println("Invalid Response");
            return;
        }

        // Bot Implementation
        int dgtBot = (int)(Math.random() * 3) + 1;
        String bot = "";

        if (dgtBot == 1)
            bot = "ROCK";
        else if (dgtBot == 2)
            bot = "PAPER";
        else
            bot = "SCISSOR";

        System.out.printf("%n%10s %10s%n", "BOT", "USER");
        System.out.printf("%10s %10s%n", bot, user);

        // Calculate Winner 
        if (bot.equals("ROCK") && user.equals("PAPER") ||
            bot.equals("PAPER") && user.equals("SCISSOR") ||
            bot.equals("SCISSOR") && user.equals("ROCK")) {

            System.out.println("\n******** USER WON ********");

        } else if (bot.equals("ROCK") && user.equals("SCISSOR") ||
                   bot.equals("PAPER") && user.equals("ROCK") ||
                   bot.equals("SCISSOR") && user.equals("PAPER")) {

            System.out.println("\n******** BOT WON ********");

        } else {
            System.out.println("\n******** IT'S A DRAW ********");
        }
    }
}
