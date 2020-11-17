package javastudy;

import java.util.*;
public class arrstudy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sum(new int[] {1,2,3,4,5,6}));
	}

	public static void hello()
	{
		String[] helloarr = new String[5];
		Scanner hello = new Scanner(System.in);
		for(int i=0;i<helloarr.length;i++)
		{
			helloarr[i] = hello.nextLine();
			System.out.println(helloarr[i]);
		}
	}
	public static int sum(int[] nums)
	{
		int total=0;
		for(int i=0;i<nums.length;i++)
		{
			total += nums[i];
		}
		return total;
	}
}
