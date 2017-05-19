package com.practise;

import java.util.Comparator;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.TreeSet;

public class Example implements Comparator {

	public Example() {
		super();
	}

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		if (((Test)o1).getName().compareTo(((Test)o2).getName())>0){
			return -1;

		} else if (((Test)o1).getName().compareTo(((Test)o2).getName())< 0) {
			return 1;
		} else
			return 0;

	}

	public static void main(String args[]) {
		TreeSet<Test> set = new TreeSet<Test>(new Example());
		set.add(new Test("s", 1, 11));
		set.add(new Test("c", 2, 22));
		set.add(new Test("h", 3, 33));

		Iterator<Test> iter= (Iterator<Test>) set.iterator();
		while(iter.hasNext()){
			System.out.println(iter.next().getName());
		}
		

	}
}
