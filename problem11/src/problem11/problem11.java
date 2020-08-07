package problem11;

import java.util.*;
public class problem11 {

	public static void main(String[] args)
	{
		int tall, kg , basic;
		Scanner input = new Scanner(System.in);
		System.out.println("키를 입력하세요");
		tall = input.nextInt();
		System.out.println("몸무게를 입력하세요");
		kg = input.nextInt();
		basic = (tall - 100) *  9/10;
		if(kg > basic)
		{
			System.out.println("과체중입니다");
		}
		else if(kg == basic)
		{
			System.out.println("표준입니다");
		}
		else
		{
			System.out.println("저체중입니다");
		}
		System.out.println(basic);
	}
}
