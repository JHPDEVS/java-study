package problem11;

import java.util.*;
public class problem11 {

	public static void main(String[] args)
	{
		int tall, kg , basic;
		Scanner input = new Scanner(System.in);
		System.out.println("Ű�� �Է��ϼ���");
		tall = input.nextInt();
		System.out.println("�����Ը� �Է��ϼ���");
		kg = input.nextInt();
		basic = (tall - 100) *  9/10;
		if(kg > basic)
		{
			System.out.println("��ü���Դϴ�");
		}
		else if(kg == basic)
		{
			System.out.println("ǥ���Դϴ�");
		}
		else
		{
			System.out.println("��ü���Դϴ�");
		}
		System.out.println(basic);
	}
}
