
//This is program is an implementation of linear search algorithms which prints the index of the last occurance 
// of an element in the array. If element is not found, it prints -1.

import java.util.*;

class Linear_Search{
    
    private int n, m;
    private int a[];
    static Scanner ip;

// This initializes all the variables and accepts the value for the variables.    
    public void accept()
    {
        n = ip.nextInt();
        m = ip.nextInt();
        a = new int[n];
        for(int i = 0; i < n; i++)
        {
            a[i] = ip.nextInt();
        }
    }

// Searches the last occurance of the keyword.   
    public void search()
    {    
        for(int i = n-1; i >= 0; i--)
        {
            if(m == a[i])
            {
                System.out.println(i+1);
                return;
            }
        }
        System.out.println(-1);
    }

    public static void main(String args[] )
    {
        
        ip = new Scanner(System.in);
        Linear_Search a;
        a = new Linear_Search();
        a.accept();
        a.search();
 
    }
}
