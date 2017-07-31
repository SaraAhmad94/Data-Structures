package Interview;

import java.util.Stack;

public class Postfix {
	static String postfixoutput = "";
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
	public static void Postfix()
	{
	 // String s="A+B*C/D-E";
		String s="(A+B*(C-D))/E";
	
    char[] array= new char[s.length()];
    char[] prefixarray= new char[s.length()];
    int j =0;
    for (int i =0 ; i < s.length(); i++)
    {
    	array[i]=s.charAt(i);
    	System.out.println(array[i]);
    }
    for (int i =0; i <array.length; i++)
    {   
    	if(array[i]=='(')
    	{
    		lifo.push((Character) array[i]);
    	}
    	if(array[i]==')')
    	{   
    		while(lifo.peek()!='(')
    		{
    			postfixoutput=postfixoutput+lifo.pop();
    		}	
    	lifo.pop();	
    	}
    	
      if (array[i]== '+' || array[i]== '-' || array[i]=='/' || array[i]=='*')
    	{        
    			if (!lifo.isEmpty() && (lifo.peek()!='(' && precedence((Character)lifo.peek()) >= precedence(array[i])))
    				{
    				while((!lifo.isEmpty() && (lifo.peek()!='(' && precedence((Character)lifo.peek()) >= precedence(array[i]))))
    					{  
    				       postfixoutput=postfixoutput+lifo.pop();
    					}
    				lifo.push((Character) array[i]);
    				}	
    			else {
    				lifo.push((Character) array[i]);
    			}
    	}
      if(Character.isLetter(array[i]))
    	{   
    	  postfixoutput=postfixoutput+array[i];
    	} 
    		
    	}

        if(!lifo.isEmpty())
        {
        	while(!lifo.isEmpty())
        	{
        		postfixoutput=postfixoutput+lifo.pop();
        	}
        }
    
  
    	System.out.println("Postfix of the reverse  " + postfixoutput);

	}	
	public static void main(String[] args)
	{
        Postfix();
        
	}
}
