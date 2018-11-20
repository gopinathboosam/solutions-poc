package com.learn.test;

import java.math.BigInteger;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
/**
 * Birthday cake candles
 * ProblemCourtesy : Hackerrank
 * @author gopi
 *
 */
public class MinMaxSum {

	public static void main(String[] args) {
		//int arr[] = {5,3,2,4,1};
		//getMinMax(arr);
		int arr[] = {4,2,3,4};
		//int arr1[] = {4,2,4,3};

		getNoOfCandles(arr);
	
	}

	

	private static void getNoOfCandles(int[] arr) {
		Arrays.sort(arr);
		int size= arr.length;
		int count=0;
		for(int i=0; i<size;i++){
			if(arr[i]==arr[size-1]){
				count++;
			}
		}
		System.out.println(count);
		
	}
	
	

	private static void getMinMax(int[] arr) {

		Arrays.sort(arr);
		BigInteger minSum= BigInteger.valueOf(0), maxSum= BigInteger.valueOf(0);
		for(int i=0; i<arr.length-1;i++)
			minSum=minSum.add(BigInteger.valueOf(arr[i]));
		for(int i=1; i<arr.length;i++)
			maxSum=maxSum.add(BigInteger.valueOf(arr[i]));
		System.out.println(minSum+" "+maxSum);
		
	}
}
