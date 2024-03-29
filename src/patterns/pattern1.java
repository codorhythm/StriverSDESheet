package patterns;

import java.util.ArrayList;

public class pattern1 {
	
   public static void square(int x)
   {
	   /*
		 * 		* * * * *
		 * 		* * * * *
		 * 		* * * * *
		 * 		* * * * *
		 * 		* * * * *
		 * 
		 * 
		 */
	   
	   for(int i = 0; i < x; i ++)
	   {
		   for(int j = 0; j < x; j++)
		   {
			   System.out.print(" * ");
		   }
		   System.out.println();
	   }
   }
	
   public static void leftTraiangle(int x)
   {
	   /* 
	    *   *
	    *   * *
	    *   * * *
	    * 
	    */
	   
	   for(int i = 0; i < x; i ++)
	   {
		   for(int j = 0; j<= i; j++)
		   {
			   System.out.print(" * ");
		   }
		   System.out.println();
	   }
   }
   
   public static void numberleftTraiangle(int x)
   {
	   /* 
	    *   1
	    *   1 2
	    *   1 2 3
	    * 
	    */
	   
	   for(int i = 1; i <= x; i ++)
	   {
		   for(int j = 1; j<= i; j++)
		   {
			   System.out.print(j+" ");
		   }
		   System.out.println();
	   }
   }
   
   public static void sameRownumberleftTraiangle(int x)
   {
	   /* 
	    *   1
	    *   2 2
	    *   3 3 3
	    * 
	    */
	   
	   for(int i = 1; i <= x; i ++)
	   {
		   for(int j = 1; j<= i; j++)
		   {
			   System.out.print(i+" ");
		   }
		   System.out.println();
	   }
   }
   
   public static void invertedLeftTraiangle(int x)
   {
	   /* 
	    *   * * *
	    *   * *
	    *   * 
	    * 
	    */
	   
	   for(int i = 1; i <= x; i ++)
	   {
		   for(int j = 1; j<=x-i+1 ; j++)
		   {
			   System.out.print("* ");
		   }
		   System.out.println();
	   }
   }
   
   public static void numberInvertedLeftTraiangle(int x)
   {
	   /* 
	    *   1 2 3
	    *   1 2
	    *   1
	    * 
	    */
	   
	   for(int i = 1; i <= x; i ++)
	   {
		   for(int j = 1; j<=x-i+1 ; j++)
		   {
			   System.out.print(j+" ");
		   }
		   System.out.println();
	   }
   }
   
   public static void Traiangle(int x)
   {
	   /* 
	    *   
	    *   
	    *   
	    * 
	    */
	   
	   for(int i = 1; i <= x; i ++)
	   {
		   int n = x -1;
		   for(int spaces = 1; spaces <=n-i+1 ; spaces++)
		   {
			   System.out.print(" ");
		   }
		  
		   
		   for(int j =1; j<=i; j++)
		   {
			   System.out.print("*");
		   }   
		   
		   for(int k = 0; k<i-1; k++)
		   {
			   System.out.print("*");
		   }
		   
		   System.out.println();
	   }
	   
	   
		   
   }
   
   
   

       
   
   
   static void leftTrangleAlpha(int x)
   { /*
	   E
	   ED
	   EDC
	   EDCB
	   EDCBA */
	   for(int i = 1;  i <= x; i++)
	   {
		   char ch= (char)(65+x-1);
		   for(int j = 1; j<=i; j++)
		   {
			   System.out.print(ch);
			   ch--;
		   }
		   System.out.println();
	   }
   }
   
   
   static void invertedT(int n)
   {
	   int x = n;
       for(int i = n; i >=1; i--)
       {
           for(int j = 0; j <n-x; j++)
           {
               System.out.print(" ");
           }
           
           for(int j = (2*i)-1; j >0; j--)
           {
               System.out.print("*");   
           }
           
           System.out.println(); x--;
       }
   }
   
   public static void diamond(int n) {
	      
       int n1 = n/2;
       int n2 = n-n1;
      for(int i = 1; i <= n1+1; i++)
      {
          //spaces
         
          for(int j = -1; j<=n1-i; j++)
          {
              System.out.print(" ");
          }

          //starts

          for(int j = 0; j < 2*i -1; j++)
          {
              System.out.print("*");
          }

          System.out.println();
      }
int n3 = n2;
      for(int i = 1; i<=n2; i++)
      {
          for(int j = 1; j<=i ; j++)
          {
              System.out.print(" ");
          }

          for(int j = 1; j<=2*n3-1; j++)
          {
              System.out.print("*");
          }
System.out.println();
          n3--;
      }
  }
   
 public static void NumberTriangle(int n)
 {
	 int x = 1;
	 for(int i = 1; i <=n; i++)
	 {
		 for(int j = 1; j <=i; j++)
		 {
			 System.out.print(x);
			 x++;
		 }
		 System.out.println();
	 }
 }

   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		square(4);
		leftTraiangle(4);
		numberleftTraiangle(4);
		sameRownumberleftTraiangle(5);
		invertedLeftTraiangle(5);
		numberInvertedLeftTraiangle(5);
		Traiangle(5);
		leftTrangleAlpha(3);
		invertedT(5);
		diamond(9);
		NumberTriangle(5);
	}

}
