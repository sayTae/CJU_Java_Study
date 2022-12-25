
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		double a = Double.parseDouble(br.readLine());

		br.close();

		System.out.println(String.format("%.2f", a));
	}
}
