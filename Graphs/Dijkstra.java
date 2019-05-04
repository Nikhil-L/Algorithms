
import java.util.*;

class Dijkstra
{
	public static int minvertex(int sd[], boolean v[], int n)
	{
		int min = Integer.MAX_VALUE, minindex = -1;
		for(int i = 0; i < n; i++)
		{
			if(v[i] == false && sd[i] <= min)
			{
				min = sd[i];
				minindex = i;
			}
		}
		return minindex;
	}

	public static void printdist(int sd[], int n)
	{
		System.out.println("The shortest distance between source and other nodes are : ");
		for(int i = 0; i < n; i++)
		{
			System.out.print(sd[i] + " ");
		}
		System.out.println();
	}

	public static void dijkstra(int a[][], int n, int src)
	{
		int sd[] = new int[n];
		boolean v[] = new boolean[n];

		for(int i = 0; i < n; i++)
		{
			sd[i] = Integer.MAX_VALUE;
			v[i] = false;
		}

		sd[src] = 0;

		for(int i = 0; i < n-1; i++)
		{
			int u = minvertex(sd, v , n);
			v[u] = true;
			for(int j = 0; j < n; j++)
			{
				if((v[j] == false) && (sd[u] + a[u][j] < sd[j]) && (a[u][j] != 0) && (sd[u]!= Integer.MAX_VALUE))
				{
					sd[j] = sd[u] + a[u][j];
				}
			}
		}
		printdist(sd, n);
	}

	public static void main(String []args)
	{
		Scanner ip = new Scanner(System.in);
		int n;
		System.out.println("Enter the number of vertices : ");
		n = ip.nextInt();
		System.out.println("Enter the adjacency matrix : ");
		int a[][] = new int[n][n];
		for(int i = 0; i < n; i++)
		{
			for(int j = 0; j < n; j++)
			{
				a[i][j] = ip.nextInt();
			}
		}
		System.out.println("Enter the source node : ");
		int src = ip.nextInt();
		dijkstra(a, n, src);
	}
}