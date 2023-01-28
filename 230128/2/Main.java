
import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int[][] arr = new int [10][1];

		for (int i=0; i<10; i++) {
			int N = Integer.parseInt(br.readLine());

			if (0 < N && N < 10) arr[0][0] += 1;
			if (9 < N && N < 20) arr[1][0] += 1;
			if (19 < N && N < 30) arr[2][0] += 1;
			if (29 < N && N < 40) arr[3][0] += 1;
			if (39 < N && N < 50) arr[4][0] += 1;
			if (49 < N && N < 60) arr[5][0] += 1;
			if (59 < N && N < 70) arr[6][0] += 1;
			if (69 < N && N < 80) arr[7][0] += 1;
			if (79 < N && N < 90) arr[8][0] += 1;
			if (89 < N && N < 100) arr[9][0] += 1;
		}
		br.close();

		for (int i=0; i<10; i++) {
			int n = arr[i][0];
			System.out.printf("%d0 ~ %d9 : ", i, i);
			
			while (n-- >0) {
				System.out.printf("*");
			}
			System.out.println();
		}

	}

}

