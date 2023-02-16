package numbers_factors;

public class abundant_no {
//Abundant =sum of factors are greter than some sum itself e.g 12=1+2+3+4+6+=16  16>12
	public static void main(String[] args) {
		int no = 12;
		int sum = 0;
		for (int i = 1; i < no; i++) {
			if (no % i == 0)
				sum += i;
		}
		if (sum > no)
			System.out.println("its abundant no");
		else
			System.out.println("not");
	}

}
