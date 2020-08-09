package problem12;

import java.util.*;
public class problem12 {

	public static void main(String[] args)
	{
		int a, b , c;
		int max = 0 , min = 0 , middle = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("크기 순 정렬 프로그램");
		System.out.println("A를 입력하세요");
		a = input.nextInt();
		System.out.println("B를 입력하세요");
		b = input.nextInt();
		System.out.println("C를 입력하세요");
		c = input.nextInt();
	if(a>=b && a>=c)
	{
		max = a;
		if(b>=c)
		{
			middle = b;
			min = c;
		}
		else
		{
			middle = c;
			min = b;
		}
	}
	else if(b>=a && b>=c)
	{
		max = b;
		if(a>=c)
		{
			middle = a;
			min = c;
		}
		else
		{
			middle = c;
			min = a;
		}
	}
	else if(c>=a && c>=a)
	{
		max = c;
		if(a>=b)
		{
			middle = a;
			min = b;
		}
		else
		{
			middle = b;
			min = a;
		}
	}
		System.out.print(max + " ");
		System.out.print(middle + " ");
		System.out.print(min + " ");
	}
}
