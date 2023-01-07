
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		br.close();

		Square sq = new Square(N);

		System.out.printf("한 변의 길이가 %d인 정사각형의 넓이: %d\n", sq.getLength(), sq.getArea());
	}
}


class Square {

	int length;

	Square(int length) {
		this.length = length;
	}

	int getArea() {
		return this.length * this.length;
	}

	int getLength() {
		return this.length;
	}
}
