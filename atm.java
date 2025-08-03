//WRITING THIS CODE AS PRACTISE TO MAKE A ATM MACHINE
import java.util.Scanner;

public class atm {
    static Scanner scanner = new Scanner(System.in);
    public static void main (String[] args){
        double balance=0;
        System.out.println("THIS IS A ATM MACHINE");
        System.out.println("choose 1.withdraw");
        System.out.println(" 2.deposit");
        System.out.println("3.exit");
        int n= scanner.nextInt();

        switch (n) {
            case 1 ->System.out.println( withdraw(balance));
            case 2 ->System.out.println( deposit(balance));
    }
    scanner.close();

}
    static double withdraw(double balance){
        System.out.println("how much amout do u wanna take out");
        double amt = scanner.nextDouble();
        if(amt>balance){
            System.out.println("insufficient balance plz check amount");
        }
        else{
            System.out.println("now available balance is:");
            return (balance-amt);
        }
        return 0;
        
    }

    static double  deposit(double balance){
        System.out.println("how much amount do you wanna deposit");
        double amt2=scanner.nextDouble();
        if(amt2<0){
            System.out.println("cannot add negative amount plz check");
        }
        else{
            System.out.println("now available balance is:");
            return (balance+amt2);
        }
        return 0;
        
    }
    
}

