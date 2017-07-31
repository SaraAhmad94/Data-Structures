package Interview;
import java.lang.Object;

public class RemoveAnyCharacterFromString {
	public static void function(String s, char c)
	{   
		int var=0;
		int index=0;
		String newstr="";
		for(int i =0 ; i < s.length(); i++)
		{   
			if(s.charAt(i)==c)
			{   
				var=1;
				index=i;
				break;
				
			}
		}
		if (var==1) 
		{System.out.println("FOUND");
		if ( index!=0)
		{
		   newstr = s.substring(0, index) + s.substring(index+1, s.length());
		}
		else
		{
			newstr = s.substring(index+1);
		}
		System.out.println(newstr);
	}
		else 
		{System.out.println("NOTFOUND");}
		
		
	}
	public static void main(String[] args)
	{
		function("saraAhmad", 's');
	}

}
