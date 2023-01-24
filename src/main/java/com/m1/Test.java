package com.m1;

public class Test {
	public static void main(String[] args) {
		System.out.println(1);
	}
	@org.junit.Test
	public void test(){
		System.out.println(add(3,2));
	}
	public int add(int a,int b){
		return a+b;
	}
}
