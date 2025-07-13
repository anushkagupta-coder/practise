import java.util.Scanner;
public class main {
    public static void main(String[] args ){
        String item;
        int quantity;
        int price;
        int total;

        Scanner scanner= new Scanner(System.in);

        System.out.println("what do u wnat order --1)PIZZA 2)PROTEIN 3)COFFEE");
        item=scanner.nextLine();

        System.out.println("enter how many");
        quantity=scanner.nextInt();

        System.out.println("enter price");
        price=scanner.nextInt();

        total=quantity*price;
        System.out.println(total +"is ur total amount");

        scanner.close();

    }

}