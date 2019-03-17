
import java.util.Scanner;

class Merge_sort
{
	private int a[];
	private int n;
	public static Scanner ip;
	public void accept()
	{
		n = ip.nextInt();
		a = new int[n];

		for(int i = 0; i < n; i++)
		{
			a[i] = ip.nextInt();
		}
	}

	public void display()
	{
		for(int i = 0; i < n; i++)
		{
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}

	public void merge(int start, int mid, int end)
	{
		int p, q, k;
		p = start;
		q = mid+1;
		k = 0;
		int ar[] = new int[end-start+1];

		while(p <= mid && q <= end)
		{
			if(a[p] < a[q])
			{
				ar[k] = a[p];
				p++;
				k++;
			}
			else
			{
				ar[k] = a[q];
				k++;
				q++;
			}
		}

		while(p <= mid)
		{
			ar[k] = a[p];
			k++;
			p++;
		}

		while(q <= end)
		{
			ar[k] = a[q];
			k++;
			q++;
		}
		k = 0;
		for(int i = start; i <= end; i++, k++)
		{
			a[i] = ar[k];
		}
	}

	public int get_max()
	{
		return n;
	}

	public void merge_sort(int start, int end)
	{
		if(start == end)
		{
			return;
		}
		if(start <= end)
		{
			int mid = (start+end)/2;
			this.merge_sort(start, mid);
			this.merge_sort(mid+1, end);
			this.merge(start, mid, end);
		}

	}

	public static void main(String []args)
	{
		ip = new Scanner(System.in);
		Merge_sort obj;
		obj = new Merge_sort();
		obj.accept();
		int end = obj.get_max();
		obj.merge_sort(0, end-1);
		obj.display();
	}
}