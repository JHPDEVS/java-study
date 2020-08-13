package problem31;

import java.util.*;

public class problem31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int min=0;
		Scanner input = new Scanner(System.in);
		System.out.println("숫자를 입력해주세요 첫번째");
		int a = input.nextInt();
		System.out.println("숫자를 입력해주세요 두번째");
		int b = input.nextInt();
		System.out.println("숫자를 입력해주세요 세번째");
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
		System.out.println("가장 작은 값은" + min);
	}

}
