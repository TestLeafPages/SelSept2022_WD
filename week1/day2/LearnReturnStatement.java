package week1.day2;

public class LearnReturnStatement {
	
	  public void add() {
		int a=5;
		int b= 18;
		System.out.println(a+b);

	}
	  public int addThreeNumbers(int a,int b,int c) {
		 // a=10;b=20;c=30;
		return a+b+c;
		

	}
	  public boolean switchOff() {
		return true;

	}
	  public String getPhoneName() {
		  System.out.println("Subi");
		return "Vivo";

	}
	  public static void main(String[] args) {
		  LearnReturnStatement lr = new LearnReturnStatement();
		  lr.add();
		  System.out.println(lr.addThreeNumbers(34, 43, 45));
		  System.out.println(lr.getPhoneName());
	}

}
