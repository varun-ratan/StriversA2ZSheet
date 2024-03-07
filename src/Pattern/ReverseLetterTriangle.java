package Pattern;

import java.util.Scanner;

public class ReverseLetterTriangle {

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
			char a='A';
			for(int j=i;j<col;j++)
			{
				System.out.print(a);
				a=(char) (a+1);
			}
			System.out.println();
		}
	}


}
