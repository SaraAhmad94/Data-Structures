package Interview;

import java.util.Stack;

public class EvaluationOfPrefix {
	static String porefixoutput = "";
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
	public static void EvaluationOfPrefix()
	{
		String buffer= "/*572";
		StringBuffer s = new StringBuffer(buffer);
        s.reverse();
	
    int[] array= new int[s.length()];
    int j =0;
    for (int i=0; i <s.length(); i++)
    {   
    	if(s.charAt(i)>='0'&&s.charAt(i)<='9')
           
    		{array[i]=(int)(s.charAt(i)-'0');}
    	else
    	{
    	array[i]=s.charAt(i);
    	}
    }
  
    
    for (int i =0 ; i < array.length; i++)
    {   
      if ((array[i]== '+' || array[i]== '-' || array[i]=='/' || array[i]=='*') && !lifo.isEmpty())
    	{        
    	      // System.out.println(lifo.peek());
    	        int a = lifo.pop();
    	        int b = lifo.pop();
    	        lifo.push((solve(a,b,array[i])));	       
    	}	
     else 
    	{           
    	            System.out.println("YOLO");
    				lifo.push(array[i]);
    				//System.out.println(lifo.peek());
    	}
    	}
        		System.out.println(lifo.pop());
    

	}	
	public static void main(String[] args)
	{
        EvaluationOfPrefix();
        
	}
}
