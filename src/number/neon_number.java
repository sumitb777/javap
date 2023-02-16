package number;

public class neon_number {
//where sum of digits of square of number equal of number e g 9 9*9=81,9=8+1
	public static void main(String[] args) {
		int no=9;
		int m=no;
		int square=m*m;
		int sum=0;
		while(square>0) {
			int d=square%10;
			sum=sum+d;
			square=square/10;
			}
          if(sum==no)
        	  System.out.println("yes");
          else
        	  System.out.println("no");
          
		
		
	}

}
