//{ Driver Code Starts
import java.util.*;

class MaxLenZeroSumSub
{

    // Returns length of the maximum length subarray with 0 sum

    // Drive method
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0)
        {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++)
                arr[i] = sc.nextInt();

            GfG g = new GfG();
            System.out.println(g.maxLen(arr, n));
            T--;
        }
    }
}
// } Driver Code Ends


class GfG
{
    int maxLen(int arr[], int n)
    {
        // Your code here
        HashMap<Integer, Integer> hm = new HashMap<>();
        int sum = 0, len = 0;
        hm.put(0,-1);
        for(int x = 0; x<arr.length; x++){
            sum+=arr[x];
            if(hm.containsKey(sum)){
                len = Math.max(x - hm.get(sum),len);
            }else{
                hm.put(sum, x);
            }
        }
        
        return len;
        
    }
}