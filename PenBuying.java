
package com.learn.test;
/**
 * Buying a pen
 * Problem Courtesy : Hackerrank
 * @author gopi
 *
 */
public class PenBuying {
public static void main(String[] args) {
	int n=3, p=2,m=2;
	int pr[] = {1,2};
	int ma[] = {1,2};
	
	getStatus(n,p,m,pr,ma);
	
}

private static void getStatus(int n, int p, int m, int[] pr, int[] ma) {
	// TODO Auto-generated method stub
	String st =null;
		if(p==pr.length && m==ma.length) {
			for(int i=0; i<pr.length ; i++) {
				for(int j=0; j<ma.length ; j++) {
					if(pr[i]==ma[j]) {
						st="They Can't";
					} else {
						st="They Can";
					}
				}
			}
			System.out.println(st);
		}
}
}
