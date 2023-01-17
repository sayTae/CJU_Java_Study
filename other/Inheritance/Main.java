

class Animal {
	String name;

	void setName(String name) {
		this.name = name;
	}
}


class Dog extends Animal {
	void sleep() {
		System.out.println(this.name + " zzz");
	}
}


class HouseDog extends Dog {
	void sleep() {
		System.out.println(this.name + " zzz in house.");
	}

	void sleep(int hour) {
		System.out.println(this.name + " zzz in house " + hour + " hour.");
	}
}


public class Main {
	public static void main(String[] args) {
		
		Dog dog = new Dog();
		dog.setName("puppy");

		System.out.println(dog.name);
		dog.sleep();

		System.out.println();

		HouseDog houseDog = new HouseDog();
		houseDog.setName("happy");

		System.out.println(houseDog.name);
		houseDog.sleep();
		houseDog.sleep(3);
	}
}
