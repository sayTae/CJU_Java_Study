
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String c = br.readLine();
		String y = br.readLine();
		br.close();

		whosWin(c, y);
	}


	static void whosWin(String a, String b) {

		if ((a.equals('r') && b.equals('p')) || (a.equals('s') && b.equals('r')) || (a.equals('p') && b.equals('s'))) {
			System.out.println("영희, 승!");
		}
		else if (a.equals(b)) {
			System.out.println("비김!!");
		}
		else {
			System.out.println("철수, 승!");
		}

	}
}

