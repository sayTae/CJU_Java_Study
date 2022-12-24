
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String a = br.readLine();

		StringBuilder sb = new StringBuilder();

		// for(int i=0; i<13; i++) {
		// 	sb.append(a.charAt(i));
		// }
		// System.out.println(sb.toString());

		for(int i=0; i<13; i++) {
			sb.append(a.charAt(i));
		}

		sb.insert(6, "-");

		System.out.println(sb.toString());
	}
}
