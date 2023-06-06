package LearningBasicRecurrsion;

public class PrintNto1 {

	
	public static void nto1(int n) {
		if(n==0)
		{
			return;
		}
		 System.out.println(n);
		 nto1(n-1);
		 
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		nto1(5);

	}

}
