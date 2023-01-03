
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		br.close();

		StringBuilder sb = new StringBuilder();
		
		for(int k=0; k<(2*N); k++) {

			for(int i=0; i<N; i++) {
				sb.append("@");
			}
			for(int i=0; i<(N*3); i++) {
				sb.append(" ");
			}
			for(int i=0; i<N; i++) {
				sb.append("@");
			}
			sb.append("\n");
		}

		for(int i=0; i<N; i++) {
			for(int j=0; j< (N*5); j++) {
			sb.append("@");
			}
			sb.append("\n");
		}

		for(int k=0; k<N; k++) {

			for(int i=0; i<N; i++) {
				sb.append("@");
			}
			for(int i=0; i<(N*3); i++) {
				sb.append(" ");
			}
			for(int i=0; i<N; i++) {
				sb.append("@");
			}
			sb.append("\n");
		}

		for(int i=0; i<N; i++) {
			for(int j=0; j< (N*5); j++) {
			sb.append("@");
			}
			sb.append("\n");
		}

		System.out.println(sb);
	}
}
