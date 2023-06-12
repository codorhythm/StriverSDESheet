//{ Driver Code Starts
//Initial Template for Java




import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            int n = Integer.parseInt(br.readLine().trim());
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            int ans = new Solution().print2largest(arr, n);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution {
    int print2largest(int arr[], int n) {
       //optimal approach
       
    //   int max = arr[0]; int secondLargest = -1;
    //   for(int i = 1;  i < n; i++)
    //   {
    //       if(arr[i]>max)
    //       {
    //           secondLargest = max;
    //           max = arr[i];
    //       }
    //       else if(arr[i]<max && arr[i]>secondLargest)
    //       {
    //           secondLargest = arr[i];
    //       }
    //   }
       
    //   return secondLargest;
       
       
        // Bettr Approach
        // int secondMax = -1;
        // int max = arr[0];
        // int diff = Integer.MAX_VALUE;
        // for(int i = 1; i < n; i++ )
        // {
        //   if(arr[i]>max)
        //   {
        //       max = arr[i];
            
        //   }
           
        // }
        
        // for(int i = 0; i < n; i++)
        // {
        //     if(max - arr[i] < diff && arr[i] != max)
        //     {
        //         secondMax = arr[i];
        //         diff = max - arr[i];
        //     }
        // }
        
        // return secondMax;
        
        
        //BRUTE FORCE
        Arrays.sort(arr);
        int max = arr[n-1];
        int secondLargest = -1;
        for(int i = n-2; i >=0; i--)
        {
            if(arr[i]!=max)
            {
                secondLargest = arr[i];
                break;
            }
        }
        
        return secondLargest;
    }
}