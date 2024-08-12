package Day_1;

public class Resverse_Sentence {

	public static void main(String[] args) {
		String str = "my name is vinod";
		String rstr = "";
		char ch;

		for (int i = 0; i < str.length(); i++) {

			ch = str.charAt(i);
			rstr = ch + rstr;

		}
		System.out.println(rstr);
	}
}
