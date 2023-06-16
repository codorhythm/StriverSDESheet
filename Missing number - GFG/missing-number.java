//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main(String[] args) throws IOException
	{
	        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while(t-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            int a[] = new int[n+5];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n-1; i++) {
                a[i] = Integer.parseInt(inputLine[i]);
            }
            
            Compute obj = new Compute();
            System.out.println(obj.missingNumber(a, n));
            
        }
	}
}


// } Driver Code Ends


//User function Template for Java


class Compute {
    
    public static int missingNumber(int A[], int N)
    {
        
         // Optimal Approach -2
         int xor1 = 0, xor2 = 0;
         for(int i = 0; i < N; i++)
         {
             xor2 = xor2 ^ A[i];
             xor1 = xor1 ^ (i+1);
         }
         
         return (xor1) ^ xor2;
        
         // Optimal Approach -1
        //  int totalsum = (N*(N+1))/2;
        //  int sum = 0;
        //  for(int i = 0; i < N; i++)
        //  {
        //      sum += A[i];
        //  }
         
        //  return totalsum - sum;
        
        //Better Approach
        // int hash[] = new int[N+1];
        // for(int i = 0; i<N; i++)
        // {
        //     hash[A[i]] = 1;
        // }
        
        // for(int i = 1; i < hash.length; i++)
        // {
        //     if(hash[i] == 0)
        //     {
        //         return i;
        //     }
        // }
        
        // return -1;
        
        //Brute Force 
        // for(int i = 1; i <= N; i++)
        // {int flag = 0;
        //     for(int j = 0; j < N; j++)
        //     {
        //         if(A[j] == i)
        //         {
        //             flag = 1;
        //             break;
        //         }
        //     }
        //     if(flag == 0)
        //     {
        //         return i;
        //     }
        // }
        
        // return -1;
    }
}