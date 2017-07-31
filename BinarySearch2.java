package Sorting;

public class BinarySearch2 {
	public static int BinarySearch2(int[] Array, int k, int first, int last) {
		for (int i = first; i <= last; i++) {
			int mid = (first + last) / 2;
			if (k == Array[mid]) {
				System.out.println("Element Found");
				return mid;
			}
			if (k < Array[mid]) {
				return BinarySearch2(Array, k, first, mid - 1);
			} else {
				return BinarySearch2(Array, k, mid + 1, last);
			}
		}
		System.out.println("Element NOT Found");
		return -1;
	}

	public static void main(String[] args)

	{
		int[] sequence = { 2, 5, 8, 12, 16, 23, 38, 56, 72, 91, 102 };
		BinarySearch2(sequence, 102, 0, (sequence.length) - 1);
	}
}
