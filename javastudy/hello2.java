package javaproject;

import java.util.*;
public class hello2 {

	public static void main(String[] args)
	{
		Scanner hello = new Scanner(System.in);

		int x = hello.nextInt();
		int y = hello.nextInt();
		int r = 0;
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
		System.out.println("최대 공약수는 " + x);
		hello.close();
	}
}
