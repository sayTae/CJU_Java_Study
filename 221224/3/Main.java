
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		double a = Integer.parseInt(br.readLine());

		System.out.println(String.format("%.2f", a));

		br.close();
	}
}
