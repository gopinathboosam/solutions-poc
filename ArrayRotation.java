package com.learn.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayRotation {
public static void main(String[] args) {
	int[] intt= {1,2,3,4,5};
	int rotations = 3;
	
	//getRotations(intt, rotations);
	getRotationsSimple(intt, rotations);
	
	/*List<String> li = new ArrayList<String>();
	li.add("asda");
	li.add("adada");
	li.add("asdadada");
	
	String[] ar = li.toArray(new String[li.size()]);
	System.out.println(Arrays.toString(ar));
	
	String[] arrr =  li.stream().toArray(String[]::new);
	System.out.println(Arrays.toString(arrr));*/
	
	/*List<Integer> li = new ArrayList<>();
	int[] a = li.stream().toArray(Integer[]::new);*/
			
	
}

private static void getRotationsSimple(int[] intt, int rotations) {
int arr[] = new int[intt.length];
arr= Arrays.copyOf(intt, rotations);
System.out.println(Arrays.toString(arr));
int arr1[] = new int[intt.length];
arr1 = Arrays.copyOfRange(intt, rotations, intt.length);
System.out.println(Arrays.toString(arr1));

}

private static void getRotations(int[] intt, int rotations) {
	int temp;
for(int i=0;i<rotations; i++) {
	temp=intt[0];
	for(int j=0; j<intt.length-1;j++) {
		intt[j]=intt[j+1];
		intt[j]=temp;
	}
}
System.out.println(intt);
}
}
