package javastudy;

import java.util.*;
public class java1113 {

	public static void main(String[] args)
	{
		reservetheater();
	}
	public static void array1()
	{
		int[] hello = {50,50,50,5,4,8};
		Scanner input = new Scanner(System.in);
		System.out.println("찾을 값을 입력해주세요");
		int gap = input.nextInt();
		int value = -1;
		for(int i=0;i<hello.length;i++)
		{
			if(hello[i]==gap)
			{
				value = i;
				System.out.println(i+"위치에 " + gap + "이 있습니다");
				break;
			}
		}
	}
	private static void sequential()
	{
		int[] source = new int[10];
		Random rand = new Random();
		
		for(int i=0;i<source.length;i++)
		{
			source[i] = rand.nextInt(100)+1;
		}
		System.out.println("1~100 사이의 정수 중 찾고 싶은 값은?");
		Scanner input = new Scanner(System.in);
		int value = input.nextInt();
		int i=0;
		for(;i<source.length;i++)
		{
			if(source[i]==value)
			{
			break;
			}
		}
		if(i<source.length)
		{
			System.out.println("그 값은" + i+1 + "번쨰에 있습니다");
		}
		else
		{
			System.out.println("못 찾았음");

		}
		for(i=0;i<source.length;i++)
		{
			System.out.print(source[i] + " ");
		}
	}
	
	private static void dice()
	{
		/*
		 * 주사위를 만번 던졌을 때
		 * 1~6면이 각각 몇 번 나오는지를 배열에 저장하고 출력하자,
		 * 배열 인덱스 0은 1면,
		 * ....
		 * 배열 인덱스 5는 6면을 나타낸다고 가정하자.
		 */
		final int SIZE = 6;
		
		int dice[] = new int[SIZE];
		
		for(int i=0; i<10000;i++)
		{
//			System.out.println((int) (Math.random()*SIZE));
			int num = (int)(Math.random()*SIZE); //0~5사이의 값
			++dice[num]; //dice[num]  = dice[num] +1 ;
		}
		for(int i=0;i<dice.length;i++)
		{
			System.out.println(i+1+"면이 나온 횟수" + dice[i]);
		}
	}
	
	private static void reservetheater()
	{
		/*
		 *  좌석 수는 10개, 정수형 배열로 표현,
		 *  배연 인덱스 0은 좌석번호 1번
		 *  배열 인덱스 1은 좌석번호 1번
		 *  다음을 무한 반복 한다.
		 *  현재 극장 좌석 상태를 출력한다.
		 *  사용자로부터 예약 좌석 번호를 출력한다.
		 *  사용자가 좌석번호를 음수값을 입력하면 반복을 종료한다.
		 *  입력된 좌석을 예약한다.(예약된 자리는 1로 표시)
		 *  이미 예약된 좌석이면 이미 예약된 좌석이라고 출력한다.
		 *  사용자가 좌석번호를 음수값을 입력하면 반복을 종료한다.
		 *  
		 */
		final int numofseats= 10;
		int seat[] = new int[numofseats];
		Scanner hello = new Scanner(System.in);
		while(true)
		{
			System.out.println("##############################");
			for(int i=1;i<=numofseats;i++)
			{
				System.out.print(i + "  ");
			}
			System.out.println(" ");
			for(int i=0;i<seat.length;i++)
			{
				System.out.print(seat[i] +"  ");
			}
			System.out.println("\n##############################");
			System.out.println("예약될 좌석번호 :");
			int a = hello.nextInt();
			if(a<=0)
			{
				System.out.println("예매를 종료합니다");
				break;
			}
			if(a>numofseats)
			{
				System.out.println("좌석번호는 1에서 10번까지 입니다.");
				continue;
			}
			if(seat[a-1]==1)
			{
				System.out.println("이미 예약된 좌석입니다");
			}
			else
			{
				++seat[a-1];
				System.out.println("예메가 완료되었습니다.");
			}
			
		}
	}
}
