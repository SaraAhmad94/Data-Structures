package Interview;

import java.util.Stack;

public class Prefix {
	static String prefixoutput = "";
	static Stack<Character> lifo = new Stack<Character>();
	public static int precedence(char s)
	{
		int topPrec = 0;
		if (s == '+' || s == '-') {
		topPrec = 1;
		return topPrec;
		} else {
		topPrec = 2;
		return topPrec;
		}
	}
	public static void Prefix()
	{
   // String s="a/b+c/d";
		//String s="1+2*4/5-7+3/6";
		//String s="(A+B)";
	  //  String s="((A+B)*(C+D)/(E-F))+G";
	//	String s="(a+b*c)*d ";
	//	String s="(a+b*c)";
	//	String s="((a+b)*c)-d";
		//String s="A+(B*C-(D/E^F)*G)";
		//Stri
		//	String s="(A*B)+C";
			//String s="A*(B+C)/D";
		String s="A*B+C/D";
    char[] array= new char[s.length()];
    char[] prefixarray= new char[s.length()];
    int j =0;
    for (int i =0 ; i < s.length(); i++)
    {
    	array[i]=s.charAt(i);
    }
    for (int i =array.length-1; i >=0; i--)
    {   
    	if(array[i]==')')
    	{
    		lifo.push((Character) array[i]);
    	}
    	if(array[i]=='(')
    	{   
    		while(lifo.peek()!=')')
    		{
    			prefixoutput=prefixoutput+lifo.pop();
    		}	
    	lifo.pop();	
    	}
    	 if (array[i]== '+' || array[i]== '-' || array[i]=='/' || array[i]=='*')
     	{        
     			if (!lifo.isEmpty() && (lifo.peek()!=')' && precedence((Character)lifo.peek()) >= precedence(array[i])))
     				{
     				while((!lifo.isEmpty() && (lifo.peek()!=')' && precedence((Character)lifo.peek()) >= precedence(array[i]))))
     					{  
     				       prefixoutput=prefixoutput+lifo.pop();
     					}
     				lifo.push((Character) array[i]);
     				}	
     			else {
     				lifo.push((Character) array[i]);
     			}
     	}
      if(Character.isLetter(array[i]))
    	{   
    		prefixoutput=prefixoutput+array[i];
    	} 
    		
    	}

        if(!lifo.isEmpty())
        {
        	while(!lifo.isEmpty())
        	{
        		prefixoutput=prefixoutput+lifo.pop();
        	}
        }
    
  
    	System.out.println("Postfix of the reverse  " + prefixoutput);
    	StringBuffer buffer = new StringBuffer(prefixoutput);
        buffer.reverse();
         System.out.println("Prefix  " + buffer);

	}	
	public static void main(String[] args)
	{
        Prefix();
        
	}
}
