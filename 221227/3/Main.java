
public class Main {
	public static void main(String[] args) { 

		int radius = 10;
		double area = radius * radius * 3.14;

		System.out.printf("int형 넓이: %d\n", (int) area);
		System.out.printf("float형 넓이: %.1f\n", (float) area);
		System.out.printf("double형 넓이: %.1f\n", (double) area);
	}
}
