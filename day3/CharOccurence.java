package week1.day3;

import java.util.Iterator;

public class CharOccurence {

	public static void main(String[] args) {
		String str= "TestLeaf";
		char[] ch = str.toCharArray();
		char letter = 'e';
		int count =0;
		for (int i = 0; i < ch.length; i++) {
			if (ch[i]==letter) {
				count++;
			}
		}
System.out.println(count);
	}

}
