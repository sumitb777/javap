package number;

public class autpmorphic {
	// it is a number that contained in the last digits of its square e.g. 25 in 625
	public static void main(String args[]) {
		int no = 25;
		int flag = 0;
		int s = no * no;
		while (no > 0) {
			int d = no % 10;
			int d1 = s % 10;
			if (d != d1) {
				flag ++;
			}
			no = no / 10;
			s = s / 10;
		}
		if (flag == 0)
			System.out.println("yes");
		else
			System.out.println("no");
	}
}
