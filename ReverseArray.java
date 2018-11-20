package com.learn.basics;

public class ReverseArray {
public static void main(String[] args) {
	int arr[]={3,2,7,8,5};
	reverseArray(arr);
}

private static void reverseArray(int[] arr) {
	// TODO Auto-generated method stub
	
	int len= arr.length;
	int start =0;
	int end = len-1;
	int temp;
	while(start<end){
		temp=arr[start];
		arr[start]=arr[end];
		arr[end]=temp;
		start++;
		end--;
	}
	for (int i:arr){
		System.out.println(i);
	}
}
}
