package LearningBasicRecurrsion;

public class PrintNameNTimes {
	
	public static void name(int n) {
		if(n==0)
		{
			return;
		}
		
		System.out.println("Pratulya");
		name(n-1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		name(5);
	}

}
