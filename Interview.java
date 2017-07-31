package Interview;

import java.util.Stack;

public class Interview {
	 public static void palindrome(String original)
	 {   
		 int found=0;
		/* String reverse="";
		
		 for( int i=original.length()-1 ; i >= 0; i--)
		 {       
                 reverse=reverse+original.charAt(i);
			
		 }
		 if (original.equals(reverse))
		 {   
			 System.out.println("The string is palindorme");
		 }
		 else
		 {
			 System.out.println("The string is not palindorme");
		 } 
		 //Second Method
		 for( int i=0; i < original.length(); i++) 
		 {
			 if(original.charAt(i) != original.charAt(original.length()-1-i))
			 {
				 System.out.println("The string is NOT palindorme");
				 break;
			 }
			 found=1;
		 }
		 if (found==1)
		 {
		 System.out.println("The string is palindorme");
		 }*/
		//Last Method Using Stack in the Default Stack Java

	 }
	public static void main(String[] args)
	{
		palindrome("abcbad");
	}
}
