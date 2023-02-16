package number;

public class special_no {
//sum of digits plus product of digits its equal to original number
	//59=5+9+5*9;
	public static void main(String[] args) {
		
		int no=59;
		int no2=no;
		int sum=0;
		int a=0,p=1;
		while(no2!=0) {
			int r=no2%10;
			 a=a+r;
			p=p*r;
			no2=no2/10;
		}
		sum=a+p;
		if(sum==no)
			System.out.println("yes");
		else
			System.out.println("no");
	}

}
