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
		 * �������� �Էµɶ� ���� ������ �ݺ��Ѵ�
		 * jumsu = ����ڰ� �Է��� ��;
		 * sum= sum + jumsu;
		 * ��� : sum / count;
		 */
		while(true)
		{
			System.out.print("������ �Է��ϼ���(���� : -1)");
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
		System.out.println("���" + (double)sum/count); // 2���� ����
		System.out.println("���" + (double)(sum/count));
		System.out.println(count);
	}
	public void hello()
	{
		Scanner hello = new Scanner(System.in);
		long start = System.currentTimeMillis();
		int a= hello.nextInt();
		for(int i=2;i<=a;i++)
		{
			/* �� �ݺ����� 1�� �Ҽ����� �Ǵ��ؼ�,
			 * �Ҽ��̸� �� 1 ���� ������Ѵ�.\
			 * 
			 * 
			 * 2����(i-1)\������ ���� �߿� i�� ���� �� �ִ� ������ �����ϸ� �Ҽ��� �ƴ� ������ �Ǵ�.
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
		System.out.println("����ð� : " + (end-start) + "ms");
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
