package week3.day1;

public class MyVehicle {

	public static void main(String[] args) {
		Audi a = new Audi();
		a.applyBrake();
		a.soundHOrn();
		a.handBrake();
		a.seatBelt();
		a.autoBraking();
	System.out.println("---------");	
		Bajaj b = new Bajaj();
		b.autoStart();
		b.handGear();
		b.applyBrake();
		b.soundHOrn();
		System.out.println("---------");	
		BMW bmw = new BMW();
		bmw.adas();
		bmw.handBrake();
		bmw.seatBelt();
		bmw.applyBrake();
		bmw.soundHOrn();
	}

}
