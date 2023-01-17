
import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {

		foo("안녕", 1);
		foo("안녕하세요", 1, 2);
		foo("잘 있어");
	}


	static String foo(String s) {
		System.out.printf("%s", s);
	}

	static String foo(String s, int a) {
		System.out.printf("%s %d", s, a);
	}

	static String foo(String s, int a, int b) {
		System.out.printf("%s %d %d", s, a, b);
	}

}

