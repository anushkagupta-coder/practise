import java.util.Random;
import java.util.Scanner;
public class rockpaper {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Random random= new Random();
        String [] choices ={"rock","paper","scissors"};
        String playerchoice;
        String computerchoice;

        String playagain="yes";

        //declare variables;
        //getchoice fromuser;
        //get random choice for comp;
        //chack win cond;
        //ask to play again;
        //ending msg;

        System.out.println("WELCOME TO ROCK PAPER SCISSORS GAME");
        System.out.println("Enter ur move(rock,paper,scissors)");
        playerchoice=scanner.nextLine().toLowerCase();

        if (!playerchoice.equals("rock")&& 
            !playerchoice.equals("paper")&&
            !playerchoice.equals("scissors")) {
            System.out.println("Invalid choice");
        }
        scanner.close();
    }
}
