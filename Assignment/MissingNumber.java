package Assignment;

import java.util.Arrays;
import java.util.Iterator;

public class MissingNumber{
public static void main(String[] args) {
	int[] arr = {1,2,3,4,7,6,8};
	Arrays.sort(arr);
	for (int i=1; i<arr.length-1; i++) 
	{
		if(i!=arr[i-1])
		{
			System.out.println("missing element "+i);
			
		break;
	}
		
	}

}
}


