package numbers_factors;

public class perfectno {
//A perfect number is defined as a positive integer which is equal to the sum of its positive divisorsor factors,
	// excluding the number itself ex.6=1+2+3
	// 6, 28, 496, 8128, 33550336
	public static void main(String[] args) {
		int no = 6;
		int sum = 0;
		for (int i = 1; i < no; i++) {
			if (no % i == 0)
				sum = sum + i;
		}
		if (sum == no)
			System.out.println("perfect no");
		else
			System.out.println("not perfect no");
	}

}
