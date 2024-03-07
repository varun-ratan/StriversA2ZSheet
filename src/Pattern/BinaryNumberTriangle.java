package Pattern;

import java.util.Scanner;

public class BinaryNumberTriangle {
	public static void main(String []args)
	{

		Scanner in=new Scanner(System.in);
		int row=in.nextInt();
		int col=in.nextInt();
		printPattern(row,col);
	}
	public static void printPattern(int row,int col)
	{
		int k=1;
		for(int i=1;i<=row;i++)
		{
			if(i%2!=0)
			{
			k=1;
			for(int j=1;j<=i;j++)
			{
				System.out.print(k);
				k=1-k;
			}
			}
			else
			{
				k=0;
				for(int j=1;j<=i;j++)
				{
					System.out.print(k);
					k=1-k;
				}
			}
			System.out.println();
		}
	}
}
