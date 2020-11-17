package javaproject;

import java.util.*;

public class study1020 {

	public static void main(String[] args)
	{
		multi2();
	}
	public static void divi()
	{
		Scanner hello = new Scanner(System.in);
		System.out.println("양의 정수를 입력해주세요");
		int first = hello.nextInt();
		for(int i=1;i<=first;i++)
		{
			if(first%i==0)
			{
				System.out.print(i);
				/*
				 * System.out.print("1");
				 * if(first%i==0)
				 * {
				 * System.out.println(","+i);
				 * }
				 */
				if(i==first)
				{
					
				}
				else
				{
					System.out.print(",");
				}
			}
		}
		hello.close();
	}
	
	public static void random()
	{
		Scanner hell = new Scanner(System.in);
		int a= hell.nextInt();
		int sum=0;
		int tmp=0;
		Random rand = new Random();
		for(int i=1;i<=a;i++)
		{
			
			tmp =rand.nextInt(100)+1;
			System.out.print(tmp + " ");
			sum += tmp;
		}
		System.out.println("난수의 개수 : " + a);
		System.out.println("난수의 합: " + sum);
	}
	
	public static void multidupi()
	{
		/*
		 * for(i=1;i<=5;i++)
		 * {
		 * System.out.println("*****");
		 * }
		 */
		for(int i=0;i<6;i++)
		{
			for(int j=0;j<5;j++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
	}
	
	public static void multi2()
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=5;j>=1;j--)
			{
				if(j<=i)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
	}
	public static void multi3()
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(i>=j)
				{
				System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
	}
	//소수 찾기 1보다 큰 양의 정수중에서 자신을 나눌 수 있는 수 (약수 찾기) , 마름모로 찍기 ㅠㅠ
}
