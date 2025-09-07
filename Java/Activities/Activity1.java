package Activites;

public class Activity1 {
	public static void main(String[] args) {
       
        Car myCar = new Car();
        
        myCar.color = "Black";
        myCar.transmission = "Manual";
        myCar.make = 2014;
        
        myCar.displayCharacteristics();
        myCar.accelarate();
        myCar.brake();
}
}
