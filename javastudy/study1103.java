package javaproject;

import java.util.*;
public class study1103 {
	
	/* int count = 0;
	 * s�� ù�� ° ���ں��� ������ ���ڱ��� �ݺ��� �ϴ�
	 * ���ڰ� 'n'�̸� count�� 1������Ų��.
	 * 
	 * count�� ���
	 */
	public static void main(String[] args)
	{
		lotto();
	}
	public static void continue1()
	{
		int count = 0;
		// String hello = "hello world";
		String hello = new String("hello world happy world");
		char first = hello.charAt(0);
		for(int i=0;i< hello.length();i++)
		{
//			if(hello.charAt(i) == 'h')
//			{
//				count++;
//			}
			if(hello.charAt(i) != 'h')
			{
				continue;
			}
			count++;
		}
		System.out.println(hello+"����" + " h�� ���� " + count);
	}
	public static void guessNumber()
	{
		/*
		 * int num = 59; �Ǵ� num�� ������ ������(1~1000)�� �Ҵ��Ѵ�.
		 * 
		 * ����� num���� ���� ������ ������ �ݺ�
		 * ����ڷκ��� �������� �Է¹޴´�.
		 * count++;
		 * ���� ���� num�� ������ �ݺ� �ߴ�
		 * �� ���� num�� ���ٸ� "{$}���� �¾ҽ��ϴ�" ���
		 * �� ������ ������� �� Ƚ���� ���
		 *
		 */
		Random rand = new Random();
		int num = rand.nextInt(1000)+1;
		System.out.println(num);
		Scanner sc = new Scanner(System.in);
		int count=0;
		System.out.println("������ ������ ������ (1~1000)");
		while(true)
		{
		int guess = sc.nextInt();
		count++;
		if(num == guess)
		{
			break;
		}
		else
		{
			if(guess>num)
			{
				System.out.println("�����Ͻ� ���� ���� ���ں��� Ů�ϴ�");
			}
			else
			{
				System.out.println("�����Ͻ� ���� ���� ���ں��� �����ϴ�");
			}
			continue;
		}
		}
		System.out.println(count + "������ ���߼̽��ϴ�");
		/*
		  int count = 0 ;
			Sysytem.out.println("������ ������ ������");
			
		do
		{
			Sysytem.out.println("������ ������ ������");
			userinput = input.nextInt();
			count++
			if(userInput < num)
			{
			System.out.println("�����Ͻ� ���� ���� ���ں��� �۽��ϴ�");
			}
			else if(userInput> num)
			{
			System.out.println("�����Ͻ� ���� ���� ���ں��� Ů�ϴ�");
			}
		}while(userInput!=num);
		*/
	}
	public static void lotto()
	{
		int ball = 45;
		int ball2 = 39;
		int ball3 = 6;
		int pick = 6;
		int pick2 = 3;
		int pick3 = 3;
		int odd = 1;
		int odd2 = 1;
		int odd3 = 1;
		for(int i=1;i<=pick;i++)
		{
			odd = odd * (ball-i+1)/i;
		}
	/*	for(int i=1;i<=pick2;i++)
		{
			odd2 = odd2 * (ball2-i+1)/i;
		}
		for(int i=1;i<=pick3;i++)
		{
			odd3 = odd3 * (ball3-i+1)/i;
		}*/
//		System.out.println(odd2);
//		System.out.println(odd2*odd3 + "/" + odd);
		System.out.print("�ζ� 1�� Ȯ�� : 1/ " + odd);
	}
		 
	    
	}

