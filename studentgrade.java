
import java.rmi.MarshalException;
import java.util.Scanner;

public class studentgrade{
    static Scanner scanner = new Scanner(System.in);
    public static void main (String[] args){
        double[] marks=new double[3];
        double avg;
        double total;
        char grade;
        String name;
    }
    static void get(String name,double marks){
        System.out.println("enter name of student");
        name=scanner.nextLine();
        
        for (int i = 0; i < 3; i++) {
            System.out.println("enter marks of 3 subjects");
            marks[i]=scanner.nextDouble();
        }

    }
    static void calculate(double avg,double total){


    }
    static void display(double total,double avg){
        System.out.println("total marks are: "+total);
        System.out.println("total marks are: "+total);
        System.out.println("avg is: "+avg);
        System.out.println("grade is: "+grade);
    }
}