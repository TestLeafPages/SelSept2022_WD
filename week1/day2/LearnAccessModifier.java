package week1.day2;

public class LearnAccessModifier {
	//default method
	 void phoneNumber() {
		System.out.println("898302388");

	}
	//private method
	private void atmPin() {
		System.out.println("1234");

	}
	
	//public method
    public void name() {
		System.out.println("Subraja");

	}
    public static void main(String[] args) {
    //className objectname = new className	
    	LearnAccessModifier lm = new LearnAccessModifier();
    	lm.atmPin();
    	lm.phoneNumber();
    	lm.name();
	}
}
