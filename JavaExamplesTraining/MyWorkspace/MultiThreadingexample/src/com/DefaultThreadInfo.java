package com;

public class DefaultThreadInfo {
	public static void main(String[] args) {
		Thread t = Thread.currentThread();
		System.out.println(t);
		t.setName("My Thread");
		t.setPriority(1);       // takes values from 1 to 10
		System.out.println(t);
	}
}
