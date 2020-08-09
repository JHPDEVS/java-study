package problem13;

import java.util.*;
public class problem13 {

	public static void main(String[] args)
	{
		char a;
		Scanner input = new Scanner(System.in);
		System.out.println("영문자 하나를 입력하세요");
		a = input.next().charAt(0);

		switch(a)
		{
		case 'a':	
		case 'e':	
		case 'i':	
		case 'o':	
		case 'u':	
			System.out.println("입력한 숫자는 모음");
			break;
		default:
		{
			System.out.println("입력한 숫자는 자음");
			break;
		}
		}
	}
}
	


