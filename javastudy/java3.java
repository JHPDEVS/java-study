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
		System.out.println("�ּ� ������� " + tmp1*tmp2/x);
		System.out.println("�ִ� ������� " + x);
	}
	//�ִ� ����� ���ϱ�
	// �� �� ���ϱ� / �ִ������� �������ֱ�

	public static int gcd(int x, int y) {
		return y;
		// TODO Auto-generated method stub
		
	}
}
