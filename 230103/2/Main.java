
import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st;

		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];

		st = new StringTokenizer(br.readLine(), " ");

		for(int i=0; i<N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		System.out.println(Cal.average(arr));
	}
}


class Cal { 
	static float average(int[] arr) {
		
		int sum = 0;
		
		for(int r : arr) {
			sum += r;
		}

		return sum / arr.length;
	}
}
