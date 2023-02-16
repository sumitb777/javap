package numbers_factors;

public class pronic_no {
//pronic is product of two consecutive integers(factor) ex 56 7*8=56
	public static void main(String[] args) {
		int no=56;
		int count =0;
		for (int i =1 ;i < no;i++) {
			
			if(i*(i+1)==no)
				count++;
			
		}
		if(count>0)
			System.out.println("its pronic no");
		else
			System.out.println("not");

	}

}
