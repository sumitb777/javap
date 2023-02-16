package Stringprogramms;

public class d {

	public static void main(String[] args) {
		
		String a="dab";
		
		String rev="";
		for (int i=0;i<a.length();i++) {
			char c=a.charAt(i);
		   rev=c+rev;
		   
		}System.out.println(rev);
		if(rev.equals(a))
			System.out.println("pallindrome");
		else
			System.out.println("not");
		
		

	}

}
