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
		System.out.println("���� ������ �Է����ּ���");
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
		System.out.println("������ ���� : " + a);
		System.out.println("������ ��: " + sum);
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
	//�Ҽ� ã�� 1���� ū ���� �����߿��� �ڽ��� ���� �� �ִ� �� (��� ã��) , ������� ��� �Ф�
}
