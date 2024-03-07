package Pattern;

import java.util.Scanner;
public class RightTriangleWithSameNumCol {
	public static void main(String []args)
	{
		Scanner in=new Scanner(System.in);
		int row=in.nextInt();
		int col=in.nextInt();
		printPattern(row,col);
	}
	public static void printPattern(int row,int col)
	{
		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(i);
			}
			System.out.println();
		}
	}
}