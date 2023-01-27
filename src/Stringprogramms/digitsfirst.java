package Stringprogramms;

public class digitsfirst {
	public static void main(String[] args) {
	String a="sound26on";
	String d="",r="";
	for(int i=0;i<a.length();i++) {
		
		char []c=a.toCharArray();
		if(c[i]>'0' &&c[i]<'9') //Character.isDigit(c)
			d=d+c[i];
			else
				r=r+c[i];
			
			
		}
	
		System.out.println(d+" "+r);
	}
	}
	
	


