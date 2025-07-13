
import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        double num1;
        double num2;
        char operator;
        double result=0;

        Scanner scanner= new Scanner (System.in);
        System.out.println("enter first num");
        num1=scanner.nextDouble();

        System.out.println("enter operator (+,-,*,/)");
        operator=scanner.next().charAt(0);

        System.out.println("enter 2nd num");
        num2=scanner.nextDouble();

        switch(operator){
            case '+'->result=num1+num2;
            case '-'->result=num1-num2;
            case '*'->result=num1*num2;
            case '/'->result=num1/num2;

        }

        System.out.println(result);
        scanner.close();
    }
    
}
