package javaproject;

import java.util.*;
public class helloworld {

public static void main(String[] args)
{
hello();
}
public static void test()
{
	int i=10;
	do
	{
	System.out.println(i++ + " �ȳ��ϼ���");
	}
	while(i<=3);
	}
public static void testwhile()
{
	int n=10;
	while(n<3)
	{
		System.out.println(n++ + "");
	}
	System.out.println("�ݺ� �����մϴ�");
}
	public static void hello()
	{
//	������ �Է�
//	�Է¹��� ������ 0���� �۰ų� 100���� ũ�� 
//	�ٽ��Է¹޴´�
//	������ ���� 
//	90-100 : A
//	80-89  : B
//	70 - 79 : C
//	60 - 69 : D
//	�� ���ϴ� : F
	Scanner hello = new Scanner(System.in);
	int grade = 0;
	do
	{
		grade = hello.nextInt();
		if(grade<0 || grade>100)
		{
			System.out.println("������ �ٽ� �Է����ּ���");
		}
	}
	while(grade<0 || grade>100);
	if(grade>=90 && grade<=100)
	{
		System.out.println("A�Դϴ�");
	}
	else if(grade>=80 && grade<90)
	{
		System.out.println("B�Դϴ�");
	}
	else if(grade>=70 && grade<80)
	{
		System.out.println("C�Դϴ�");
	}
	else if(grade>=60 && grade<70)
	{
		System.out.println("D�Դϴ�");
	}
	else
	{
		System.out.println("F�Դϴ�");
	}
	}
	}

