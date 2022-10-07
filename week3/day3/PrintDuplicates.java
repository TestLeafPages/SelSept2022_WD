package week3.day3;

import java.util.HashSet;
import java.util.Set;

public class PrintDuplicates {

	public static void main(String[] args) {
		int[] nums = {2,4,6,3,5,3,2,1,2,3};//2,3
		Set<Integer> set = new HashSet<Integer>();
		Set<Integer> unique = new HashSet<Integer>();
		for (int i = 0; i < nums.length; i++) {
			boolean add = set.add(nums[i]);
			if (!add) {
				unique.add(nums[i]);
			}
		}
		
System.out.println(unique);
	}

}
