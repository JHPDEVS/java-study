package javastudy;

import java.util.*;
public class java1113 {

	public static void main(String[] args)
	{
		reservetheater();
	}
	public static void array1()
	{
		int[] hello = {50,50,50,5,4,8};
		Scanner input = new Scanner(System.in);
		System.out.println("ã�� ���� �Է����ּ���");
		int gap = input.nextInt();
		int value = -1;
		for(int i=0;i<hello.length;i++)
		{
			if(hello[i]==gap)
			{
				value = i;
				System.out.println(i+"��ġ�� " + gap + "�� �ֽ��ϴ�");
				break;
			}
		}
	}
	private static void sequential()
	{
		int[] source = new int[10];
		Random rand = new Random();
		
		for(int i=0;i<source.length;i++)
		{
			source[i] = rand.nextInt(100)+1;
		}
		System.out.println("1~100 ������ ���� �� ã�� ���� ����?");
		Scanner input = new Scanner(System.in);
		int value = input.nextInt();
		int i=0;
		for(;i<source.length;i++)
		{
			if(source[i]==value)
			{
			break;
			}
		}
		if(i<source.length)
		{
			System.out.println("�� ����" + i+1 + "������ �ֽ��ϴ�");
		}
		else
		{
			System.out.println("�� ã����");

		}
		for(i=0;i<source.length;i++)
		{
			System.out.print(source[i] + " ");
		}
	}
	
	private static void dice()
	{
		/*
		 * �ֻ����� ���� ������ ��
		 * 1~6���� ���� �� �� ���������� �迭�� �����ϰ� �������,
		 * �迭 �ε��� 0�� 1��,
		 * ....
		 * �迭 �ε��� 5�� 6���� ��Ÿ���ٰ� ��������.
		 */
		final int SIZE = 6;
		
		int dice[] = new int[SIZE];
		
		for(int i=0; i<10000;i++)
		{
//			System.out.println((int) (Math.random()*SIZE));
			int num = (int)(Math.random()*SIZE); //0~5������ ��
			++dice[num]; //dice[num]  = dice[num] +1 ;
		}
		for(int i=0;i<dice.length;i++)
		{
			System.out.println(i+1+"���� ���� Ƚ��" + dice[i]);
		}
	}
	
	private static void reservetheater()
	{
		/*
		 *  �¼� ���� 10��, ������ �迭�� ǥ��,
		 *  �迬 �ε��� 0�� �¼���ȣ 1��
		 *  �迭 �ε��� 1�� �¼���ȣ 1��
		 *  ������ ���� �ݺ� �Ѵ�.
		 *  ���� ���� �¼� ���¸� ����Ѵ�.
		 *  ����ڷκ��� ���� �¼� ��ȣ�� ����Ѵ�.
		 *  ����ڰ� �¼���ȣ�� �������� �Է��ϸ� �ݺ��� �����Ѵ�.
		 *  �Էµ� �¼��� �����Ѵ�.(����� �ڸ��� 1�� ǥ��)
		 *  �̹� ����� �¼��̸� �̹� ����� �¼��̶�� ����Ѵ�.
		 *  ����ڰ� �¼���ȣ�� �������� �Է��ϸ� �ݺ��� �����Ѵ�.
		 *  
		 */
		final int numofseats= 10;
		int seat[] = new int[numofseats];
		Scanner hello = new Scanner(System.in);
		while(true)
		{
			System.out.println("##############################");
			for(int i=1;i<=numofseats;i++)
			{
				System.out.print(i + "  ");
			}
			System.out.println(" ");
			for(int i=0;i<seat.length;i++)
			{
				System.out.print(seat[i] +"  ");
			}
			System.out.println("\n##############################");
			System.out.println("����� �¼���ȣ :");
			int a = hello.nextInt();
			if(a<=0)
			{
				System.out.println("���Ÿ� �����մϴ�");
				break;
			}
			if(a>numofseats)
			{
				System.out.println("�¼���ȣ�� 1���� 10������ �Դϴ�.");
				continue;
			}
			if(seat[a-1]==1)
			{
				System.out.println("�̹� ����� �¼��Դϴ�");
			}
			else
			{
				++seat[a-1];
				System.out.println("���ް� �Ϸ�Ǿ����ϴ�.");
			}
			
		}
	}
}
