package javastudy;

import java.util.Scanner;

public class java1106 {

	public static void main(String[] args)
	{
		array2();
	}
	public static void pi()
	{
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		double divisior = 1;
		double bunja = 4;
		double pi = 0;
	System.out.print("������ �׽�Ʈ");
	for(int i=1;i<=n;i++)
	{
		divisior = (i-1)*2+1;
		bunja = bunja*-1;
		 pi = pi+ bunja/divisior;
	}
	System.out.println("���̴�" + pi);
	}
	public static void array()
	{
		/*�迭 , array;
		int score1, score2, score3, score4, score5;
		
		Scanner input = new Scanner(System.in);
		// score1 = input.nextInt(); �̰� 5�� �ݺ��Ѵٰ��ϸ� �ʹ� ��ȿ�����̴�.
		 * 
		 */
		
	  /*
	   *  int[] scores = new int [10] ;  �̷��� ���� 
	   *  �迭�� �������̴�
	   *  �������� �������� ������ �������� 
	   */
		int score[] = new int[5];
		// int[] score= new int[5];
		Scanner input = new Scanner(System.in);
		for(int i=0;i<score.length;i++) // i<=score.lengthx
		{
			score[i] = input.nextInt();
			int value = score[i];
			System.out.print(i+1 + "��° ����" + value +" ");
			
			// ���߰��� arrayList ��� �ڵ������� �������ִ� ���α׷��� ����	
		}

	}
	public static void array2()
	{
		//arr = {7,8,9,10} �̷����ϴ°� �ȵ�
		//int[5] arr = new int[]; ���ʿ� ���� �Ҵ� �ȵ�
		Scanner input = new Scanner(System.in);
		/*
		 * ����ڷκ��� ��� ������ �Է����� �� ũ�⸦ �Է¹޴´�,
		 * �� ũ���� �迭������ �����Ѵ�.
		 * 
		 * �迭�� ũ�⸸ŭ ������ �ݺ��Ѵ�.
		 * ����ڷκ��� ������ �Է¹޾� �迭�� ������� �����Ѵ�.
		 * 
		 * �迭�� ù��° ���Һ��� ������ ���ұ��� ����Ѵ�
		 * �� �������� ����� ����Ѵ�.
		 * 
		 * Ȥ�ó� �����̵Ǹ�
		 * �Էµ� ���� �� �ִ������� ����Ѵ�.
		 */
		System.out.println("��� ������ �Է��Ͻó���?");
		int n = input.nextInt();
		int[] arr = new int[n];
		int sum = 0;
		int max = 0;
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(i+1+"���� �Է����ּ���");
			arr[i] = input.nextInt();
			System.out.println(i+1+"����" + arr[i] + " ");
			sum = sum+ arr[i];
			if(arr[i] > max)
			{
			max = arr[i];
			}
	//		int[] scrore[1,2,3,4];
	//		intp[ arrp10] = new int(��) 
		}
		System.out.println("������ ���" + sum/arr.length);
		System.out.println("�ִ� ����" + max);
		
	}
}