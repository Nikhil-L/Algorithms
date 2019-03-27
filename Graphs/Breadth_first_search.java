
import java.util.Scanner;

class Breadth_first_search
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
		
		int queue[] = new int [100];
		int rear = -1;
		int front = 0;
		queue[++rear] = source;
		while(front <= rear)
		{
			int elem = queue[front++];
			visited[elem] = 1;
			for(int i = 0; i < n; i++)
			{
				if(a[elem][i] == 1 && visited[i] == 0)
				{
					queue[++rear] = i;
				}
			}
			System.out.print((elem+1) + " ");
			
		}
		System.out.println();
	}
	
	public static void main(String[] args)
	{
		ip = new Scanner(System.in);
		Breadth_first_search obj = new Breadth_first_search();

		obj.accept();
		int source = ip.nextInt();
		obj.bfs(source-1);
	}
}