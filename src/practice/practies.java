package practice;

import java.util.Arrays;
import java.util.Scanner;

public class practies {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;
		for (int i = 0, a = 0; i < n; i++, a += 2) {
			 System.out.print(" "+a);
			for (int j = 0; j < a; j++) {
				                       
				if (a % 3 == 0) {
					
					sum = sum + a;
					break;
					
				}}
}
		System.out.println();
		System.out.println(sum);
		sc.close();

	}
}
