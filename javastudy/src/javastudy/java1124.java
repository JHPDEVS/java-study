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
		int[][] table = {{10,20,30,40,50,60,70,80,90},{60,70,80,90,100},{110,120,130,140}};// 3���̱���
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
		 * i�� 0�϶� : j�� 0 , 1 ,2 ,3 4, 5, 6 ,7 ,8 ,9 ;
		 */
		
		public static void tiktok()
		{
		/*1.���� ������ ���¸� ���÷���
		 * 2 ��ǥ�� �Է¹޴´� row col <=1 1�� board [0][0]�� �ǹ�
		 * 3�� �¹��� ��ǥ�� ���� ��������� üũ
		 * if(board[row-1][col-1]== ' '){
		 * board[row-1][col-1] = 'x';
		 * }
		 * else
		 * {
		 * �߸�����ġ�Դϴ�
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
				System.out.println("������ ���� ��ǥ�� �Է��ϼ���... (1 1 ~ 2 2) :");
				int row = input.nextInt();
				int col = input.nextInt();
				System.out.println(board[0][0]); 
				//step3
				if(board[row-1][col-1] == ' ')
				{
					board[row-1][col-1] = 'X';
				}
				//�������� Ȯ��... �������� isover�� true�� ...
				
				else
				{
					System.out.println("�߸��� ��ġ�Դϴ�...");
					continue;
				}
				
				if(isOver == false)
			//	computerPlay(board);
				computerplayV2(board);
				
				//�������� Ȯ���ϰ� �������� over�� true�� ����;
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
				/*row ���� 1~3�� ������ ������ �߻���Ű��
				 * col ���� 1~# ������ ������ �߻���Ű��
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
