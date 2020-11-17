package javastudy;

import java.util.Scanner;

public class java1106 {

	public static void main(String[] args)
	{
		array2();
	}
	public static void pi()
	{
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		double divisior = 1;
		double bunja = 4;
		double pi = 0;
	System.out.print("컴파일 테스트");
	for(int i=1;i<=n;i++)
	{
		divisior = (i-1)*2+1;
		bunja = bunja*-1;
		 pi = pi+ bunja/divisior;
	}
	System.out.println("파이는" + pi);
	}
	public static void array()
	{
		/*배열 , array;
		int score1, score2, score3, score4, score5;
		
		Scanner input = new Scanner(System.in);
		// score1 = input.nextInt(); 이걸 5번 반복한다고하면 너무 비효율적이다.
		 * 
		 */
		
	  /*
	   *  int[] scores = new int [10] ;  이렇게 선언 
	   *  배열은 참조형이다
	   *  기초형과 참조형의 차이점 기초형은 
	   */
		int score[] = new int[5];
		// int[] score= new int[5];
		Scanner input = new Scanner(System.in);
		for(int i=0;i<score.length;i++) // i<=score.lengthx
		{
			score[i] = input.nextInt();
			int value = score[i];
			System.out.print(i+1 + "번째 원소" + value +" ");
			
			// 나중가면 arrayList 라고 자동적으로 관리해주는 프로그램이 있음	
		}

	}
	public static void array2()
	{
		//arr = {7,8,9,10} 이렇게하는건 안됨
		//int[5] arr = new int[]; 왼쪽에 숫자 할당 안됨
		Scanner input = new Scanner(System.in);
		/*
		 * 사용자로부터 몇개의 점수를 입력할지 그 크기를 입력받는다,
		 * 그 크기의 배열변수를 생성한다.
		 * 
		 * 배열의 크기만큼 다음을 반복한다.
		 * 사용자로부터 점수를 입력받아 배열에 순서대로 저장한다.
		 * 
		 * 배열의 첫번째 원소부터 마지막 원소까지 출력한다
		 * 그 점수들의 평균을 출력한다.
		 * 
		 * 혹시나 여력이되면
		 * 입력된 점수 중 최대점수를 출력한다.
		 */
		System.out.println("몇개의 점수를 입력하시나요?");
		int n = input.nextInt();
		int[] arr = new int[n];
		int sum = 0;
		int max = 0;
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(i+1+"번재 입력해주세요");
			arr[i] = input.nextInt();
			System.out.println(i+1+"번재" + arr[i] + " ");
			sum = sum+ arr[i];
			if(arr[i] > max)
			{
			max = arr[i];
			}
	//		int[] scrore[1,2,3,4];
	//		intp[ arrp10] = new int(ㅇ) 
		}
		System.out.println("점수의 평균" + sum/arr.length);
		System.out.println("최대 점수" + max);
		
	}
}