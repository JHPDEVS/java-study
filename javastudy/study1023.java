package javaproject;

import java.util.*;
public class study1023 {

	public static void main(String[] args)
	{
		/* �����
		 * 
		 */
		star5();
	}
	
	public static void star()
	{
		Scanner hello = new Scanner(System.in);
		int a = hello.nextInt();
		/*������ �Է¹޾� ���� n�� �� ����,
		 * n���� �࿡ ������ ���� ����Ѵ�
		 * ù�� * n��
		 * ��°�� n-1��
		 * ��°�� n-2
		 * n��°�࿡ 1�� 
		 * switch ���� �ȵ� 
		 */
		for(int i=1;i<=a;i++)
		{
		//	for(int j=i;j<=a;j++) 
			/*
			 * n-i ���� ��ǥ�� ����
			 */
			for(int j=1;j<=a-i;j++) 
			{
				System.out.print("*");
			}
			System.out.println("");
		}
	}
	public static void star2()
	{
		Scanner hello = new Scanner(System.in);
		int n = hello.nextInt();
		/*������ �Է¹޾� ���� n�� �� ����,
		 * n���� �࿡ ������ ���� ����Ѵ�
		 * ù�� * n��
		 * ��°�� n-1��
		 * ��°�� n-2
		 * n��°�࿡ 1�� 
		 * switch ���� �ȵ� 
		 */
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(j>i)
				{
				System.out.print("*");
				}
			}
			System.out.println(" ");
		}
	}
	public static void star3()
	{
		Scanner hello = new Scanner(System.in);
		int a = hello.nextInt();
		for(int i=1;i<=a;i++)
		{
			for(int j=1;j<=i;j++)
			{
				
				System.out.print("*");
			}
			System.out.println("");
		}
	}
	public static void star4()
	{
		Scanner hello = new Scanner(System.in);
		int a = hello.nextInt();
		for(int i=1;i<=a;i++)
		{
			for(int j=1;j<=a;j++)
			{
				if(i<=j)
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
		hello.close();
	}
	public static void star5()
	{
		// �Ƕ�̵�
		Scanner hello = new Scanner(System.in);
		int a = hello.nextInt();
		for(int i=1;i<=a;i++)
		{
			for(int j=1; j<=a-i;j++)
			{
				System.out.print(" ");
			}
			for(int j=1; j<=2*i-1;j++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
		for(int i=a-1;i>0;i--)
		{
			for(int j=1; j<=a-i;j++)
			{
				System.out.print(" ");
			}
			for(int j=1; j<=2*i-1;j++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
		hello.close();
	}
	public static void star6()
	{
		/*
		 * 1�� :    *
		 * 2�� :   **
		 * 3�� :  ***
		 * 4�� : ****
		 * for(i=0;i<n;i++)
		 * {
		 * for(int j =0 ; j<n;j++)
		 * {
		 * if(j<n-1-i){
		 * System.out.print(" ");
		 * }
		 * else
		 * {
		 * System.out.print("*");
		 * }
		 */
		Scanner hello = new Scanner(System.in);
		int a = hello.nextInt();
		for(int i=1;i<=a;i++)
		{
		for(int j=a;j>=1;j--)
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
		hello.close();
	}
	public static void star7()
	{
		/*
		 * 1�� :    *
		 * 2�� :   **
		 * 3�� :  ***
		 * 4�� : ****
		 * for(i=0;i<n;i++)
		 * {
		 * for(int j =0 ; j<n;j++)
		 * {
		 * if(j<n-1-i){
		 * System.out.print(" ");
		 * }
		 * else
		 * {
		 * System.out.print("*");
		 * }
		 */
		Scanner hello = new Scanner(System.in);
		int a = hello.nextInt();
		for(int i=0;i<a;i++)
		{
		for(int j=0;j<a-1-i;j++)
		{
			System.out.print(" ");
		}
		for(int j=0;j<=i;j++)		
		{
			System.out.print("*");
		}
			System.out.println("");
		}
		hello.close();
	}
	public static void yaksu()
	{
		/*
		 * ��� ���ϴ¹� 
		 * ȿ�����̰� ��� ���ϱ� (�ڱ� �ڽ��� �Է�)
		 */
		Scanner hello = new Scanner(System.in);
		int n = hello.nextInt();
		for(int i=1;i<=n;i++)		
		{
			if(n%i==0)
			{
				System.out.print(","+i);
				
		}
		}
		hello.close();
	}
}
