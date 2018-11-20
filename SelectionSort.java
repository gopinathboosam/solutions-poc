package com.learn.test;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int[] arr = {23,11,43,21,10	};
		sort(arr);
		//find the minimum
		//iterate
		
}

	private static void sort(int[] arr) {
		// TODO Auto-generated method stub
		
		for(int i=0; i<arr.length-1;i++) {
			int min=i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]<arr[min]) {
					min=j;
				}
			}
			int temp= arr[min];
			arr[min]=arr[i];
			arr[i]=temp;
		}
		System.out.println(Arrays.toString(arr));
	}
}
