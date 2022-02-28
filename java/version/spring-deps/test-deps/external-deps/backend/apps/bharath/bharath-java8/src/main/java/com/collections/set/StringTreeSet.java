package com.collections.set;

import java.util.Set;
import java.util.TreeSet;

import com.collections.comparator.StringComparator;

public class StringTreeSet {

	public static void main(String[] args) {

		Set<String> set = new TreeSet<>(new StringComparator());

		set.add("abcxyz");
		set.add("xyzabcde");
		set.add("defzzzzzzzzzzzzz");
		set.add("mno");

		for (String obj : set) {
			System.out.println(obj);
		}

	}

}
