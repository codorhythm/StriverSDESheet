//{ Driver Code Starts
//Initial Template for Java


import java.util.*;
import java.io.*;
import java.lang.*;

class Main
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t  =Integer.parseInt(read.readLine());
        
        while(t-- > 0)
        {
            String st[] = read.readLine().trim().split(" ");
            int N = Integer.parseInt(st[0]);
            int M = Integer.parseInt(st[1]);
            
            int arr1[] = new int[N];
            int arr2[] = new int[M];
            
            st = read.readLine().trim().split(" ");
            for(int i = 0; i < N; i++)
              arr1[i] = Integer.parseInt(st[i]);
            
            st = read.readLine().trim().split(" ");  
            for(int i = 0; i< M; i++)
              arr2[i] = Integer.parseInt(st[i]);
            
            Solution obj = new Solution();
            ArrayList<Integer> res = new ArrayList<Integer>();
            res = obj.findUnion(arr1, arr2, N, M);
            for(int i = 0;i<res.size();i++)
                System.out.print(res.get(i) + " ");
            System.out.println(); 
        }
    }
}



// } Driver Code Ends


//User function Template for Java

//arr1,arr2 : the arrays
// n, m: size of arrays
class Solution
{
    //Function to return a list containing the union of the two arrays.
    public static ArrayList<Integer> findUnion(int arr1[], int arr2[], int n, int m)
    {
        
        int i = 0, j = 0;int x = -1;
        ArrayList<Integer> list = new ArrayList<>();
        while(i< arr1.length && j<arr2.length)
        {
            if(arr1[i] <= arr2[j])
            {
                if(x!=arr1[i])
                {
                    list.add(arr1[i]);
                    x = arr1[i];
                           
                }
                    i++;     

            }
            else if(arr2[j] < arr1[i])
            {
                if(x!=arr2[j])
                {
                     list.add(arr2[j]);
                     x = arr2[j];     
                }
               
                j++;
            }
          
            
        }
        
        while(i<arr1.length)
        {
            if(x!=arr1[i])
            {
                list.add(arr1[i]);
                x = arr1[i];
            }
            i++;
        }
        
        
        while(j<arr2.length)
        {
            if(x!=arr2[j])
            {
                list.add(arr2[j]);
                x = arr2[j];
            }
            j++;
        }
        
        return list;
        //Brute Force 2
        // TreeSet<Integer> ts = new TreeSet<>();
        // for(int i = 0; i < arr1.length; i++)
        // {
        //     ts.add(arr1[i]);
        // }
        
        // for(int i = 0; i < arr2.length; i++)
        // {
        //     ts.add(arr2[i]);
        // }
        
        // ArrayList<Integer> list = new ArrayList<>();
        
        // for (Integer value : ts)
        // {
        //     list.add(value);
        // }
        
        // return list;
        //Brut force 1
        // HashMap<Integer, Integer> maps = new HashMap<>();
        // ArrayList<Integer> list = new ArrayList<>();
        // for(int i = 0; i <n ; i++)
        // {
        //     if(!maps.containsKey(arr1[i]))
        //     {
        //          maps.put(arr1[i],1);
        //          list.add(arr1[i]);
        //     }
            
        // }
        
        
        // for(int i = 0; i < m ; i++)
        // {
        //     if(!maps.containsKey(arr2[i]))
        //     {
        //          maps.put(arr2[i],1);
        //          list.add(arr2[i]);
        //     }
        // }
        
        // Collections.sort(list);
        // return list;
    }
}



