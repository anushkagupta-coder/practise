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
        computerchoice=choices[random.nextInt(3)];
        System.out.println("computer choice is:" + computerchoice);
        
        if(playerchoice.equals(computerchoice)) {
            System.out.println("tie");
        }
        else if((playerchoice.equals("rock")&& computerchoice.equals("scissors")) ||
                (playerchoice.equals("paper") &&computerchoice.equals("rock")) || 
                playerchoice.equals("scissors") &&computerchoice.equals("paper")){
            System.out.println("you win");
        }
        else{
            System.out.println("you lose!!");
        }

        scanner.close();
    }
}
