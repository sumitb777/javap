package numbers_factors;

import java.util.Scanner;

public class factors {
	//Find factor of number 8,ans=1,2,4,8
	//a factor of a number is number which divides into exactly without leaving reminder
	
public static void main(String args[]) {
	
	Scanner sc= new Scanner(System.in);
	System.out.println("give the number");
	int no=sc.nextInt();
	
	for(int i=1;i<=no;i++) {
		
		if(no%i==0) {
			System.out.println(i);
			
		}
		
		
	}
	sc.close();
	
	
}
}
