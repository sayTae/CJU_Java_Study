
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());

		System.out.println(area(N));
	}


	public static int area(int r) {
		
		int result = r*r*6;

		return result;
	}
}
