package week3.day1;

public class BMW extends Car {
	
	    public void adas() {
			System.out.println("New Functionality of BMW");
		}
	    
	    public void handBrake() {
			System.out.println("handBrake is changed to AutoBrake");

		}
	    
	   public static void main(String[] args) {
		   Car b = new Car();
		  b.airConditioning();
	}

}
