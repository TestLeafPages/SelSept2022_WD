package week1.day1;

import week1.day2.LearnAccessModifier;

public class Car {
	//type methodName->ctr+space->Enter
// accessmodifier returnType methodName arguments
	public void driveCar() {
		System.out.println("Car started successfully");
       
	}
	
	public void applyBrake() {
		System.out.println("Car Stopped");

	}
	public static void main(String[] args) {
		LearnAccessModifier lm = new LearnAccessModifier();
		lm.name();
		
		
// Classname objectName = new ClassName()		
		Car obj = new Car();
		obj.driveCar();
		obj.applyBrake();
		
	}
	
	

}
