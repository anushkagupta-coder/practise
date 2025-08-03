//WRITING THIS CODE AS PRACTISE TO MAKE A ATM MACHINE
import java.util.Scanner;
public class atm {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        int bal=0;
        System.out.println("THIS IS A ATM MACHINE");
        System.out.println("choose 1.withdraw");
        System.out.println("choose 2.deposit");
        System.out.println("choose 3.check balance");
        System.out.println("choose 4.exit");
        int n= Scanner.nextInt();

        switch (n) {
            case 1->
    }
    static void withdraw(int amt){
        System.out.println("how much amout do u wanna take out");
        amt = Scanner.nextInt();
        return (bal+amt);
    }
}
