package week1.day3;

public class LearnString {

	public static void main(String[] args) {
		//String literal
		String companyName = "TestLeaf";
		
		//String object
		String company = new String("TestLeaf");
		
		//-length()->to find how many characters in the String
		int length = companyName.length();//int
		System.out.println(length);
		
		//toCharArray()->convert a string to a character array->char[]
		char[] charArray = companyName.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			System.out.println(charArray[i]);
		}
		
		//equals()->to compare String content->boolean
		boolean equals = companyName.equals(company);
		System.out.println(equals);
		
		//equalsIgnoreCase()->It will ignore the case sensitive->boolean
		boolean equals1 = companyName.equalsIgnoreCase(company);
		System.out.println(equals);
    
		//contains()->compare the string with the matching content->boolean
		boolean contains = companyName.contains("Leaf");
		System.out.println(contains);
		
		//indexOf('a')->will return the index position of the given character->int
		int indexOf = companyName.indexOf('a');
		System.out.println(indexOf);
		
		
		//charAt()->character available in the given position->char
		
		char charAt = companyName.charAt(2);
		System.out.println(charAt);
	}

}
