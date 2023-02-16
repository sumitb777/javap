package numbers_factors;

import java.util.Scanner;

public class Composite {

	// it is number that has more than one factor ex.-8 has=2,4
	//4, 6, 8, 9, 10, 12, 14, 15, 16, 
	public static void main(String args[]) {

		Scanner s = new Scanner(System.in);

		System.out.println("Give number");
		int no = s.nextInt();
		int count = 0;
		for (int i = 1; i <= no; i++) {
			if (no % i == 0)
				count++;
		}
		if (count > 3)
			System.out.println("its composite no");
		else
			System.out.println("its not");
		s.close();

	}

}
