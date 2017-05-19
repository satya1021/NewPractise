package com.practise;

public class TestGarbageCollection2 {

	public void finalize() {
		System.out.println("object is garbage collected");
	}

	public static void main(String args[]) {
		TestGarbageCollection2 s1 = new TestGarbageCollection2();
		TestGarbageCollection2 s2 = new TestGarbageCollection2();
		s1 = null;
		s2 = null;
		// System.gc();
	}
}
