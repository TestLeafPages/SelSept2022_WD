package week1.day2;

public class FibonacciSeries {
	//0 1 1 2 3 5 8.....

	public static void main(String[] args) {
		int num1 = 0,num2=1,sum=0;
		System.out.println("Fibonacci series");
		System.out.println(num1);
		System.out.println(num2);
		for (int i = 2; i <=6; i++) {
			sum=num1+num2;//0+1=1 1+1=2 1+2=3 2+3=5 3+5=8
			num1=num2;//1 1 2 3
			num2=sum;//1 2 3 5
			System.out.println(sum);
			
		}
	

	}

}
