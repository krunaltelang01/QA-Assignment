package com.Section_3;

/*	If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and
	9. The sum of these multiples is 23. Write a program in your favorite language to find
	the sum of all the multiples of 3 or 5 below 1000.
*/

public class Assignment_Section_3
{
	public static void main(String[] args)
	{
		int sum = 0;
		
		for(int i = 0; i < 1000; i++)
		{
			  if(i % 3 == 0 || i % 5 == 0)
			  {
			    sum = sum + i;
			  }
		}
		System.out.println(sum);
	}

}
