package com;

public class CheckedException {

	public static void main(String[] args) throws Exception{
		// Thread.sleep needs exception handling 
		// The second way is to surround Thread.sleep in try and catch
		
		
		
		System.out.println("Hello");
		try {
		Thread.sleep(5000);
		}catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("Take tea break....");
		}


}
