package number;

public class spyno {

	public static void main(String[] args) {
		// sum of its digit equal product of digit eg 123   1+2+3=1*2*3  both mulification result ant addition result are sum 

		int no=123;
		int a=0,p=1;
		while(no!=0) {
			 int r=no%10;
			 a=a+r;
			 p=p*r;
			no=no/10;
		}
		if(a==p)
			System.out.println("yes");
		else
			System.out.println("no");
	}

}
