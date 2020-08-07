package problem1;

import java.util.*;

public class problem1 {

public static void main(String[] args)
{
	int a;
	Scanner input = new Scanner(System.in);
	System.out.println("마일을 입력하시오 : " );
	a = input.nextInt(); // 마일 입력
	double b = a*1.609;  // 킬로미터 계산식
	System.out.println(a+ "마일은" +b+"킬로미터입니다.");
}
}
