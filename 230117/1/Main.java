
import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		System.out.println(factorial(5));
	}

	static int factorial(int n) {
		switch(n) {
			case 1: n<=1;
					return 1;
			case 2: n!=1;
					return n * factorial(n-1);
	}
}
