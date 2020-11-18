package javastudy;

import java.util.*;

public class study1118 {

	public static void main(String[] args)
	{
		gcd();
	}
	private static void gcd()
	{
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int b = input.nextInt();
		int orga = a;
		int orgb = b;
		int r =1;
		while(b!=0)
		{
			r= a%b;
			a = b;
			b = r;
		}
		System.out.println(a);
		System.out.println(orga*orgb/a);
	}
	private static void arabia()
	{
		Scanner input = new Scanner(System.in);
		char munja = input.next().charAt(0);
	}
}
