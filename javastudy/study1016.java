package javaproject;

import java.util.*;
/*
 * 
 * 10-16
 * 0���� 15 �̻� 
 * ����
 */

public class study1016 {

	public static void main(String[] args)
	{
		testfor();
	}
	
	public static void testfor()
	{
		int i=0;
		for(;;)
		{
			if(i<=4)
			{
			System.out.print(i + " ");
			i++;
			}
			else
			{
				break;
			}
		}
		System.out.println("�ݺ����� ������ ������ �ѹ� �� ����" +i);
	}
	
	public static void testfor2()
	{
		/*
		 * ����ڷκ��� ���۰� �� ���ڸ� �Է¹޴´�.
		 * ����~�� ������ ¦���� �������.
		 * 
		 */
		Scanner input = new Scanner(System.in);
		int firstNum = input.nextInt();
		int secondNum = input.nextInt();
		for(int i=firstNum;i<=secondNum;i++)
		{
			if(i%2==0)
			{
				System.out.print(i + " ");
			}
		}
	}
	
	public static void testsum()
	{
		Scanner hello = new Scanner(System.in);
		System.out.println("���۰� �� ���ڸ� �Է����ּ���");
		int firstNum2 = hello.nextInt();
		int secondNum2 = hello.nextInt();
		int orgnum = firstNum2;
		int sum = 0;
		for(int i=firstNum2;i<=secondNum2;i++) {
			sum+=i;
		}
		System.out.print(orgnum+"����"+secondNum2+"������ ����"+sum + " ");
	}
	public static void testsum2()
	{
		Scanner hello = new Scanner(System.in);
		System.out.println("���۰� �� ���ڸ� �Է����ּ���");
		int firstNum2 = hello.nextInt();
		int secondNum2 = hello.nextInt();
		int sum=0;
		int orgstart = firstNum2;
		while(firstNum2<=secondNum2)
		{
			sum+=firstNum2;
			firstNum2= firstNum2+1;
			
		}
		System.out.println(orgstart+"����" + secondNum2+"������ ����" + sum);
	}
	public static void testfac()
	{
		Scanner hello = new Scanner(System.in);
		System.out.println("���ڸ� �Է����ּ���");
		int first = hello.nextInt();
		long sum= 1;
		for(int i=first;i>0;i--)
		{
			sum = sum * i;
		}
		System.out.println(first+"!��" + sum);
	}
}
