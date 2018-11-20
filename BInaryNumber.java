package com.learn.test;
/**
 * 
 * @author gopi
 * CHecking if a number is binary or not
 */
public class BInaryNumber {

	public static void main(String[] args) {
		int number = 45;
		checkBinary(number);
	}

	private static void checkBinary(int number) {
		// TODO Auto-generated method stub
		int len = String.valueOf(number).length();
		boolean flag = false;
		for(int i=0;i<len;i++){
			int denom = getDenom(i);
			int reminder = number%denom;
			if((reminder==0 || reminder ==1) && flag==true) {
				flag= true;
			} else {
				flag = false;
			}
			
		}
		if(flag)
			System.out.println("Binary");
		else
			System.out.println("non");
	}

	private static int getDenom(int i) {
		// TODO Auto-generated method stub
		int zeroesInt=0;
		if(i==0)
			return 1;
		else{
			 zeroesInt = getZeroes(i);
		}
		return zeroesInt;
	}

	private static int getZeroes(int i) {
		// TODO Auto-generated method stub
		StringBuffer st = new StringBuffer();
		st.append("1");
		for(int j=1;j<i;j++){
			st.append("0");
		}
		return Integer.parseInt(st.toString());
	}
}
