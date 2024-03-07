package Pattern;

import java.util.Scanner;
public class InvertedStarPyramid {
	public static void main(String []args)
	{
		Scanner in=new Scanner(System.in);
		int row=in.nextInt();
		int col=in.nextInt();
		printPattern(row,col);
	}
	public static void printPattern(int row,int col)
	{
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<i;j++)
			{
				System.out.print(" ");
			}
			for(int j=0;j<2*row-(2*i+1);j++)
			{
				System.out.print("*");
			}
			for(int j=0;j<i;j++)
			{
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}