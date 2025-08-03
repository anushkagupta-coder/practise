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
            case 1 ->balance = withdraw(balance,amt);
            case 2 ->balance = deposit(balance,amt2);
            case 3->System.out.println("thank you for using this");
    }
    scanner.close();

}
    static double withdraw(double balance,double amt){
        System.out.println("how much amout do u wanna take out");
        double amt = scanner.nextDouble();
        if(amt>balance){
            System.out.println("insufficient balance plz check amount");
            return 0;
        }
        else{
            balance=balance-amt;
            System.out.println("deducted succesfully current balance is:");
           
        }
        return balance;
        
        
    }

    static double  deposit(double balance,double amt2){
        System.out.println("how much amount do you wanna deposit");
        double amt2=scanner.nextDouble();
        if(amt2<0){
            System.out.println("cannot add negative amount plz check");
        }
        else{
            balance = balance+amt2;
            System.out.println("amount added succesfully current balance is:");
        }
        return balance;
        
        
    }
    
}

