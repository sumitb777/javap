package practice;
	import java.util.Scanner;
	public class Exercise1_5{
	    public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
	         double mark_avg = 0;
	         int result;
	         int i;
	         int s;
	      //define size of array
	       s = input.nextInt();
	     //The array is defined "arr" and inserted marks into it.
	      int[] arr = new int[s];   
	      for(i=0;i<arr.length;i++)
		  {
		arr[i]=input.nextInt();
	        }
	      result=arr[0];
	      int sum=0;
	      for(int j=0;j<s;j++) {
	    	  if(result<arr[j]) {
	    		  result=arr[j];
	    		  
	    		}
	    	   sum=sum+arr[j];
	    	  }
	      mark_avg=sum/s;
	      System.out.println(result);
	      System.out.println(mark_avg);
	      
	      
	      
	     // 5
	     // 20 50 60 40 70
}}
