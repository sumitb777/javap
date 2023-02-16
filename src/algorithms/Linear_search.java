package algorithms;

import java.util.Scanner;

public class Linear_search {

	public static void main(String[] args) {
		int a[]= {54,65,7,77,64,12,645,48};
		Scanner s=new Scanner(System.in);
		System.out.println("enter no");
		int se=s.nextInt();
		int count=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]==se) {
				System.out.println("no at "+i+" index");
			count++;
			}
		}
		if(count==0)
			System.out.println("not found");
s.close();
	}

}
