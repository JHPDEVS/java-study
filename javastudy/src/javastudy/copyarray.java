package javastudy;

public class copyarray {

	public static void main(String[] args)
	{
		int[] arr = new int[5];
		copy(arr,5);
	}
	public static int[] copy(int[] arr , int length)
	{
		int[] copy = new int[length];
		for(int i=0;i<length;i++)
		{
			copy[i] = arr[i];
		}
		return copy;
		
	}
}
