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
	System.out.println(i++ + " 안녕하세요");
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
	System.out.println("반복 종료합니다");
}
	public static void hello()
	{
//	성적을 입력
//	입력받은 성적이 0보다 작거나 100보다 크면 
//	다시입력받는다
//	성적에 따라서 
//	90-100 : A
//	80-89  : B
//	70 - 79 : C
//	60 - 69 : D
//	그 이하는 : F
	Scanner hello = new Scanner(System.in);
	int grade = 0;
	do
	{
		grade = hello.nextInt();
		if(grade<0 || grade>100)
		{
			System.out.println("성적을 다시 입력해주세요");
		}
	}
	while(grade<0 || grade>100);
	if(grade>=90 && grade<=100)
	{
		System.out.println("A입니다");
	}
	else if(grade>=80 && grade<90)
	{
		System.out.println("B입니다");
	}
	else if(grade>=70 && grade<80)
	{
		System.out.println("C입니다");
	}
	else if(grade>=60 && grade<70)
	{
		System.out.println("D입니다");
	}
	else
	{
		System.out.println("F입니다");
	}
	}
	}

