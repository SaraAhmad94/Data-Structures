package Interview;

public class MaxValue {
	public static int MaxFunction(int[] SArray )
	 {   
		for ( int i =1; i < SArray.length; i++)
		 {
			 if (SArray[0] < SArray[i])
			 {
				 int k = SArray[0];
				 SArray[0]=SArray[i];
				 SArray[i]=k;
			 }
		 }
		return SArray[0];
	 }
}
