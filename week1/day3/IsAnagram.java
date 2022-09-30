package week1.day3;

import java.util.Arrays;

public class IsAnagram {
	public static void main(String[] args) {
		String str1="hello";
		//convert string to charArray
		char[] ch1 = str1.toCharArray();
		//sort the array
	    Arrays.sort(ch1);
		String str2 ="oelhl";
		//convert the second String to charArray
		char[] ch2 = str2.toCharArray();
		//sort the array
		Arrays.sort(ch2);
		//declare a boolean variable
		boolean bAnagram = true;
		//iterate through a for loop
		for (int i = 0; i < ch2.length; i++) {
			//check whether both the arrays are equal
			if (ch1[i]!=ch2[i]) {
				//print it is not anagram
				System.out.println("Not Anagram");
				bAnagram=false;
				break;
				
			}
		}
		//if it is true
		if (bAnagram) {
			//print anagram
			System.out.println("Anagram");
		}
		
		
		
		
		
		
		
	}

}
