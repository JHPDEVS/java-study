package javastudy;

import java.util.*;
public class java1110 {

	public static void main(String[] args)
	{
		minValue();
	}
	public static void hello()
	{
		String s = "���ع��� ��λ��� ������ �⵵��";
		String[] strarr = {"����","����","����","��λ�","�Ѷ��"};
		
		System.out.println("strArr �迭�� ���Դϴ�...");
		for(int i=0;i<strarr.length;i++)
		{
			System.out.println(strarr[i]);
		}
		
		String[] strarr2 = new String[5];
		strarr[0] = "�ѱ�";
		strarr[1] = "�ѱ�";
		strarr[2] = "�ѱ�";
		strarr[3] = "�ѱ�";
		strarr[4] = "�ѱ�";
		
		String[] hobbies = new String[5];
		System.out.println("��� 5������ �Է����ּ���");
		Scanner input = new Scanner(System.in);
		for(int i=0;i<hobbies.length;i++)
		{
			System.out.println(i+1+"���� �Է����ּ���");
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
			System.out.println("�ּҰ��� " + min);
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

