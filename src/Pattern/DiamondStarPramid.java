package Pattern;

import java.util.Scanner;

public class DiamondStarPramid {
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
			if(i<row/2)
			{
			for(int j=0;j<row-i-1;j++)
			{
				System.out.print(" ");
			}
			for(int j=0;j<2*i+1;j++)
			{
				System.out.print("*");
			}
			for(int j=0;j<row-i-1;j++)
			{
				System.out.print(" ");
			}
			System.out.println();
			}
			else
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
}
