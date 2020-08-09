package problem3;

import java.util.*;

public class problem3 {

public static void main(String[] args)
{
	Scanner input = new Scanner(System.in); 
	final double pie = 3.141592; // 파이 값
	System.out.println("구의 부피를 계산해주는 프로그램입니다" );
	System.out.println("반지름을 입력해주세요 : " );
	double r = input.nextDouble(); // 반지름
	double v = (double) 4/3*pie*r*r*r; // 부피  (double)를 빼게되면 값이 이상한 값으로 나옴
	System.out.println("구의 부피 : " + v );
}
}
