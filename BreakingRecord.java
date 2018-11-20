package com.learn.test;
/**
 * 
 * @author gopi
 * BreakingRecord
 * Problem Source: HackerRank
 */
public class BreakingRecord {
public static void main(String[] args) {
	int games=9;
	//int[] points={10,5,20,20,4,5,2,25,1};
	int[] points={3,4,21,36,10,28,35,5,24,42};
	getPoints(points);
}

private static int[] getPoints(int[] scores) {
	// TODO Auto-generated method stub
	int maxPoint=0, minPoint=0;
	maxPoint=minPoint=scores[0];
	int[] result = new int[2];
	for(int i=1; i<scores.length;i++) {
		if(minPoint>scores[i]){
			minPoint=scores[i];
			result[1]++;
		} else if(maxPoint<scores[i]) {
			maxPoint=scores[i];
			result[0]++;
		}
	}
	return result;
}
}
