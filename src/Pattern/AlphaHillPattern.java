package Pattern;

import java.util.Scanner;

public class AlphaHillPattern {

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
			a='A';
			for(int j=0;j<row-i;j++)
			{
				System.out.print(" ");
			}
			for(int j=0;j<2*i+1;j++)
			{
				if(j>(2*i+1)/2)
				{
					a=(char)(a-1);
					System.out.print(a);
				}
				else
				{
					
					System.out.print(a);
					if(j==((2*i+1)/2))
						continue;
					a=(char)(a+1);
					
				}
				
			}
			for(int j=0;j<row-i;j++)
			{
				System.out.print(" ");
			}
			System.out.println();
		}
	}

}
