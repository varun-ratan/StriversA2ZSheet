package Pattern;

import java.util.Scanner;
public class InvertedRightPyramid {
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
			for(int j=i;j<col;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}