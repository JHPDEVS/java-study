package javaproject;

public class sosu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =15;
		boolean isPrime;
		for(int i=2;i<=n;i++)
		{
			isPrime = true;
			for(int j=2;j<=i/2;j++)
			{
				if(i%j==0)
				{
				isPrime = false;
				break;
			}
			}
			if(isPrime)
			{
				System.out.print(i + " ");
			}
			
		}
	}

}
