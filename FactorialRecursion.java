package Interview;

public class FactorialRecursion {
         static int count=0;
	
	public static int FactorialRecursion(int n )
	{   
		if ( n==0)
		{   
			return 1;
		}
		else
		{    
			 int k =n*FactorialRecursion(n-1);
			return k;
		}
	}
	public static void main(String[] args)
	{   
		
		int k =FactorialRecursion(5);
		System.out.println(k);
	}
}
