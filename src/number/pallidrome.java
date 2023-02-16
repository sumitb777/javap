package number;

public class pallidrome {
public static void main(String args[]) {
	
	int no=121;
	int no2=no;
	int sum=0;
	while(no2!=0) {
		int r=no2%10;
		sum=sum*10+r;
		no2=no2/10;}
	if(sum==no)
		System.out.println("its pallindrome");
	else
		System.out.println("not");
	
	
}
}
