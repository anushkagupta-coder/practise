//WRITING THIS CODE AS PRACTISE TO MAKE A ATM MACHINE
import java.util.Scanner;

public class atm {
    static Scanner scanner = new Scanner(System.in);
    public static void main (String[] args){
        double balance=0;
        boolean isrunning=true;
        while(isrunning){
        System.out.println("THIS IS A ATM MACHINE");
        System.out.println("choose 1.withdraw");
        System.out.println(" 2.deposit");
        System.out.println("3.exit");
        int n= scanner.nextInt();

        switch (n) {
            case 1 ->balance = withdraw(balance);
            case 2 ->balance = deposit(balance);
            case 3 ->isrunning=false;
            
    }}
    scanner.close();

}
    static double withdraw(double balance){
        System.out.println("how much amout do u wanna take out");
        double amt = scanner.nextDouble();
        if(amt>balance){
            System.out.println("insufficient balance plz check amount");
            return balance;
        }
        else{
            balance=balance-amt;
            System.out.println("deducted succesfully current balance is:"+balance);
           
        }
        return balance;
        
        
    }

    static double  deposit(double balance){
        System.out.println("how much amount do you wanna deposit");
        double amt2=scanner.nextDouble();
        if(amt2<0){
            System.out.println("cannot add negative amount plz check");
        }
        else{
            balance = balance+amt2;
            System.out.println("amount added succesfully current balance is:"+balance);
        }
        return balance;
        
        
    }
    
}

