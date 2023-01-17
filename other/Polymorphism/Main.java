
public class Main {
	public static void main(String[] args) {

		Tiger tiger = new Tiger("호랑이");
		Lion lion = new Lion("사자");

		System.out.println(lion.name);
		System.out.println(tiger.name);

		tiger.setName("사자사자");
		System.out.println(tiger.name);

		Bouncer bouncer = new Bouncer();
		bouncer.barkAnimal(tiger);
		bouncer.barkAnimal(lion);
	}
}
