
import java.util.Scanner;

class Ternary_Search
{
	public static int ternary_search(int a[], int l, int r, int x)
	{
		if(r >= l)
		{
			int mid1 = l + (r-l)/3;
			int mid2 = r - (r-l)/3;

			if(a[mid1] == x)
			{
				return mid1;
			}
			if(a[mid2] == x)
			{
				return mid2;
			}
			if(x < a[mid1])
			{
				return ternary_search(a, l, mid1-1, x);
			}
			else if(x > a[mid2])
			{
				return ternary_search(a, mid2+1, r, x);
			}
			else
			{
				return ternary_search(a, mid1+1, mid2+1, x);
			}
		}
		return -1;
	}

	public static void main(String[] args)
	{
		int n;
		Scanner ip = new Scanner(System.in);
		n = ip.nextInt();
		int a[] = new int[n];

		for(int i = 0; i < n; i++)
		{
			a[i] = ip.nextInt();
		}
		int key;
		key = ip.nextInt();
		int index = ternary_search(a, 0, n-1, key);

		if(index == -1)
		{
			System.out.println("Unsuccessful Search");
			return;	
		}
		else
		{
			System.out.println("Key element found at " + (index+1) + " position.");
		}
	}
}