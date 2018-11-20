package com.learn.test;
/**
 * Oranges and Apples problem
 * Problem Courtesy : Hackerrank
 * @author gopi
 *
 */
public class OrangesApples {

	public static void main(String[] args) {
		int s=7, t=11;
		int a=5, b=15;
		int m=3, n=2;
		int apple[] ={-2,2,1};
		int orange[]={5,-6};
		getRange(s,t,a,b,m,n,apple,orange);
	}

	private static void getRange(int s, int t, int a, int b, int m, int n, int[] apple, int[] orange) {
		// TODO Auto-generated method stub
		int appleCount=0, orangeCount=0;
		int newApple[] = new int[apple.length], newOrange[]= new int[orange.length];
		for(int i=0;i<m;i++) {
			newApple[i]= a+apple[i];
			if(newApple[i] >= s && newApple[i] <= t)
				appleCount++;
		}
		for(int j=0;j<n;j++) {
			newOrange[j]= b+orange[j];
			if(newOrange[j] >= s && newOrange[j] <= t)
				orangeCount++;
		}
		
		System.out.println(appleCount);
		System.out.println(orangeCount);
		
	}
}
