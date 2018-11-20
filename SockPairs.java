package com.learn.test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SockPairs {

	public static void main(String[] args) {
		int[] socks = {10,20,20,10,10,30,50,10,20} ;
		//getPair(socks);
		fromStreams(socks);
	}

	private static void fromStreams(int[] socks) {
Map<Object,List<int[]>> mapp =Stream.of(socks).sorted().collect(Collectors.groupingBy(s->s));
System.out.println("Asda");
}

	private static void getPair(int[] socks) {
		// TODO Auto-generated method stub
		//normal method
		Arrays.sort(socks);;
		int countPairs=0;
		for(int i=0; i<socks.length-1;i++) {
			if(socks[i]==socks[i+1]) {
				countPairs++;
				i++;
			}
		}
		System.out.println(countPairs);
	}
}
