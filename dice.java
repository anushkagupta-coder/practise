import java.util.Random;
import java.util.Scanner;
public class dice {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Random random = new Random();
        int numofdice;
        int total=0;

        System.out.println("enter dice to roll");
        numofdice=scanner.nextInt();

        if(numofdice > 0){
            for (int i=0;i<numofdice;i++){
                int roll = random.nextInt(1,7);
                printdie(roll);
                System.out.println("you rolled "+roll);
                total = total + roll;
            }
            System.out.println("total"+ total);
        }
        else{
            System.out.println("must be greater than 0");
        }
    }
    static void printdie(int roll){
        String dice1="""
                -------
                |      |
                |   *  |
                |      |
                -------
                """;
        String dice2="""
                -------
                | *    |
                |   *  |
                |      |
                -------
                """;
        String dice3="""
                -------
                | *    |
                |   *  |
                |     *|
                -------
                """;
        String dice4="""
                -------
                | *   *|
                |      |
                | *   *|
                -------
                """;
        String dice5="""
                -------
                | *   *|
                |   *  |
                | *   *|
                -------
                """;
        String dice6="""
                -------
                | *   *|
                | *   *|
                | *   *|
                -------
                """;
            switch(roll){
                case 1->System.out.print(dice1);
                case 2->System.out.print(dice2);
                case 3->System.out.print(dice3);
                case 4->System.out.print(dice4);
                case 5->System.out.print(dice5);
                case 6->System.out.print(dice6);
                default ->System.out.println("invalid");
        }
    }
}
