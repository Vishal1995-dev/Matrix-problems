import java.lang.*;
import java.util.*;
import java.lang.Math;

class Matrix
{
	void swap(int arr[][])
	{
		int i=0;
		int j=0;
		int sum=0;
		while(i<arr.length)
		{
			j=0;
			while(j<arr[i].length)
			{
				if(i==0 || j==0 || i==arr.length-1 || j==arr[i].length-1)
				{
					sum+=arr[i][j];
				}
				j++;
			}
			i++;
		}
		System.out.println("Addition of border elements is : "+sum);
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
		mobj.swap(arr);
	}
}
