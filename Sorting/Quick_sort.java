
import java.util.Scanner;

class Quick_sort
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

	public int partition(int low, int high)
	{
		int pivot = a[high];
		int i = low-1;

		for(int j = low; j < high; j++)
		{
			if(a[j] < pivot)
			{
				i++;
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
			}
		}

		int temp = a[i+1];
		a[i+1] = a[high];
		a[high] = temp;

		return i+1;
	}

	public void quick_sort(int low, int high)
	{
		if(low < high)
		{
			int p = partition(low, high);

			quick_sort(low, p-1);
			quick_sort(p+1, high);
		}

	}

	public int getmax()
	{
		return n;
	}

	public static void main(String[]args)
	{
		ip = new Scanner(System.in);
		Quick_sort obj;
		obj = new Quick_sort();
		obj.accept();
		int n = obj.getmax();
		obj.quick_sort(0, n-1);
		obj.display();
	}

}