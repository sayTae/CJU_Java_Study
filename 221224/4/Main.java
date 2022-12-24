
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		sb.append(br.readLine());

		sb.insert(6, "-");

		System.out.println(sb.toString());
	}
}
