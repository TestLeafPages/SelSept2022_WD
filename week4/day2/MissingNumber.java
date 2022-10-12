package week4.day2;

import java.util.ArrayList;
import java.util.List;

public class MissingNumber {

	public static void main(String[] args) {
		int[] num = {1,2,3,4,6,8,10};
		List<Integer> li = new ArrayList<Integer>();
		for (Integer each : num) {
			li.add(each);
		}
		for (int i = 0; i < li.size()-1; i++) {
			if (li.get(i)+1!=li.get(i+1)) {//3!=3
				System.out.println(li.get(i)+1);
			}
		}
	}

}
