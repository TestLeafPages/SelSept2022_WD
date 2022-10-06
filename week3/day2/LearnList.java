package week3.day2;

import java.util.ArrayList;
import java.util.List;

public class LearnList {

	public static void main(String[] args) {
		//Declare a list
		int[] num = {3,4,5,6};
		List<Integer> list = new ArrayList<Integer>();
		for (Integer each : num) {//dataType variable:givenArray
			list.add(each);
		}
		System.out.println(list);
		
		List<String> learners = new ArrayList<String>();
		learners.add("Divya");
		learners.add("Praveena");
		learners.add("Dominick");
		learners.add("Uma");
		learners.add("Vaishnavi");
		//To get the size of the list
		int size = learners.size();
		System.out.println(size);
		//to remove a name from the list
		learners.remove("Praveena");
		System.out.println(learners);
		
		learners.add(1, "Vino");
		learners.add("Divya");
		System.out.println(learners);
		
		//To get the element in the particular index
		System.out.println(learners.get(2));
		
		

	}

}
