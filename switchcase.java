import java.util.Scanner;
public class switchcase{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the day");
        String day=scanner.nextLine();

        switch(day){
            case "monday","tuesday","wednesday","thursday","friday"->
            System.out.println("it is a weekday");

            case "saturday","sunday"->
            System.out.println("it is weekend");

            default->System.out.println(day+ "not a day ");
        }
    }
}
