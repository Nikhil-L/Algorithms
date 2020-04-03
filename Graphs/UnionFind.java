
import java.util.*;
import java.lang.*;


class UnionFind
{

	public static void union(int a[], int n)
	{

	}

	public static void find(int a[], int n)
	{

	}

	public static void print(int a[], int n)
	{
		
	}

	public static void main(String[]args)
	{
		Scanner ip = new Scanner(System.in);
		int n;
		System.out.println("Enter the number of nodes : ");
		n = ip.nextInt();
		System.out.println(n);

		int a[] = new int[n];
		for(int i = 0; i < n; i++)
		{
			a[i] = i;
		}

		while(1)
		{
			int ch;
			ch = ip.nextInt();

			System.out.println("Enter : \n1.union\n2.Find\n3.Print\n4.Exit");

			switch(ch)
			{
				case 1: union(a, n);
						break;
				case 2: find(a, n);
						break;
				case 3: print(a, n);
						break;
				default: return 0;
			}
		}

	}
}