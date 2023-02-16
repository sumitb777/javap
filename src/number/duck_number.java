package number;

public class duck_number {
//if number have zero in him it is a duck number.  eg 208,905,10,150
	public static void main(String[] args) {
		int no=208;
		int temp=0;
		while(no>0) {
			int d=no%10;
			if(d==0) {
				temp++;
			}
			no=no/10;
			
		}
		if(temp>0)
			System.out.println("yes");
		else
			System.out.println("no");

	}

}
