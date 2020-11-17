package javaproject;

import java.util.*;
public class study1103 {
	
	/* int count = 0;
	 * s의 첫번 째 문자부터 마지막 문자까지 반복을 하다
	 * 문자가 'n'이면 count를 1증가시킨다.
	 * 
	 * count를 출력
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
		System.out.println(hello+"에서" + " h의 개수 " + count);
	}
	public static void guessNumber()
	{
		/*
		 * int num = 59; 또는 num에 무작위 정수값(1~1000)을 할당한다.
		 * 
		 * 사용자 num값을 맞출 때까지 다음을 반복
		 * 사용자로부터 정수값을 입력받는다.
		 * count++;
		 * 받은 값이 num과 같으면 반복 중단
		 * 그 값이 num과 같다면 "{$}번에 맞았습니다" 출력
		 * 몇 번만에 맞췄는지 그 횟수도 출력
		 *
		 */
		Random rand = new Random();
		int num = rand.nextInt(1000)+1;
		System.out.println(num);
		Scanner sc = new Scanner(System.in);
		int count=0;
		System.out.println("정답을 추측해 보세요 (1~1000)");
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
				System.out.println("제시하신 값이 랜덤 숫자보다 큽니다");
			}
			else
			{
				System.out.println("제시하신 값이 랜덤 숫자보다 작읍니다");
			}
			continue;
		}
		}
		System.out.println(count + "번만에 맞추셨습니다");
		/*
		  int count = 0 ;
			Sysytem.out.println("정답을 추축해 보세요");
			
		do
		{
			Sysytem.out.println("정답을 추축해 보세요");
			userinput = input.nextInt();
			count++
			if(userInput < num)
			{
			System.out.println("제시하신 값이 랜덤 숫자보다 작습니다");
			}
			else if(userInput> num)
			{
			System.out.println("제시하신 값이 랜덤 숫자보다 큽니다");
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
		System.out.print("로또 1등 확률 : 1/ " + odd);
	}
		 
	    
	}

