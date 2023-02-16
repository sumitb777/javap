package number;

public class niven_or_harshad_no {
	//number is divisible of sum of digits eg 156=1+5+6=12
public static void main (String args[]) {
	
	int no=156;
	int no2=no;
	int  sum=0;
	while (no2!=0) {
		int r=no2%10;
		sum=sum+r;
		no2=no2/10;
		
	}
	if (no%sum==0)
		System.out.println("yes");
	else
		System.out.println("no");
	
}
}
