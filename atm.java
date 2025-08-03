//WRITING THIS CODE AS PRACTISE TO MAKE A ATM MACHINE
import java.util.Scanner;
public class atm {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        int bal=0;
        System.out.println("THIS IS A ATM MACHINE");
        System.out.println("choose 1.withdraw");
        System.out.println("choose 2.deposit");
        System.out.println("choose 3.exit");
        int n= Scanner.nextInt();

        switch (n) {
            case 1->withdraw();
            case 2->deposit();
    }
    

}
    static int withdraw(int amt){
        System.out.println("how much amout do u wanna take out");
        amt = Scanner.nextInt();
        System.out.println("now available balance is:");
        return (bal-amt);
    }

    static int deposit(int amt2){
        System.out.println("how much amount do you wanna deposit");
        amt2=Scanner.nextInt();
        return (bal+deposit)
    }
}

