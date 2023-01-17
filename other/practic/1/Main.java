
public class Main {
	public static void main(String[] args) {

		Calculator cal = new Calculator();
		cal.add(10);
		System.out.println(cal.getValue());

		UpgradeCalculator upCal = new UpgradeCalculator();
		upCal.add(10);
		upCal.minus(3);
		System.out.println(upCal.getValue());

		MaxLimitCalculator maxCal = new MaxLimitCalculator();
		maxCal.add(50);
		maxCal.add(60);
		System.out.println(maxCal.getValue());

		System.out.println(cal.isOdd(3));
		System.out.println(cal.isOdd(4));

		int[] data = {1,3,5,7,9};
		System.out.println(cal.avg(data));
	}
}
