package Stringprogramms;

public class prtintingcharecters {

	public static void main(String[] args) {
		String a="saASfaOPJHhgk";
		// print upper and lower class
		for(int i=0;i<a.length();i++) {
			
			char c=a.charAt(i);
	if(Character.isUpperCase(c)) {
		System.out.print(c);
	}
		}

	}

}
