package problem2;

import java.util.*;

public class problem2 {

public static void main(String[] args)
{
	Scanner input = new Scanner(System.in);
	System.out.println("���� �� : " );
	int a = input.nextInt(); // ���� ��
	System.out.println("��ǰ�� �Ѿ� : " );
	int b = input.nextInt(); // ��ǰ�� �Ѿ�
	int value = b/10;  // �ΰ��� ��� 
	System.out.println("�ΰ��� : " + value);
	int charge = a-b; // �ܵ� ���
	System.out.println("�ܵ� : " + charge);
}
}
