import java.lang.*;
import java.util.*;

class Matrix
{
	int[][] swap(int arr[][])
	{
		int temp=0;
		int i=0;
		int j=0;
		while(i<arr.length-1)
		{
			j=0;
			while(j<arr[i].length)
			{
				temp = arr[i][j];
				arr[i][j] = arr[i+1][j];
				arr[i+1][j]=temp;
				j++;
			}
			i+=2;
		}
		return arr;
	}
}

class Demo
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number of rows");
		int row = s.nextInt();
		System.out.println("Enter number of columns");
		int col = s.nextInt();
		
		int arr[][] = new int[row][col];
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				System.out.println("Enter "+i+": "+j+" element");
				arr[i][j]=s.nextInt();
			}
		}
		Matrix mobj = new Matrix();
		int brr[][]=mobj.swap(arr);
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				System.out.print(brr[i][j]+" ");
			}
			System.out.println();
		}
	}
}
