package javaproject;

import java.util.*;
/*
 * 
 * 10-16
 * 0이하 15 이상 
 * 백준
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
		System.out.println("반복문이 끝나면 증감식 한번 더 실행" +i);
	}
	
	public static void testfor2()
	{
		/*
		 * 사용자로부터 시작과 끝 숫자를 입력받는다.
		 * 시작~끝 사이의 짝수를 출력하자.
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
		System.out.println("시작과 끝 숫자를 입력해주세요");
		int firstNum2 = hello.nextInt();
		int secondNum2 = hello.nextInt();
		int orgnum = firstNum2;
		int sum = 0;
		for(int i=firstNum2;i<=secondNum2;i++) {
			sum+=i;
		}
		System.out.print(orgnum+"에서"+secondNum2+"까지의 합은"+sum + " ");
	}
	public static void testsum2()
	{
		Scanner hello = new Scanner(System.in);
		System.out.println("시작과 끝 숫자를 입력해주세요");
		int firstNum2 = hello.nextInt();
		int secondNum2 = hello.nextInt();
		int sum=0;
		int orgstart = firstNum2;
		while(firstNum2<=secondNum2)
		{
			sum+=firstNum2;
			firstNum2= firstNum2+1;
			
		}
		System.out.println(orgstart+"에서" + secondNum2+"까지의 합은" + sum);
	}
	public static void testfac()
	{
		Scanner hello = new Scanner(System.in);
		System.out.println("숫자를 입력해주세요");
		int first = hello.nextInt();
		long sum= 1;
		for(int i=first;i>0;i--)
		{
			sum = sum * i;
		}
		System.out.println(first+"!은" + sum);
	}
}
