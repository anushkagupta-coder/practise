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