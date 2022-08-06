package Samples;

import java.io.PrintWriter;

public interface Messanger {
	//Interface contains exactly one abstract method is known as functional interface
	public void execute();
	public default void print(String text) {
		System.out.println(text);
	}
	
	public static void print(String text, PrintWriter writers) {
		writers.write(text);
	}
}
