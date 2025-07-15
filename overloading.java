public class overloading{
    public static void main(String[] args) {

       String a=pizza("thincrust","mozorella","onion");
       System.out.println(a);
    }
    static String pizza(String bread){
        return bread +"pizza";
    }
    static String pizza(String bread,String chesse){
        return chesse+" "+bread +" "+"pizza";
    }
    static String pizza(String bread,String chesse,String toppings){
        return toppings+" "+chesse+" "+bread +" "+"pizza";
    }

}
/*import java.util.Scanner;
public class methodoverloading {
    public static void main(String[] args) {
       Scanner scanner=new Scanner(System.in);

        int age;
        System.out.println("enter your age");
        age=scanner.nextInt();

            if(agecheck(age)){
            System.out.println("you may sign up");
            }
            else{
            System.out.println("you may not signup");
            }
        }
        
    static boolean agecheck(int age){
            if(age>=18){
                return true;

            }
            else{
                    return false;
            }
        }

        
    
}*/
 
/* 
public class methodoverloading{
    public static void main(String[] args){
    int a ,b,c;
        add(5,8);
    }

    static int add(int a ,int b){
        int c=a+b;
        System.out.println("the add is "+c);
        return c;
    }

}*/