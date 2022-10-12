package week4.day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		String str = "We buy amazon products in amazon during amazon great india sale";
		String[] split = str.split(" ");
		Set<String> set = new LinkedHashSet<String>();
		for (String each : split) {
			set.add(each);
		}
		System.out.println(set);

	}

}
