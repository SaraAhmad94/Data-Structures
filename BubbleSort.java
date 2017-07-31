package Sorting;

public class BubbleSort {
	public static void BubbleSort(int[] SArray)
	{
		
  //for(int j=0; j < SArray.length-1; j++)
  //{
		boolean flag=true;
		
 while(flag)
 {  
	 flag=false;
	for ( int i =0; i < SArray.length-2; i++)
	 {
		 if (SArray[i] > SArray[i+1])
		 {
			 int k = SArray[i];
			 SArray[i]=SArray[i+1];
			 SArray[i+1]=k;
			 flag=true;
		 }
	 }
	 
 }
	
//} 
  for (int i=0 ; i < SArray.length; i++ )
  {
	  System.out.println(SArray[i]);
  }
	}
	public static void main(String[] args)
	{   
		int[] sequence= {7,5,2,4,3,9};
		BubbleSort(sequence);
	}
}
