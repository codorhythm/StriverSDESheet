//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            Solution ob = new Solution();
            int ans = ob.DivCountSum(n);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    public int sumCount(int x)
    {
        int c = 0;
        int i = 1;
        while(i*i<=x)
        {
            if(x%i == 0 && i*i!=x)
            {
                c+=2;
            }
            else if(i*i == x)
            {
                c+=1;
            }
            i++;
        }
        
        return c;
    }
    public int DivCountSum(int n)
    {
        // Code here
        int sum = 1;
        int i = 2;
        
        while(i<=n)
        {
            sum+=sumCount(i);
            i++;
        }
        
        return sum;
    }
}