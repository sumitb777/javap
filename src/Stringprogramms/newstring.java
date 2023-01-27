package Stringprogramms;

public class newstring {

	public static void main(String[] args) {
		
		String s="this is red";//remove red
String newstring="";
s=s+" ";
String w="";
for(int i=0;i<s.length();i++) {
	char c=s.charAt(i);
	if(c!=' ')
		w=w+c;
	else {
		if(!w.equalsIgnoreCase("red"))  //change red with black   if (w.equals("red"))
		{                                    //                    news=new+"red"+" ";  
			newstring=newstring+w+" ";       //                    else
			                                                   //   newstring=newstring+w+" ";    
		}
		w="";
		}
}
	
	System.out.println(newstring);
	

	}

}
