package javaproject;

import java.util.*;
public class java3 {

	public static void main(String[] args)
	{
		Scanner hello = new Scanner(System.in);

		int x = hello.nextInt();
		int y = hello.nextInt();
		int r = 0;
		if(x>y)
		{
			
		}
		else
		{
			int tmp = y;
			y = x;
			x= tmp;
		}
		System.out.println(x);
		System.out.println(y);
		int tmp1= x;
		int tmp2 = y;
		while(y!=0)
		{
			if(y==0)
			{
				r = x;
			}
			r = x% y;
			x = y;
			y = r;
		}
		System.out.println("최소 공배수는 " + tmp1*tmp2/x);
		System.out.println("최대 공약수는 " + x);
	}
	//최대 공배수 구하기
	// 두 수 곱하기 / 최대공약수로 나누어주기

	public static int gcd(int x, int y) {
		return y;
		// TODO Auto-generated method stub
		
	}
}
