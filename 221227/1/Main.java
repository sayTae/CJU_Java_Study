
import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int Korean = Integer.parseInt(st.nextToken());
		int English = Integer.parseInt(st.nextToken());
		int Math = Integer.parseInt(st.nextToken());

		int sum = Korean + English + Math;

		System.out.printf("국어: %d, 영어: %d, 수학: %d\n", Korean, English, Math);
		System.out.printf("총점: %d\n", sum);
	}
}
