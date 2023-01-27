package Stringprogramms;

public class count_words {
	public static void main(String args []) {
String s="follow the rules";
	String d="";
	s+=" ";
	int count=0;
for(int i=0;i<s.length();i++) {
	char c=s.charAt(i);
	if(c!=' ') {
		d+=c;
	}else {
		count++;
		
	}
	
	
}
	System.out.println(count);
	
	
}}
