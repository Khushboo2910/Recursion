package com.kodnest.recursion;

public class Solution {
	public static void main(String[] args) {
		display();	//METHOD CALL
	}
	
	//METHOD DEFINATION
	static void display() { //METHOD SIGNATURE
		System.out.println("Recursion");
		display();
	}
}
