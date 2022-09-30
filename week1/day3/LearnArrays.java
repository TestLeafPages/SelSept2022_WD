package week1.day3;

import java.util.Arrays;

public class LearnArrays {

	public static void main(String[] args) {
		int[] num = {12,34,45,56,12,34,45,56,74,76,89,56,87,89,354,
				     76,56,7,87,565,46,7657,676,86,67,889,67};
		//to find the length of an array
		//length is a property in an array
		int length = num.length;
        System.out.println("Length of this array is "+length);	
        
        //read the first value 
        System.out.println("The first index of the array is "+num[0]);
        //read the last value
        System.out.println("The last value of the array is "+num[length-1]);
        
        //to count how many times  56 is available
        //declare the value you want to find
       int find=56;
       int count = 0;
       Arrays.sort(num);
       //loop through every array item
       System.out.println("The occurence of"+find+ "is");
       for (int i = length-1; i >=0; i--) {
    	   //print all the values in the array
    	   System.out.println(num[i]);
    	   //if array item matches expected value 
    	   if (num[i]==find) {
    		   //Increment the count
    		   count++;//count+1
			
		}
    	  
    	   //finally print the count
    	   
		
	}
      // System.out.println(count);
       
	}

}
