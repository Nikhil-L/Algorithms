
import java.util.*;

class knapsack
{
	public static int max(int a, int b)
	{
		if(a > b)
		{
			return a;
		}
		return b;
	}

	public static int fill(int w[], int p[], int c, int n)
	{
		if(n==0 || c== 0)
		{
			return 0;
		}
		if(w[n-1] > c)
		{
			return fill(w, p, c, n-1);
		}
		return max(p[n-1] + fill(w, p, c - w[n-1], n-1), fill(w, p, c, n-1));
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
