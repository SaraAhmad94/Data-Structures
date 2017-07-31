package Interview;

import java.util.Stack;

public class EvaluationOfPostfix {
	static String postfixoutput = "";
	static Stack<Integer> lifo = new Stack<Integer>();
	 public static int solve(int a, int b , int operator)
	    {   
		 int k =0;
	    	if (operator =='+')
	    		{
	    		   k =a+b;
	    		}
	    	if (operator =='-')
    		{
    		   k =a-b;
    		}
	    	if (operator =='/')
    		{
    		   k =a/b;
    		}
	    	if (operator =='*')
    		{
    		  k =a*b;
    		}
	    	return k;
	    }
	public static void EvaluationOfPostfix()
	{
	 // String s="A+B*C/D-E";
	String s="345+*";
	//	String s="12345*+6**+";
	
    int[] array= new int[s.length()];
    int j =0;
    for (int i =0 ; i < s.length(); i++)
    {   
    	if(s.charAt(i)>='0'&&s.charAt(i)<='9')
            array[i]=(int)(s.charAt(i)-'0');
    	else
    	{
    	array[i]=s.charAt(i);
    	}
    }
    for (int i =0 ; i < s.length(); i++)
    {   
      if ((array[i]== '+' || array[i]== '-' || array[i]=='/' || array[i]=='*') && !lifo.isEmpty())
    	{        
    	        int a = lifo.pop();
    	        int b = lifo.pop();
    	        lifo.push((solve(a,b,array[i])));	       
    	}	
     else 
    	{           
    				lifo.push(array[i]);
    				//System.out.println(lifo.peek());
    	}
    	}
        		System.out.println(lifo.pop());
    

	}	
	public static void main(String[] args)
	{
        EvaluationOfPostfix();
        
	}
}
