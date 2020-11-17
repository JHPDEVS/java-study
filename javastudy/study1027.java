package javaproject;

import java.util.*;

public class study1027 {

	public static void main(String[] args)
	{
		getaver();
	}
	
	public static void getaver()
	{
		Scanner input = new Scanner(System.in);
		int jumsu = 0;
		int sum = 0;
		int count = 0;
		/*
		 * 음수값이 입력될때 까지 다음을 반복한다
		 * jumsu = 사용자가 입력한 값;
		 * sum= sum + jumsu;
		 * 평균 : sum / count;
		 */
		while(true)
		{
			System.out.print("점수를 입력하세요(종료 : -1)");
			jumsu = input.nextInt();
			if(jumsu >0)
			{
				count++;
				sum += jumsu;
			}
			else
			{
				break;
							}
		}
		System.out.println("평균" + (double)sum/count); // 2개의 차이
		System.out.println("평균" + (double)(sum/count));
		System.out.println(count);
	}
	public void hello()
	{
		Scanner hello = new Scanner(System.in);
		long start = System.currentTimeMillis();
		int a= hello.nextInt();
		for(int i=2;i<=a;i++)
		{
			/* 각 반복마다 1가 소수인지 판단해서,
			 * 소수이면 그 1 값을 출력혁한다.\
			 * 
			 * 
			 * 2ㅂ팀(i-1)\까지의 정수 중에 i를 나눌 수 있는 정수가 존재하면 소수가 아닌 것으로 판단.
			 * 
			 */
			boolean isPrime= true;
			for(int j=2;j<i;j++)
			{
			  if(i%j==0)
			  {	
				 isPrime= false;
				 break;
			  }
			}
			if(isPrime)
			{
				System.out.print(i+" ");
			}
		}
		long end = System.currentTimeMillis();
		System.out.println("경과시간 : " + (end-start) + "ms");
	}

	public static void hello2()
	{
	Scanner hello = new Scanner(System.in);
	int n = hello.nextInt();
	
	for(int i=2;i<=n;i++)
	{
		boolean isPrime = true;
		for(int j=2;j<i;j++)
		{
			if(i%j==0)
			{
				isPrime=false;
				break;
			}
		}
		if(isPrime)
		{
			System.out.print(i + " ");
		}
	}
		
		
	}
	
	public static void hello3()
	{
	Scanner hello = new Scanner(System.in);
	int n = hello.nextInt();
	
	for(int i=2;i<=n;i++)
	{
		boolean isPrime= true;
		for(int j=2;j<i;j++)
		{
			if(i%j==0)
			{
				isPrime = false;
				break;
			}
		}
		if(isPrime)
		{
			System.out.print(i+" ");
		}
	}
		
		
	}
}
