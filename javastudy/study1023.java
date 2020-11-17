package javaproject;

import java.util.*;
public class study1023 {

	public static void main(String[] args)
	{
		/* 별찍기
		 * 
		 */
		star5();
	}
	
	public static void star()
	{
		Scanner hello = new Scanner(System.in);
		int a = hello.nextInt();
		/*정수를 입력받아 변수 n에 ㅈ ㅓ장,
		 * n개의 행에 다음과 같이 출력한다
		 * 첫행 * n개
		 * 둘째행 n-1개
		 * 셋째행 n-2
		 * n번째행에 1개 
		 * switch 문은 안됨 
		 */
		for(int i=1;i<=a;i++)
		{
		//	for(int j=i;j<=a;j++) 
			/*
			 * n-i 개의 별표를 찍어라
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
		/*정수를 입력받아 변수 n에 ㅈ ㅓ장,
		 * n개의 행에 다음과 같이 출력한다
		 * 첫행 * n개
		 * 둘째행 n-1개
		 * 셋째행 n-2
		 * n번째행에 1개 
		 * switch 문은 안됨 
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
		// 피라미드
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
		 * 1행 :    *
		 * 2행 :   **
		 * 3행 :  ***
		 * 4행 : ****
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
		 * 1행 :    *
		 * 2행 :   **
		 * 3행 :  ***
		 * 4행 : ****
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
		 * 약수 구하는법 
		 * 효율적이게 약수 구하기 (자기 자신을 입력)
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
