package week3.day3;

public class LearnStatic {
	int num1=10;//global variable
	//static in variable
	static int num2 =8;//static variable
//static in method level	
	
public static void add() {
	System.out.println(num2=num2+30);
	
}
public void sub() {
	num1=num1+10;
	System.out.println(num1);
}

	public static void main(String[] args) {
		
//LearnStatic obj = new LearnStatic();
//obj.sub();
//obj.sub();
LearnStatic.add();
LearnStatic.add();
LearnStatic.add();

		

	}

}
