

import java.util.Scanner;

class Depth_first_search
{
	private int a[][];
	private int n;
	public static Scanner ip;

	public void accept()
	{
		n = ip.nextInt();
		a = new int[n][n];

		for(int i = 0; i < n; i++)
		{
			for(int j = 0; j < n; j++)
			{
				a[i][j] = ip.nextInt();
			}
		}
	}
	public void bfs(int source)
	{
		int visited[] = new int[n];
		for(int i = 0; i < n; i++)
		{
			visited[i] = 0;
		}
		
		int stack[] = new int [100];
		int top = -1;
		stack[++top] = source;
		while(top >= 0)
		{
			int elem = stack[top--];
			visited[elem] = 1;
			for(int i = 0; i < n; i++)
			{
				if(a[elem][i] == 1 && visited[i] == 0)
				{
					stack[++top] = i;
				}
			}
			System.out.print((elem+1) + " ");
			
		}
		System.out.println();
	}
	
	public static void main(String[] args)
	{
		ip = new Scanner(System.in);
		Depth_first_search obj = new Depth_first_search();

		obj.accept();
		int source = ip.nextInt();
		obj.bfs(source-1);
	}
}