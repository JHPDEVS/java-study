package problem13;

import java.util.*;
public class problem13 {

	public static void main(String[] args)
	{
		char a;
		Scanner input = new Scanner(System.in);
		System.out.println("������ �ϳ��� �Է��ϼ���");
		a = input.next().charAt(0);

		switch(a)
		{
		case 'a':	
		case 'e':	
		case 'i':	
		case 'o':	
		case 'u':	
			System.out.println("�Է��� ���ڴ� ����");
			break;
		default:
		{
			System.out.println("�Է��� ���ڴ� ����");
			break;
		}
		}
	}
}
	


