package com.sammy.DynamicProgramming;

import java.util.HashMap;
import java.util.Map;

// Using method attributes as map to retain information
public class FibonacciNumberMemoization {

	public static void main(String[] args) {
		long t1=System.nanoTime();
		System.out.println(provideFibonacciNumber(60,new HashMap<Integer,Long>()));
		System.out.println(System.nanoTime()-t1);
	}
	// Using method attributes as map to retain information
	public static Long provideFibonacciNumber(int n, Map <Integer,Long> tabMap)
	{
		if(n==0)
			return 0L;
		else if(n==1)
			return 1L;
		
		else if(!tabMap.containsKey(n))
		{
		Long temp=provideFibonacciNumber(n-1,tabMap)+provideFibonacciNumber(n-2,tabMap);
		tabMap.put(n, temp);
		return temp;
		}
		else
			return tabMap.get(n);
	}
}
