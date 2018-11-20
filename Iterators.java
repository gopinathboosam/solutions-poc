package com.learn.collections;
/**
*@author gopi
* Iteration of objects
*/
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;

public class Iterators {
	public static void main(String[] args) {

		callEnumeration();
		List<String> l = new ArrayList<String>();
		Map<String, String> map = new HashMap<String, String>();
		map.put(null, null);

		Map<String, String> map1 = new ConcurrentHashMap<String, String>();
		map1.put(null, null);
		Map<String, String> map2 = new Hashtable<String, String>();
		map2.put(null, null);
	}

	private static void callEnumeration() {
		// TODO Auto-generated method stub
		Vector v = new Vector<>();
		for (int i = 0; i < 10; i++) {
			v.addElement(i);
		}

		Enumeration e = v.elements();
		while (e.hasMoreElements()) {
			System.out.println("Enumerated " + (Integer) e.nextElement());
		}
	}

}
