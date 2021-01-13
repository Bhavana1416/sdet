package JavaActivity1_1;

public class Activity1 {

    public static void main(String[] args) {
    	
        
    	//Initialize the values of make to 2014, color to "Black" ,transmission to "Manual"
    	Car Audi = new Car();
        Audi.make = 2014;
        Audi.color = "Black";
        Audi.transmission = "Manual";
        //Call accelerate and brake methods
        Audi.accelarate();
        Audi.brake();
    }

}