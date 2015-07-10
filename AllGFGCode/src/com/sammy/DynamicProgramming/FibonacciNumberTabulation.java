package com.sammy.DynamicProgramming;

import java.util.HashMap;
import java.util.Map;

//For fibonacci tabulation is faster as no recursion
public class FibonacciNumberTabulation {

	public static void main(String[] args) {
		long t1=System.nanoTime();
	System.out.println(provideFibonacciNumber(60));
	System.out.println(System.nanoTime()-t1);
	}
	
	public static Long provideFibonacciNumber(int n)
	{
		Map<Integer,Long> tabMap= new HashMap<Integer,Long>();	
		tabMap.put(0, 0L);
		tabMap.put(1, 1L);
		// We can have two temp variable only, no need to store all results, store only last two values
		//as Fib(n)=Fib(n-1)+Fib(n-2), but two illustrate tabulation we are storing all results
		//as for complex problems we may  need all solutions
		for(int i=2;i<=n;i++)
		{
			Long temp1=tabMap.get(i-1);
			Long temp2=tabMap.get(i-2);
			tabMap.put(i, temp1+temp2);
		}
	return tabMap.get(n);
	}

}
