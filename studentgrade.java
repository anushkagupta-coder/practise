import java.util.Scanner;

public class studentgrade{
    static Scanner scanner = new Scanner(System.in);
    public static void main (String[] args){
        
        System.out.print("How many students? ");
        int n = scanner.nextInt();
        scanner.nextLine();
        student[] students = new student[n];

        for(int i=0;i<n;i++){
            System.out.println("enetr details of student"+(i+1));
            students[i]=new student();
            students[i].get();
            students[i].calculate();
        }
        //to display
        System.out.println("\n--- Student Grade Reports ---");
        for (student s : students) {
            s.display();
        }

        scanner.close();
    }



    static public class student{
        int[] marks=new int[3];
        double avg;
        double total;
        char grade;
        String name;
    void get(){
        System.out.println("enter name of student");
        name=scanner.nextLine();
        System.out.println("enter marks of 3 subjects");
        for (int i = 0; i < 3; i++) {
            System.out.println("subject"+(i+1)+":");
            marks[i]=scanner.nextInt();
        }

    }
    void calculate(){
        total=0;
        for(int mark :marks){
            total+=mark;
        }
        avg=total/3;
        
        if(avg>70){
            System.out.println("grade: A");;
        }
        else if(avg<70 && avg>40){
            System.out.println("grade b");
        }
        else{
            System.out.println("fail");
        }


    }
    void display(){
        System.out.println("name of student is:  "+name);
        System.out.println("total marks are: "+total);
        System.out.println("avg is: "+avg);
        System.out.println("grade is: "+grade);
    }
}
}