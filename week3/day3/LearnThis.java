package week3.day3;

public class LearnThis extends ParentClass{
	public void launchOpera() {
		System.out.println("Launch Opera from my child class");

	}
	
	public void launchChrome() {
		super.launchOpera();
		//this.launchSafari();
		//System.out.println("Launch Chrome browser");

	}
	public void launchSafari() {
		
		System.out.println("Launch Safari browser");
	}
	public void launchEdge() {

      this.launchSafari();

	}

	public static void main(String[] args) {
		LearnThis lt = new LearnThis();
		lt.launchChrome();

	}

}
