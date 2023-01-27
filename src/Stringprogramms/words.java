package Stringprogramms;

public class words {
public static void main(String []args) {
	String s="welcome to java";
	String w ="";
	  s+=" ";
	  String rev="";
	  for(int i=0;i<s.length();i++) {
		  char c=s.charAt(i);
		  if(c!=' ') {
			  w+=c;
			  
		  }else {
			  rev=w+" "+rev;
			  
			  w="";
		  }
		  
		  
	  }
	System.out.println(rev);
}
}
