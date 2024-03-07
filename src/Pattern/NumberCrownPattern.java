package Pattern;

import java.util.Scanner;
public class NumberCrownPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int row=in.nextInt();
		int col=in.nextInt();
		printPattern(row,col);
	}
	public static void printPattern(int row,int col)
	{
		for(int i=0;i<row;i++)
		{
			int num=1;
			for(int j=0;j<=i;j++)
			{
				System.out.print(num);
				num=num+1;
			}
			for(int j=0;j<col-2*(i+1);j++)
			{
				System.out.print(" ");
			}
			num=num-1;
			for(int j=0;j<=i;j++)
			{
				System.out.print(num);
				num=num-1;
			}
			System.out.println();
		}
	}
	

}
