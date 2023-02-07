package Assignment;

import java.util.Iterator;

public class PrimeNumber {
	
public static void main(String[] args) {
	int n=13;
	boolean Flag=false;
		for (int i =2; i<=n/2; i++) 
		{

			if(n%i==0)
			{
		 Flag=true;
			break;
			}
		}
			if(Flag)
			{
				System.out.println("not Prime");
			}
			else
			{
				System.out.println(" Prime");
			}
	}

}

