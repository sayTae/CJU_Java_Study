
import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int Korean = Integer.parseInt(st.nextToken());
		int English = Integer.parseInt(st.nextToken());
		int Math = Integer.parseInt(st.nextToken());

		double average = (Korean + English + Math) / 3.0;

		System.out.printf("평균점수(실수형) = %.14f\n", average);
		System.out.printf("평균점수(정수형) = %d\n", (int) average);
	}
}
