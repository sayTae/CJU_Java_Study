
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
		br.close();

		int c = 0;

        StringBuilder sb = new StringBuilder();

		for(int k=(N-1); k>=0; k--) {

			for(int i=(N-1); i>=0; i--) {
				sb.append(" ");
			}
			for(int i=0; i<=c; i++) {
				sb.append("* ");
			}
			sb.append("\n");

			N -=1;
			c +=1;
		}

        System.out.println(sb);
	}
}
