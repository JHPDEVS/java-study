package javastudy;

import java.util.Random;
import java.util.*;

public class java1120 {

	public static void main(String[] args)
	{
//	{	if(args.length>0)
//	{
//		int n1, n2;
//		//wrapper.class int> integer,short > Short , long > Long
//		n1 = Integer.parseInt(args[0]);
//		n2 = Integer.parseInt(args[1]);
//		System.out.println("합" + (n1+n2));
//		if(args.length!=2)
//		{
//			System.out.println("사용법 > java practice");
//			return;
//		}
//		System.out.println("메인 메소드로 전달된 인자");
//		for(int i=0;i<args.length;i++)
//		{
//			System.out.println(args[i]);
//		}
//	}
//		else
//		{
//			System.out.println("메인 메소드로 전달된 인자가 없습니다");
//		}
	secondarray();
	}
	
	private static void java1() {
		Random random = new Random();
		int[] nums = new int[20];
		for(int i=0;i<nums.length;i++)
		{
			nums[i] = random.nextInt(100)+1;
		}
		display(nums);
//		Arrays.sort(nums);
//		display(nums);
		selectionSort(nums);
		display(nums);
	}
	private static void display(int[] arr)
	{
		for(int n : arr)
		{
			System.out.print(n+ " ");
		}
		System.out.println();
	}
	 
	private static void selectionSort(int[] arr)
	{
		for(int i=0;i<arr.length-1;i++)
		{
			int minIdx= i;
			/*배열의 인덱스를 i+1부터 마지막 원소의 인덱스까지 증가시키면서
			 * 제일 작은 원소값의 인덱스를 찾아 minidx에 넣자
			 * 
			 */
			for(int j = i+1;j<arr.length;j++)
			{
				if(arr[minIdx]>arr[j])
				{
					minIdx = j;
				}
				swap(arr, i ,minIdx);
			}
		}
	}
	
	private static void swap(int[] arr, int idx1, int idx2)
	{
		int tmp = arr[idx1];
		arr[idx1] = arr[idx2];
		arr[idx2] = tmp;
	}
	
	private static void secondarray()
	{
		int[][] array = new int[3][40];
		for(int i=0;i<array.length;i++)
		{
			for(int j=0;j<array[i].length;j++)
			{
				array[i][j] = j;
			}
		}
		for(int i=0;i<array.length;i++)
		{
			for(int j=0;j<array[i].length;j++)
			{
				System.out.print(array[i][j] + " ");
			}
			System.out.println("");
			//System.out.printf("%3d ",  ja[i][j]);
		}
	}
	
	private static void generateint(int[] arr)
	{
		Random rand = new Random();
		for(int i=0;i<arr.length;i++)
		{
			arr[i] = rand.nextInt(100)+1;
		}
	}
}
