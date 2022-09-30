package week1.day2;

public class LearnVariables {
	
//Global/Instance Variable	
   String	brandName = "Hero";
   int  noOfWheels = 3;
   
   public void brandName() {
	   //Local Variable
	   int num = 22;
	  
	 System.out.println(brandName);
}
   public void wheels() {
	   int num=23;
	   System.out.println(num);
	 System.out.println(noOfWheels);
	
}
   public static void main(String[] args) {
	   LearnAccessModifier lam = new LearnAccessModifier();
	   lam.phoneNumber();
	   lam.name();
	   
	
}

}
