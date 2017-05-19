package com.practise;

public class TryCatchExample {

	public static void main(String args[]){
		TryCatchExample example = new TryCatchExample();
		try{
			System.out.println("in try block");
//			System.exit(0);
			System.exit(-1);
//			return;s
		}catch(Exception e){
			e.printStackTrace();
			
			System.out.println("in catch block");
		}finally{
			System.out.println("in finally block");
			
			
			
			System.out.println("aa");
			
		}
	}
}
