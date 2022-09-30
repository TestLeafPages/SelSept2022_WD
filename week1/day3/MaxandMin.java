package week1.day3;

import java.util.Arrays;

public class MaxandMin {

	public static void main(String[] args) {
		int[] nums={22,987,998,-90,0,78,89};//min=-90,max=998
	//	{-90,0,22,78,89,987,998};
		Arrays.sort(nums);
		
		System.out.println("The minimum number of this array is "+nums[0]);
		System.out.println("The maximum value is "+nums[nums.length-1]);
		for (int i = 0; i <=nums.length; i++) {
			System.out.println(nums[i]);
		}
		
		
//		max->
//		min->
//		1)Create a new class MaxandMin with main method
//		2)Create an int[] array with different data not in sorted order
//		3)Write a logic to sort and find the min,max-
//		4)Run and confirm the printed in console
//
////		Hint:Use sort and find the min and max by index

	}

}
