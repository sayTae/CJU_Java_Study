
public class Main {
	public static void main(String[] args) {

		Mineral gold = new Gold();
		Mineral silver = new Silver();
		Mineral bronze = new Bronze();

		System.out.println(gold.getName());
		System.out.println(silver.getName());
		System.out.println(bronze.getName());

		System.out.println(gold.getValue());
		System.out.println(silver.getValue());
		System.out.println(bronze.getValue());

		MineralCalculator mineralCal = new MineralCalculator();
		System.out.println(mineralCal.add(silver));
	}
}
