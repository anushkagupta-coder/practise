import java.util.Scanner;
public class bank {
    static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
        

        double balance=10;
        boolean isrunning=true;
        int choice;
        while(isrunning){}
        System.out.println("BANKING SYSTEM");
        System.out.println("1.Show Balance "+" "+ "2.Deposit" +"3.Withdraw"+"4.Exit");
        System.out.println("enter your choice:");
        choice = scanner.nextInt();

        switch(choice){
            case 1 -> showBalance(balance);
            case 2-> balance=balance+deposit();
            case 3-> System.out.println("withdraw");
            case 4-> isrunning=false;
            default ->System.out.println("invalid choice");
        }
        scanner.close();
    }
        static void showBalance(double balance){
                System.out.println("$"+balance);
        }

        static double deposit(){
            double amount;
            System.out.println("enter amount to deposit");
            amount=scanner.nextDouble();
            if (amount<0) {
                System.out.println("amount cant be -ve");
                return 0;
            }
            else{
                return amount;
            }
            
        }
    }
  
