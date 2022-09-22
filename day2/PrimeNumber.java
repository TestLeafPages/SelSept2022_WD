package week1.day2;

public class PrimeNumber {
   //divisible by itself and 1
	public static void main(String[] args) {
		int input =12;
		boolean bPrime = true;
		for (int i = 2; i <input-1; i++) {
			if (input%i==0) {//4%2==0
				System.out.println("Non-Prime");
				bPrime=false;
				break;
			}
		}
		if(bPrime) {
			System.out.println("Prime");
		}
	}

}
