package Pattern;

import java.util.Scanner;

public class AlphaRampPattern {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int row=in.nextInt();
		int col=in.nextInt();
		printPattern(row,col);
	}
	public static void printPattern(int row,int col)
	{
		char a='A';
		for(int i=0;i<row;i++)
		{
			
			for(int j=0;j<=i;j++)
			{
				System.out.print(a);
				
			}
			a=(char) (a+1);
			System.out.println();
		}
	}

}
