package Assignment;

public class Palindrome {
	public static void main(String[] args) 
	{
		int sum=0,r;
		int n=34343;
		for(int i=n;i>0;)
		{
			r=i%10;
			sum=sum*10+r;
			i=i/10;
		}
		if(sum==n)
		{
System.out.println("palindrome "+n);		
	}
		else
		{
			System.out.println("not palindrome "+n);
		}
	}

}
