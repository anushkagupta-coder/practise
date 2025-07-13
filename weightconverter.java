import java.util.Scanner;
public class weightconverter{
    public static void main (String[] args){
        Scanner scanner =new Scanner(System.in);
        double weight;
        double newweight;
        int choice;

        System.out.println("WELCOME TO WEIGHT CONVERTER");
        System.out.println("enter the weight");
        weight=scanner.nextDouble();

        System.out.println("choose an option:1.convert to lbs");
        System.out.println("2.convert to kgs");
        choice=scanner.nextInt();

        switch(choice){
            case 1 -> {newweight=weight*0.453592;
            System.out.println("weight in lbs is" + newweight);}
            
            case 2 -> {newweight=weight*2.20462;
            System.out.println("weight in kgs is"+newweight);}
        }


        scanner.close();
    }
}