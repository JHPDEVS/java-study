package javaproject;
import java.util.*;

	public class Main{
	    public static void main(String[] args)
		{
	    	Scanner hello = new Scanner(System.in);
	    	int a = hello.nextInt();
			for(int i=1;i<=a;i++)
			{
				for(int j=a;j>=1;j--)
				{
					if(j<=i)
					{
						System.out.print("*");
					}
					else
					{
						System.out.print(" ");
					}
				}
				System.out.println("");
			}
		}
	}

