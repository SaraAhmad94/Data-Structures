package Sorting;

import java.lang.reflect.Array;

public class SelectionSort {
	
	public static void SelectionSort(int[] SArray)
	{
	 for ( int i =0; i < SArray.length; i++)
		 {  
		   for (int j =i+1 ; j < SArray.length; j++)
		   {
			 if (SArray[i] > SArray[j])
			 {
				 int k = SArray[i];
				 SArray[i]=SArray[j];
				 SArray[j]=k;
			 }
		 }
		 }
		for (int i=0 ; i < SArray.length; i++)
		{
			System.out.println(SArray[i]);
		}
	}
	
	public static void main(String[] args)
	
	{
		int[] sequence= {29,64,73,34,20};
		SelectionSort(sequence);
	}
}
