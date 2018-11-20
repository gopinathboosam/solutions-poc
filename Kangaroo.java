package com.learn.test;

import java.math.BigInteger;
/**
 * Kangaroo Hoping 
 * Problem Source : Hackerrank
 * @author gopi
 *
 */
public class Kangaroo {

	public static void main(String[] args) {
		System.out.println(getStatus(21,6,47, 3));
	}

	private static String getStatus(int x1, int v1, int x2, int v2) {
		// TODO Auto-generated method stub
		//x1+(i*v1) = x2+(j*v2)
		   String status=null;
		   BigInteger xb1= BigInteger.valueOf(x1),xb2= BigInteger.valueOf(x2),vb1= BigInteger.valueOf(v1),vb2= BigInteger.valueOf(v2);
		   if((xb2.compareTo(xb1))>0 && (vb1.compareTo(vb2)>0) || (xb1.compareTo(xb2))>0 && (vb2.compareTo(vb1)>0)) {
	           for(int i=0; i<10000; i++) {
	        	   xb1=xb1.add(vb1.multiply(BigInteger.valueOf(i)));
	        	   xb2=xb2.add(vb2.multiply(BigInteger.valueOf(i)));
	        	   if(xb1.compareTo(xb2)==0){
	                       status="YES";
	                     break;
	                   }
	           }
	       
		   }else {
		          status="NO";
	       }
	       return status;
		  
		   
		   
        /*   if((xb1<=xb2 && vb1>=vb2) || (xb1>=xb2 && v1<=vb2)){
           for(int i=0; i<10000; i++) {
                   if(xb1+(i*vb1) == xb2+(i*vb2)){
                       status="YES";
                     break;
                   }
           }
       } else {
          status="NO";
       }
       return status;
	}*/
}
}
