package problem31;

import java.util.*;

public class problem31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int min=0;
		Scanner input = new Scanner(System.in);
		System.out.println("���ڸ� �Է����ּ��� ù��°");
		int a = input.nextInt();
		System.out.println("���ڸ� �Է����ּ��� �ι�°");
		int b = input.nextInt();
		System.out.println("���ڸ� �Է����ּ��� ����°");
		int c = input.nextInt();
		if (a>=b && a>=c)
		{
			if(b>=c)
			{
				min = c;
		}
			else
			{
				min =b;
			}
		}
		if (b>=a && b>=c)
		{
			if(a>=c)
			{
				min = c;
		}
			else
			{
				min =a;
			}
		}
		if (c>=b && c>=a)
		{
			if(b>=a)
			{
				min = a;
		}
			else
			{
				min =b;
			}
		}
		System.out.println("���� ���� ����" + min);
	}

}
