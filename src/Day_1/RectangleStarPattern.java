package Day_1;

import java.util.Scanner;

public class RectangleStarPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row; int column;
		Scanner sc = new Scanner(System.in);
		System.out.println("Required Row:-");
		 row = sc.nextInt();

		System.out.println("Required Column:-");
		 column = sc.nextInt();

		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <=column; j++) {
				System.out.print("* ");
			}

			System.out.println();
		}
	}

}
