
import java.util.*;
import java.lang.*;


class UnionFind
{
	public static Scanner ip;

	public static void union(int a[], int n)
	{
		int p, q;
		System.out.println("Enter the two nodes to be connected : ");
		p = ip.nextInt() - 1;
		q = ip.nextInt() - 1;
		if(p >= n | q >= n)
		{
			System.out.println("There is no such tree");
			return; 
		}

		if(a[p] == a[q])
			return;
		int pid = a[p];
		int qid = a[q];
		for(int i = 0; i < n; i++)
		{
			if(a[i] == pid)
				a[i] = qid;
		}
	}

	public static void find(int a[], int n)
	{
		int p, q;
		System.out.println("Enter the two nodes which to find its connectivity : ");
		p = ip.nextInt() - 1;
		q = ip.nextInt() - 1;
		if(p >= n | q >= n)
		{
			System.out.println("There is no such tree");
			return; 
		}
		if(a[p] == a[q])
		{
			System.out.println("Connected");
		}
		else
		{
			System.out.println("Not connected");
		}
	}

	public static void print(int a[], int n)
	{
		for(int i = 0; i < n; i++)
		{
			System.out.print((a[i]+1) + " ");
		}
		System.out.println();
	}

	public static void main(String[]args)
	{
		ip = new Scanner(System.in);
		int n;
		System.out.println("Enter the number of nodes : ");
		n = ip.nextInt();

		int a[] = new int[n];
		for(int i = 0; i < n; i++)
		{
			a[i] = i;
		}

		while(true)
		{

			System.out.println("Enter : \n1.union\n2.Find\n3.Print\n4.Exit");

			int ch;
			ch = ip.nextInt();

			switch(ch)
			{
				case 1: union(a, n);
						break;
				case 2: find(a, n);
						break;
				case 3: print(a, n);
						break;
				default: return;
			}
		}

	}
}