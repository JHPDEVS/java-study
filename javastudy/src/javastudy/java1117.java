package javastudy;

import java.util.Arrays;

public class java1117 {

	public static void main(String[] args)
	{
		anonymousArray();
	}
	private static void anonymousArray() // void 라는 것은 실행이 끝난데도 돌려주는거 없음
	{
		int[] arr = new int[10];
		int arrtotal = arrsum(new int[] {1,2,3,4,5,6,7});
		System.out.println(arrtotal);
		int[] arr2 = {12,13,1,3,4};
//		arr = {1,2,3,4,5}; //x
		int[] arr3;
		arr3 = new int[] {1,2,3,4,5};
//		int a = 8 ; 
//		int b = 20;
//		sum(a ,b);//동일한 메소드 있어도됨2
		int[] arr4 = {1,2,3,4,5};
		int[] arr5 = arr4;
		for (int n : arr3)
		{
			System.out.println(n);
		}
		int[] array1= {1,2,3,4,5};
		int[] array2 = new int[array1.length];
		int idx= 0;
		for(int n: array1)
		{
			array2[idx++] = n;
			System.out.println("dddddd"+n);
		}
		int[] array32 = Arrays.copyOf(array1, array1.length);
		System.out.println(Arrays.toString(array32));
	} // 참조형 변수여서  
	public static int arrsum(int[] arr)
	{
		int total=0;
		for(int i=0;i<arr.length;i++)
		{
			total = total + arr[i];
		}
		System.out.println("총 합 :" + total);
		// void 경우에도 return 쓸 수 있
		return total;
	}
	public static void sum(int a , int b)
	{
		System.out.println(a+"+"+b +"=" + (a+b));
		//결과를 돌려줗때 쓰는거 Return;
		//이 오류는 a
		// 무명배열
	}
}
