
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String s = br.readLine();
		
		if (s.substring(s.length() -3).equals("com")) {
			System.out.printf("%s은 'com'으로 끝납니다.\n", s);
		} 
		if (s.contains("java")) {
			System.out.printf("%s은 'java'를 포함합니다.\n", s);
		}
		
	}
}

