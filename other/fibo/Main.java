
import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder(); StringTokenizer st;

		int N = Integer.parseInt(br.readLine());
		br.close();

		long startTime;
		long endTime;

		startTime = System.currentTimeMillis();
		System.out.println(fibo(N));
		endTime = System.currentTimeMillis();
		System.out.println(String.format("코드 실행 시간: %10dms", endTime - startTime));

		startTime = System.currentTimeMillis();
		System.out.println(getDpFibo(N));
		endTime = System.currentTimeMillis();
		System.out.println(String.format("코드 실행 시간: %10dms", endTime - startTime));
	}


	static long fibo(int n) {
		if (n<=1) return n;
		return fibo(n-2) + fibo(n-1);
	}

	static long getDpFibo(int n) {
		long[] fiboDpArr = new long[n + 1];

		fiboDpArr[0] = 0;
		fiboDpArr[1] = 1;

		if (n > 1) {
			for (int i=2; i<=n; i++) {
				fiboDpArr[i] = fiboDpArr[i-2] + fiboDpArr[i-1];
			}
		}
		return fiboDpArr[n];
	}

}

