package problem3;

import java.util.*;

public class problem3 {

public static void main(String[] args)
{
	Scanner input = new Scanner(System.in); 
	final double pie = 3.141592; // ���� ��
	System.out.println("���� ���Ǹ� ������ִ� ���α׷��Դϴ�" );
	System.out.println("�������� �Է����ּ��� : " );
	double r = input.nextDouble(); // ������
	double v = (double) 4/3*pie*r*r*r; // ����  (double)�� ���ԵǸ� ���� �̻��� ������ ����
	System.out.println("���� ���� : " + v );
}
}
