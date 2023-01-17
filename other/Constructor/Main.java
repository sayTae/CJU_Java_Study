

class Main {
	public static void main(String[] args) {

		HouseDog houseDog = new HouseDog("happy");
		System.out.println(houseDog.name);

		houseDog.setName("puppy");

		houseDog.sleep();
		houseDog.sleep(3);

		HouseDog houseDog2 = new HouseDog(1);

		houseDog2.sleep();
		houseDog2.sleep(3);

		HouseDog houseDog3 = new HouseDog(2);

		houseDog.sleep();
		houseDog.sleep(3);

	}
}
