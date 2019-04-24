
import java.util.*;
import java.lang.*;

class Floyd
{
	public void printmat(int a[][], int n)
	{
		for(int i = 0; i < n; i++)
		{
			for(int j = 0; j < n; j++)
			{
				if(a[i][j] == 99999)
				{
					System.out.print("INF\t");
				}
				else
				{
					System.out.print(a[i][j] + "\t");
				}
			}
			System.out.println();
		}
	}

	public void floydwarshall(int a[][], int n)
	{
		for(int k= 0; k < n; k++)
		{
			for(int i = 0; i < n; i++)
			{
				for(int j = 0; j < n; j++)
				{
					if(a[i][k] + a[k][j] < a[i][j])
					{
						a[i][j] = a[i][k] + a[k][j];
					}
				}
			}
		}
		printmat(a, n);
	}
	public static void main(String[] args)
	{
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter the number of vertices : ");
		int n = ip.nextInt();
		System.out.println("Enter the adjacency matrix : ");
		System.out.println("Enter -1 if path doesnt exist : ");
		int a[][] = new int[n][n];
		for(int i = 0; i < n; i++)
		{
			for(int j = 0; j < n; j++)
			{
				a[i][j] = ip.nextInt();
				if(a[i][j] == -1)
				{
					a[i][j] = 99999;
				}
			}
		}

		Floyd obj = new Floyd();
		obj.floydwarshall(a, n);
	}
}