package Interview;

public class ComputePower {
	public static float ComputePowerIteration(int base, int power)
	{   
		int k=1;
		if (base==0)
		{   
			return 0;
		}
		if (power==0)
		{
			return 1;
		}
		if (base >0 && power >0)
		{   
			//Iteration
			/*for ( int i =1 ; i <=power; i++)
			{
				k =k*base;
			}
			return k;*/
			//Recursion
		   return base*ComputePowerIteration(base,power-1);
		}
		if(base<0 && (power%2==0))
		{    
			int m =1;
			m =(base*-1);
			return ComputePowerIteration(k,power);
			
		}
		if(base<0 && (power%2==0))
		{    
			int m =1;
			m =(base*-1);
			return ComputePowerIteration(m,power);
		}
		if(base<0 && (power%2!=0))
		{    
			int m =1;
			m =(base*-1);
			return -1*ComputePowerIteration(m,power);
		}
		if(power<0)
		{    
			int m =1;
			int p=0;
			m =(power*-1);
			return 1/ComputePowerIteration(base,m);
		}
		
		return -1;
	}
	public static void main(String[] args)
	{
		float k =ComputePowerIteration(2,-3);
		System.out.print(k);

	}
}
