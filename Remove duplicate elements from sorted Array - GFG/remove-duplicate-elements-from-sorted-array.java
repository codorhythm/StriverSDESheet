//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

public class GFG {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T>0)
        {
            int N = sc.nextInt();
            int a[] = new int[N];
            for(int i=0; i<N; i++)
                a[i] = sc.nextInt();
            
            Solution g = new Solution();
            int n = g.remove_duplicate(a,N);
            
            for(int i=0; i<n; i++)
                System.out.print(a[i]+" ");
            System.out.println();
            T--;
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    int remove_duplicate(int arr[],int N){
        //Optimal
        int i = 0; int j = i+1;
        while(i<N && j<N)
        {
            if(arr[i] != arr[j])
            {
                i+=1;
                arr[i] = arr[j];
                
            }
            
            j+=1;
        }
        
        return i+1;
        
        // Brute force
        // ArrayList<Integer> list = new ArrayList<>();
        // list.add(arr[0]);
        // int x = arr[0];
        // for(int i = 1;  i < N; i++)
        // {
        //     if(arr[i]!=x)
        //     {
        //         list.add(arr[i]);
        //     }
            
        //     x = arr[i];
        // }
        
        // for(int i = 0; i<list.size(); i++)
        // {
        //     arr[i] = list.get(i);
        // }
        
        // return list.size();
    }
}