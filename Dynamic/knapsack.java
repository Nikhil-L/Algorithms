
import java.util.*;
import java.lang.*;

public class knapsack
{
	public static int max(int a, int b)
	{
		if(a > b)
		{
			return a;
		}
		return b;
	}

	public static int fill(int W[], int p[], int c, int n)
	{
		int i, w;
		int k[][] = new int[n+1][c+1];

		for(i = 0; i <= n; i++)
			for(w = 0; w <= c; w++)
			{
				if(i == 0 || w == 0)
				{
					k[i][w] = 0;
				}
				else if(W[i-1] <= w)
				{
					k[i][w] = Math.max(p[i-1]+k[i-1][w-W[i-1]], k[i-1][w]);
				}
				else
				{
					k[i][w] = k[i-1][w];
				}
			}

		int res = k[n][c];
		w = c;
		for(i = n; res > 0 && i > 0;i--)
		{
			if(res == k[i-1][w])
				continue;
			else
			{
				res = res - p[i-1];
				w = w - W[i-1];
				System.out.print(W[i-1] + " ");
			}
		}
		return k[n][c];
	}

	public static void main(String[] args)
	{
		Scanner ip = new Scanner(System.in);
		int n;
		System.out.println("Enter the number of items : ");
		n = ip.nextInt();
		int p[] = new int[n];
		int w[] = new int[n];
		System.out.println("Enter the weight of items : ");
		for(int i = 0; i < n; i++)
		{
			w[i] = ip.nextInt();
		}
		System.out.println("Enter the profit of items : ");
		for(int i = 0; i < n; i++)
		{
			p[i] = ip.nextInt();
		}
		System.out.println("Enter the kanpsack capacity : ");
		int c = ip.nextInt();
		System.out.println(fill(w, p, c, n));
	}
}
