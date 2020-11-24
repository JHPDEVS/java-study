package javastudy;

import java.util.*;
public class java1124 {

	public static void main(String[] args)	
	{
		
	//	twoDimensinonalArray2();
		tiktok();
		int[][] arr = new int[2][40];
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
	}
		/*
		 * i가 0일때 : j는 0 , 1 ,2 ,3 4, 5, 6 ,7 ,8 ,9 ;
		 */
		
		public static void tiktok()
		{
		/*1.현재 보드의 상태를 디스플레이
		 * 2 좌표를 입력받는다 row col <=1 1은 board [0][0]을 의미
		 * 3입 력받은 좌표의 값이 빈공간인지 체크
		 * if(board[row-1][col-1]== ' '){
		 * board[row-1][col-1] = 'x';
		 * }
		 * else
		 * {
		 * 잘못된위치입니다
		 * }
		 * 
		 * 
		 */
		Scanner input = new Scanner(System.in);
		char[][] board = new char[3][3];
		init(board);
		boolean isOver = false;
		while(true)
		{
				if (isOver == true) break;
				display(board);
				System.out.println("다음에 놓을 좌표를 입력하세요... (1 1 ~ 2 2) :");
				int row = input.nextInt();
				int col = input.nextInt();
				System.out.println(board[0][0]); 
				//step3
				if(board[row-1][col-1] == ' ')
				{
					board[row-1][col-1] = 'X';
				}
				//끝났는지 확인... 끝났으면 isover를 true로 ...
				
				else
				{
					System.out.println("잘못된 위치입니다...");
					continue;
				}
				
				if(isOver == false)
			//	computerPlay(board);
				computerplayV2(board);
				
				//끝났는지 확인하고 끝났으면 over를 true로 설정;
	}
			}
		private static void init(char[][] board)
		{
			for(int i=0;i<board.length;i++)
			{
				for(int j=0;j<board[i].length;j++)
				{
					board[i][j] = ' ';
				}
			}
		}
		private static void computerPlay(char[][] board)
		{
			for(int i=0;i<board.length;i++)
			{
				boolean found = false;
				for(int j=0;j<board[i].length;j++)
				{
					if(board[i][j] == ' ')
					{
						board[i][j] = 'O';
						found = true;
						break;
					}
				}
				if(found = true)
				{
					break;
				}
			}
		}
		public static void computerplayV2(char[][] board)
		{
			Random rand = new Random();
			int row = rand.nextInt(3)+1;
			int col = rand.nextInt(3)+1;
			while(true)
			{
				/*row 값을 1~3의 무작위 값으로 발생시키고
				 * col 값을 1~# 무작위 값으로 발생시키고
				 */
				if(board[row-1][col-1] == ' ')
				{
					board[row-1][col-1] = 'O';
					break;
				}
			}
		}
		public static void display(char[][] board)
		{
			for(int i=0;i<board.length;i++)
			{
				for(int j=0;j<board[i].length;j++)
				{
					if(j<board[i].length-1)
					System.out.print(board[i][j] + " |	");
					else
						System.out.print(board[i][j]);
				}
				System.out.println();
				System.out.println("__|__|__|");
		}
		}
}
