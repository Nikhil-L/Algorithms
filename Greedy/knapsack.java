
import java.util.Scanner;

class knapsack
{
	double[] weights, profits, ratio, solnvector;
	double capacity;
	int n;

	public knapsack()
	{
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter the number of items : ");
		n = ip.nextInt();
		weights = new double[n];
		profits = new double[n];
		ratio = new double[n];
		solnvector = new double[n];

		System.out.println("Enter the weights of the items : ");
		for(int i = 0; i < n; i++)
			weights[i] = ip.nextDouble();

		System.out.println("Enter the profits of items : ");
		for(int i = 0; i < n; i++)
			profits[i] = ip.nextDouble();

		capacity = ip.nextDouble();
	}

	public int getnext()
	{
		double max = 0;
		int index = -1;
		for(int i = 0; i < n; i++)
			if(max < ratio[i])
			{
				max = ratio[i];
				index = i;
			}

		return index;
	}

	public void fill()
	{
		double profit = 0;
		double weight = 0;

		for(int i = 0; i < n; i++)
			ratio[i] = profits[i]/weights[i];

		System.out.print("The items selected are : ");

		while(weight < capacity)
		{
			int item = getnext();
			if(item == -1)
				break;
			System.out.print((item+1) + " ");

			if(weight + weights[item] <= capacity)
			{
				weight = weight + weights[item];
				profit = profit + profits[item];
				solnvector[item] = 1;
				ratio[item] = 0;
			}
			else
			{
				profit = profit + ratio[item]*(capacity - weight);
				solnvector[item] = (capacity-weight)/weights[item];
				ratio[item] = 0;
				break;
			}
		}
		System.out.println("\nThe maximum profit is : " + profit);
		System.out.print("The Solution vector is : " );
		for(int i = 0; i < n; i++)
			System.out.print(solnvector[i] + " ");
		System.out.println();
	}

	public static void main(String[]args)
	{
		knapsack k = new knapsack();
		k.fill();
	}
}