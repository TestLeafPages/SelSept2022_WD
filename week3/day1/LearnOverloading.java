package week3.day1;

public class LearnOverloading {
	
	public void sum(int a,int b) {
		System.out.println(a+b);

	}
	public void sum(int a,int b,int c,int d) {
		System.out.println(a+b);

	}
	public void sum(int a,int b,int c) {
		System.out.println(a+b+c);

	}
	public void sum(float a,int b) {
		System.out.println(a+b);

	}
	public static void main(String[] args) {
		LearnOverloading lo = new LearnOverloading();
		lo.sum(2.2f, 56);
		lo.sum(23, 45);
		lo.sum(46, 89, 90);
		lo.sum(23, 67, 78, 89);
	}
}
