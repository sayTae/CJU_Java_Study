

public class Main {

	public static void main(String[] args) {

		this.foo("안녕", 1);
		this.foo("안녕하세요", 1, 2);
		this.foo("잘 있어");

		// overloading method
		static void foo(String s) {
			System.out.printf("%s\n", s);
		}
		// overloading method
		static void foo(String s, int a) {
			System.out.printf("%s %d\n", s, a);
		}
		// overloading method
		static void foo(String s, int a, int b) {
			System.out.printf("%s %d %d\n", s, a, b);
		}

}
