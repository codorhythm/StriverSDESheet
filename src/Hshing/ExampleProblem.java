package Hshing;
import java.util.*;
public class ExampleProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i = 0; i < n; i++)
		{
			arr[i] = sc.nextInt();
			
		}
		
		int hash[] = new int[12];
		
		for(int i = 0; i < hash.length; i++)
		{
			hash[arr[i]]+=1;
//			System.out.println(hash[arr[i]]);
		}
		
		
		int q = sc.nextInt();
		while(q!=0)
		{
			int a = sc.nextInt();
			System.out.println(hash[a]);
		}
	}

}
