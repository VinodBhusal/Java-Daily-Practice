package Java_Daily;

public class Resverse_Sentence {

	public static void main(String[] args) {
		String str = "civic";
		String rstr = "";
		char ch;

		for (int i = 0; i < str.length(); i++) {

			ch = str.charAt(i);
			rstr = ch + rstr;

		}
		if(str.equals(rstr)) {
			System.out.println("matched");
		}
		else{
			System.out.println("not a palindrome");
		}
		
	}
}
