package javastudy;

import java.util.*;

public class tiktok {

	public static void main(String[] args)
	{
		tiktok();
	}
	
	public static void tiktok()
	{
		boolean win = false;
		Scanner input = new Scanner(System.in);
		char[][] arr = new char[3][3];
		init(arr);
		int count = 0;
		
		while(true)
		{
	//	System.out.print(count);
		display(arr);
		System.out.println("������ ���� ��ǥ�� �˷��ֽʽÿ� ex) 1 1 / 1 1 ~ 3 3");
		int row = input.nextInt();
		int col = input.nextInt();
		if(arr[row-1][col-1] != ' ')
		{
			System.out.print("�߸��� ��ġ�Դϴ�\n");
			continue;
		}
		else
		{
			arr[row-1][col-1] = 'X';
		}
		count++;
		if(count<=4)
		{
		computerPlay(arr,row,col,count,win);
		}
		calc(arr  ,win , count);
		/// �¸��Ǻ�
		}
	}
	public static void calc(char[][] arr,  boolean win ,int count)
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length-2;j++)
			{
				if(arr[i][j] == 'X'&& arr[i][j+1] == 'X')
				{
					if(arr[i][j+1] == 'X'&& arr[i][j+2] == 'X')
					{
						System.out.println("����ڰ� �¸��߽��ϴ�");
						win = true;
					}
				}
				if(arr[i][j] == 'O'&& arr[i][j+1] == 'O')
				{
					if(arr[i][j+1] == 'O'&& arr[i][j+2] == 'O')
					{
						System.out.println("��ǻ�Ͱ� �¸��߽��ϴ�");
						win = true;
					}
				}
			}
		}
		for(int i=0;i<arr.length-2;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				if(arr[i][j] == 'X'&& arr[i+1][j] == 'X')
				{
					if(arr[i+1][j] == 'X'&& arr[i+2][j] == 'X')
					{
						System.out.println("����ڰ� �¸��߽��ϴ�");
						win = true;
					}
				}
				if(arr[i][j] == 'O'&& arr[i+1][j] == 'O')
				{
					if(arr[i+1][j] == 'O'&& arr[i+2][j] == 'O')
					{
						System.out.println("��ǻ�Ͱ� �¸��߽��ϴ�");
						win = true;

					}
				}
			}
		
			if(count>=5 && win == false)
			{
				System.out.print("\n���º��Դϴ�\n");
			}
				
				}
			}
	
	
	public static void init(char[][] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				arr[i][j] = ' ';
			}
		}
	}
	
	public static void computerPlay(char[][] arr ,int row2, int col2, int count, boolean win)
	{
		while(true)
		{
			Random rand = new Random();
			int row = rand.nextInt(3)+1;
			int col = rand.nextInt(3)+1;
			if(row == row2 && col == col2)
			{
				continue;
			}
		//	System.out.println((row)+" "+(col)); 
			if(arr[row-1][col-1] != ' ')
			{
			}
			else
			{
				arr[row-1][col-1] = 'O';
				break;
			}
		}
	}
	public static void display(char[][] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				if(j<arr.length-1)
				{
					System.out.print(arr[i][j] + "  |");
				}
				else
				{
					System.out.print(arr[i][j]);
				}
			}
			System.out.println("");
			System.out.println("___|___|___");
		}
	}
	
}
