
import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s = br.readLine();
		String alpha = br.readLine();
		br.close();

		int count = s.length() - s.replace(alpha, "").length();
		System.out.println(count);
	}

}

