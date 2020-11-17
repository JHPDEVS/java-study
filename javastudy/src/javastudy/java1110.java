package javastudy;

import java.util.*;
public class java1110 {

	public static void main(String[] args)
	{
		minValue();
	}
	public static void hello()
	{
		String s = "동해물과 백두산이 마르고 닳도록";
		String[] strarr = {"동해","서해","남해","백두산","한라산"};
		
		System.out.println("strArr 배열의 값입니다...");
		for(int i=0;i<strarr.length;i++)
		{
			System.out.println(strarr[i]);
		}
		
		String[] strarr2 = new String[5];
		strarr[0] = "한국";
		strarr[1] = "한국";
		strarr[2] = "한국";
		strarr[3] = "한국";
		strarr[4] = "한국";
		
		String[] hobbies = new String[5];
		System.out.println("취미 5가지를 입력해주세요");
		Scanner input = new Scanner(System.in);
		for(int i=0;i<hobbies.length;i++)
		{
			System.out.println(i+1+"번쨰 입력해주세요");
			hobbies[i] = input.nextLine();
		}
		for(int i=0;i<hobbies.length;i++)
		{
			System.out.println(hobbies[i]);
		}
	}
		public static void minValue() {
			
			int[] price = new int[10];
			Random rand = new Random();
			int min =0;
			for(int i=0;i<price.length;i++)
			{
				price[i] = rand.nextInt(100) + 100;
			}
			min = price[0];
			getminimum2(price);
			System.out.println(array2string(price));
			System.out.println("최소값은 " + min);
		}
		private static String array2string(int[] arr)
		{
			int arr2[] = new int[10];
			int[] arr3 = new int[10];
			int[] arr6 = {1,2,3,4,5,6,7};
			int arr8[] = new int[10];
			String s = "[";
			for(int i=0;i<arr.length-1;i++)
			{
				s = s + arr[i] + ", ";
			}
			s= s + arr[arr.length-1]+ "]";
			
			return s;
		}
		private static int getminimum2(int[] arr)
		{
			int min = arr[0];
			for(int i=0;i<arr.length;i++)
			{
				if(arr[i]< min)
				{
					min = arr[i];
				}
			}
			return min;
		}
	}

