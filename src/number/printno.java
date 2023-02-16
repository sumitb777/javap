package number;

public class printno {
//print all digit of no 268 in different line
	public static void main(String[] args) {
		
		int no=268;
		while(no>0) {
			int a=no%10;
			System.out.println(a);
			no=no/10;
		}

	}

}
