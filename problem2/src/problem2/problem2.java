package problem2;

import java.util.*;

public class problem2 {

public static void main(String[] args)
{
	Scanner input = new Scanner(System.in);
	System.out.println("¹ÞÀº µ· : " );
	int a = input.nextInt(); // ¹ÞÀº µ·
	System.out.println("»óÇ°ÀÇ ÃÑ¾× : " );
	int b = input.nextInt(); // »óÇ°ÀÇ ÃÑ¾×
	int value = b/10;  // ºÎ°¡¼¼ °è»ê 
	System.out.println("ºÎ°¡¼¼ : " + value);
	int charge = a-b; // ÀÜµ· °è»ê
	System.out.println("ÀÜµ· : " + charge);
}
}
