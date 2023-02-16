package numbers_factors;

public class deficient_no {
//sum of factors is lesser than no
	public static void main(String[] args) {
		int no = 13;
		int sum = 0;
		for (int i = 1; i < no; i++) {
			if (no % i == 0)
				sum += i;
		}
		if (sum < no)
			System.out.println("its deficient no");
		else
			System.out.println("not");
	}


	}


