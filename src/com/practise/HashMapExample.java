package com.practise;

import java.util.HashMap;

public class HashMapExample {
	public static void main(String args[]){
	HashMap<String,String> map1 = new HashMap<String,String>();
	map1.put(null,"aa");
	map1.put("satya", "20");
	
	System.out.println(map1.get(null));
	System.out.println(map1.get("satya"));
//	System.exit(1);
	System.out.println("after end");
	
	HashMapExample ex = new HashMapExample();
	map1=null;

	ex=null;
	Runtime.getRuntime().gc();
	}
	public void finalize(){
		System.out.println("inside finalize");
	}

}
