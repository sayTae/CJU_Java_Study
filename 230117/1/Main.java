
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		br.close();

		System.out.println(factorial(N));
	}

	static int factorial(int n) {
		switch(n) {
			case 0 : { return 1; }
			default : { return n * factorial(n-1); }
		}
	}
}
