package arthmetic_series;

public class Plus4 {
	
	//9+13+17..n
public static void main (String args[]) {
	int n=5;
	int sum=0;
	for(int i=0,a=9;i<n;i++,a+=4) {
		sum=sum+a;
		
	}
	System.out.println(sum);	
	
	
}
}
