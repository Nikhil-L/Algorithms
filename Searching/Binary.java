
// It is a simple java program for the implementation of Binary search.
// On sucessful search it returs position which results in displaying the position 
// and on unsucessful search it returns -1 which results in displaying message 
// saying key element not found.

// It takes the n, the number of elements in array and n spaced sorted integers as input.

import java.util.*;

class Binary
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

	public int search()
	{
		int low, high;
		low = 0; 
		high = n-1;

		int key;

		key = ip.nextInt();

		while(low <= high)
		{
			int mid = (low + high)/2;

			if(key == a[mid])
			{
				return mid+1;
			}

			else if(key > a[mid])
			{
				low = mid+1;
			}
			else
			{
				high = mid-1; 
			}
		}
		return -1;
	}

	public static void main(String[] args)
	{
		ip = new Scanner(System.in);
		Binary obj;
		obj = new Binary();
		obj.accept();
		int position = obj.search();
		if(position == -1)
		{
			System.out.println("The key element not found");
		}
		else
		{
			System.out.println(position);
		}
	}
}