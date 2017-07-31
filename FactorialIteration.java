package Interview;

public class FactorialIteration {
	public static int FactorialIteration(int n)
	{   
		if ( n==0)
		{
			return 1;
		}
		else
		{   
			int k =1;
			for(int i =1 ;i <=n ;i++)
			{
			k =k*i;
			}
			return k;
		}
	}
	public static void main(String[] args)
	{
		int k =FactorialIteration(5);
		System.out.print(k);
	}
}
