package Stringprogramms;

public class removingthings {
	
	public static void main (String args []) {
		//remove junk
				String s = "su2#%$m*&it";
				s=s.replaceAll("[^a-zA-Z0-9]","");
				System.out.println(s);
				//
		//remove white spaces
				
				String sp="d   klhhj  lhg";
		sp=sp.replaceAll("\\s", "");
		System.out.println(sp);
		
		
	}
	
	

}
