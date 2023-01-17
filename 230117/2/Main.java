
import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {

		Foo.foo("안녕", 1);
		Foo.foo("안녕하세요", 1, 2);
		Foo.foo("잘 있어");
	}

}


class Foo{

	static void foo(String s) {
		System.out.printf("%s\n", s);
	}

	static void foo(String s, int a) {
		System.out.printf("%s %d\n", s, a);
	}

	static void foo(String s, int a, int b) {
		System.out.printf("%s %d %d\n", s, a, b);
	}

}
