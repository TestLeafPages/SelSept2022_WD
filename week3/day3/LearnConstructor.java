package week3.day3;

public class LearnConstructor {
//global variables	
	int empId;
	String empName;
	boolean empStatus;
	
	LearnConstructor(){
		//this(200,"S",true);
		System.out.println("I am from Default constructor");
		empId=100;
//		empName="Subraja";
//		empStatus=true;
	}
	LearnConstructor(int empId,String empName,boolean empStatus){
		this();
		System.out.println("I am from Parameterized Constructor");
		this.empId=empId;
		this.empName=empName;
		this.empStatus=empStatus;
		
	}
	LearnConstructor(String learners){
		empName=learners;
	}

	public static void main(String[] args) {
//		LearnConstructor par1 = new LearnConstructor("Subi");
//		System.out.println(par1.empName);
//		LearnConstructor par = new LearnConstructor(300, "Ss", false);
//		System.out.println(par.empId);
		LearnConstructor d = new LearnConstructor();
		System.out.println(d.empId);
//		LearnConstructor lc = new LearnConstructor();
//		System.out.println(lc.empId);
//		System.out.println(lc.empName);
//		System.out.println(lc.empStatus);

	}

}
