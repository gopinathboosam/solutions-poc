package com.learn.test;

import java.util.Arrays;
/**
 * Minimum swaps required to make an array in ascending order
 * @author gopi
 *
 */
public class MinimumSwaps {
	 
public static void main(String[] args) {
	int[] a = {7,1,3,2,4,5,6};
	swapsRequiesd(a); 
}

private static void swapsRequiesd(int[] arr) {
	int arrLen = arr.length;//7
    int count = 0;
    int [] sarr = arr.clone();
    Arrays.sort(sarr);//1,2,3,4,5,6,7
    
    for (int i = 0; i < arrLen; i++) {
        if (arr[i] != sarr[i]) {
            count++;
            for (int j = i + 1; j < arrLen; j++) {
                if (arr[j] == sarr[i] ) {
                    int tmp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = tmp;
                    break;
                }
            }
        }
    }
    //return count;
    System.out.println(count);
}
}
