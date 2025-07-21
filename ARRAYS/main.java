
public class main {
    public static void main(String[] args) {
        car car1=new car("BMW","BLACK");
        car car =new car("PORCHE","BLACK");
        car car=new car("MERCEDES","RED");

        car[] cars={car1,car2,car3};

        for (int i=0;i<car.length;i++) {
            cars[i].drive();
        }
    }
}




