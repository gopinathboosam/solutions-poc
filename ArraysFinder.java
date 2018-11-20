package com.learn.test;
/**
 * @author gopi
 * Given an array of integers, max and min values of an array,
 * finding out the integers missing in between the range provided
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysFinder {
public static void main(String[] args) {
	int arr[] = {5,4,2,8,9,6,0};
	int low=1, high=10;
	List<Integer> li= new ArrayList<Integer>();
	Arrays.sort(arr);
	for(int i=low; i<=high;i++){
		int index=0;
		index=Arrays.binarySearch(arr, i);
		if(index<0){
System.out.println(i);		}
	}
}
}
