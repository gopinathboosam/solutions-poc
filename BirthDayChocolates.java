package com.learn.test;
/**
 * @author gopi
 * Birthday candles
 * You are in charge of the cake for your niece's birthday and have decided the cake will have one candle for each year of her total age. When she blows out the candles, she’ll only be able to blow out the tallest ones. Your task is to find out how many candles she can successfully blow out.

For example, if your niece is turning  4	years old, and the cake will have 4 candles of height 4 ,4 ,1 ,3 , she will be able to blow out 2 candles successfully, since the tallest candles are of height 4 and 2 there are  such candles.
*Problem Source : Hackerrank 
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BirthDayChocolates {
public static void main(String[] args) {
	int[] segments = {1,2,1,3,2};
	List<Integer> li = new ArrayList<Integer>();
	List<String> lis=  new ArrayList<String>();
	int[] array= li.stream().mapToInt(Integer::intValue).toArray();
	int d=3, m=2;
	getWays(segments, d, m);
}

private static void getWays(int[] segments, int d, int m) {
	// TODO Auto-generated method stub
	int ways=0;
	for(int i=0; i<=segments.length-m;i++){
		if(d== Arrays.stream(segments,i,i+m).sum()){
			ways++;
		}
	}
	System.out.println(ways);
}
}
