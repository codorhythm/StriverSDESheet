//{ Driver Code Starts
#include <bits/stdc++.h>
using namespace std;

// } Driver Code Ends
class Solution{
	
	
public:
	void leftRotate(int arr[], int k, int n) 
	{ 
	  int copyArray[n];
	  for(int i{0}; i < n; i++){
	      copyArray[i] = arr[i];
	  }
	  
	  for(int i{0}; i < n; i++){
	      arr[i] = copyArray[(i + k)%n];
	  }
	} 
		 

		 

};

//{ Driver Code Starts.

int main() 
{
   	
   
   	int t;
    cin >> t;
    while (t--)
    {
    	int n;
	    cin >> n;
	    int k;
	    cin >> k;
	    int a[n];
	    for(int i = 0;i<n;i++){
	        cin >> a[i];
	        // um[a[i]]++;
	    }


       

        Solution ob;
        ob.leftRotate(a,k,n);
        
        for (int i = 0; i < n; i++) 
        	cout << a[i] << " "; 

	    cout << "\n";
	     
    }
    return 0;
}



// } Driver Code Ends