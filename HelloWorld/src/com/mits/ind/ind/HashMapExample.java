package com.mits.ind;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap hm = new HashMap();

		// Adding pairs to HashMap
		hm.put(101, "John");
		hm.put(102, "Scott");
		hm.put(103, "David");

		// Printing pairs from HashMap
		System.out.println(hm);

		// Remove a pair from HashMap by using key
		hm.remove(102);

		System.out.println(hm);

		// Retrive a single pair from HashMap using key value
		System.out.println(hm.get(103));

		// Reading Keys and values from HashMap
		for (Map.Entry m : hm.entrySet()) {

			System.out.println((m.getKey() + "  " + m.getValue()));
		}

	}

}
