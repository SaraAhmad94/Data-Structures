package Sorting;

public class InsertionSort {
	public static void InsertionSort(int[] SArray)
	{ 
		 for (int i =1 ; i<SArray.length; i++)
		 {
			 int temp=SArray[i];
			for ( int j =i-1; j >=0; j--){
		 {   
			 if (temp< SArray[j])
			 {
				SArray[j+1]=SArray[j];
				 SArray[j]=temp;
				 
			 }
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
		int[] sequence= {12,3,1,5,8};
		InsertionSort(sequence);
	}
}
