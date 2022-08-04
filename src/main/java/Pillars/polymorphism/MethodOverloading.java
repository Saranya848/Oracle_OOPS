package Example;

import java.util.Scanner;

public class MethodOverloading {
	
	static int add(int a, int b) {
		return a+b;
	}
	static int add(int a, int b, int c) {
		return a+b+c;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(add(12, 13));
		System.out.println(add(12, 13, 15));
	}

}
