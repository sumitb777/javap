package numbers_factors;

import java.util.Scanner;

public class prime {
 //no divied by 1 and itself
	public static void main (String args[]) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Give number");
		int no=s.nextInt();
		int count=0;
		for(int i=2;i<no;i++)
		{
			if (no%i==0);
				count ++;
			
		}
	if(count==0)
		System.out.println("Its prime no");
	else
		System.out.println("Its not prime no");
	
	
	s.close();
	}
	

	
}
