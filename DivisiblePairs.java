package com.learn.test;
/**
 * Divisible Sum Pairs
 * Problem SOurce : Hackerrank
 * @author gopi
 *
 */
public class DivisiblePairs {
public static void main(String[] args) {
	int n=6, k=3;
	int[] arr= {1,3,2,6,1,2};
	
	getPairs(n,k,arr);
}

private static int getPairs(int n, int k, int[] arr) {
		// TODO Auto-generated method stub
	int pair=0;
	if(n>2) {
		for(int i=0; i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if((arr[i]+arr[j])%k==0) {
					pair++;
				}
			}
		}
	}
	System.out.println(pair);
	return pair;
}
}
