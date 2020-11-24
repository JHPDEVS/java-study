package javastudy;

public class java1124 {

	public static void main(String[] args)	
	{
		int[] hello = new int[5];
		int[][] seconndarray = new int[3][5];
		twoDimensinonalArray2();
	}
	
	private static void twoDimensinonalArray2()
	{
		int[] nums = new int[5];
		int[] nums2 = {1,2,3,4,5};
		int[][] table = {{10,20,30,40,50,60,70,80,90},{60,70,80,90,100},{110,120,130,140}};// 3행이구나
		for(int i=0;i<table.length;i++)
		{
			for(int j=0;j<table[i].length;j++)
			{
				System.out.print(table[i][j] + " ");
			}
			System.out.println();
		}
		/*
		 * i가 0일때 : j는 0 , 1 ,2 ,3 4, 5, 6 ,7 ,8 ,9 ;
		 */
	}
}
