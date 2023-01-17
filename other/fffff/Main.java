
import java.util.Scanner;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num = 2;
		int row = sc.nextInt();
		int col = sc.nextInt();

		int[][][] odds = new int[num][row][col];

		for (int i=0; i<2; i++) {
			for (int j=0; j<3; j++) {
				for (int k=0; k<3; k++) {
					int inputNum = sc.nextInt();
					odds[i][j][k] = inputNum;
				}
			}
		}
		System.out.println(Arrays.deepToString(odds));
	}
}
