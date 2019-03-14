
import java.util.Scanner;

class Bubble_sort
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

	public void sort()
	{
		for(int i = 0; i < n -1; i++)
		{
			for(int j = 0; j < n -i -1; j++)
			{
				if(a[j] > a[j+1])
				{
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
	}

	public static void main(String []args)
	{
		ip = new Scanner(System.in);
		Bubble_sort obj;
		obj = new Bubble_sort();
		obj.accept();
		obj.sort();
		obj.display();
	}
}