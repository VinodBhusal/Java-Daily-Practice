package Java_Daily;

public class StarPattern {
	void hollowPatter() {
		for (int i = 1; i <= 5; i++) {

			for (int j = 1; j <= 5; j++) {

				if (i == 1 || j == 1 || i == 5 || j == 5) {
					System.out.print("*  ");
				}

				else {
					System.out.print("   ");
				}

			}
			System.out.println();
		}
	}

	void patternTwo() {
		for (int i = 1; i <= 5; i++) {

			for (int j = 4; j >= i-1; j--) {
				System.out.print("* ");
			}
			System.out.println(" ");
		}

	}
	public static void main(String[] args) {
		StarPattern pattern = new StarPattern();
		pattern.hollowPatter();

		pattern.patternTwo();

	}
}
