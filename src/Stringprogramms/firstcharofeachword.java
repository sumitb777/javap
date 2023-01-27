package Stringprogramms;

public class firstcharofeachword {

	public static void main(String[] args) {
		String s="welcome to java";
		String w="";
		s+=" ";
		String f="";
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if(c!=' ')
			w=w+c;
			else {
				System.out.print(w.charAt(0));//first two ()w.substring(0,2)
				                              //starst with r(w.startsWith("r"))
				w="";
			}
				
				
				
		}
		

	}

}
