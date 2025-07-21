public class main {
    public static void main(String[] args) {
        
        car car1=new car("BMW","BLACK");
        car car2=new car("PORCHE","BLACK");
        car car3=new car("MERCEDES","RED");

        car[] cars={car1,car2,car3};

        for (int i=0;i<car.length;i++) {
            cars[i].drive();
        }
    }
}
public class car {
    public static void main(String[] args) {
        
        
        String model;
        String colour;
        car(String model,String colour){
            this.model=model;
            this.colour=colour;
        }
        void drive(){
            System.out.println("you drive"+this.colour+" "+this.model);
        }

    
}




