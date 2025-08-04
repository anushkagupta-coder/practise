
import java.rmi.MarshalException;
import java.util.Scanner;

public class studentgrade{
    static Scanner scanner = new Scanner(System.in);
    public static void main (String[] args){
        int[] marks=new int[3];
        double avg;
        double total;
        char grade;
        String name;
    }
    static void get(String name,double marks){
        System.out.println("enter name of student");
        name=scanner.nextLine();
        System.out.println("enter marks of 3 subjects");
        for (int i = 0; i < 3; i++) {
            System.out.println("subject"+i+1+":");
            marks[i]=scanner.nextInt();
        }

    }
    static void calculate(double avg,double total,char grade){
        total=0;
        for(int mark :marks){
            total+=mark;
        }
        avg=total/3;
        
        if(avg>70){
            System.out.println("Grade:A");
        }
        else if(avg<70 && avg>40){
            System.out.println("grade:B");
        }
        else{
            System.out.println("FAIL");
        }


    }
    static void display(String name, char grade,double total,double avg){
        System.out.println("name of student is:  "+name);
        System.out.println("total marks are: "+total);
        System.out.println("avg is: "+avg);
        System.out.println("grade is: "+grade);
    }
}