package problem32;

import java.util.*;

public class problem32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int min=0;
		double dap = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("f(x) = x^3-9x+2 x<=0");
		System.out.println("f(x) = 7x+2 x>0");
		System.out.println("X값을 입력해주세요");
		double a = input.nextFloat();
		if (a<=0)
		{
			dap = (a*a*a)+(-9*a)+2;
			System.out.println("f("+a+")"+ "= x^3-9x+2 x<=0의 함수값은"+ dap);
		}
		else
		{
			dap = (7*a) +2;
			System.out.println("f("+a+")"+ "= 7x+2 x>0 의 함수값은"+ dap);
		}
	}

}
