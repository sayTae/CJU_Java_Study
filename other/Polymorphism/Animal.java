
interface Predator {
	public String getFood();
}


interface Barkable {
	public void bark();
}


class Animal {
	String name;

	void setName(String name) {
		this.name = name;
	}
}


class Tiger extends Animal implements Predator, Barkable {
	
	Tiger(String name) {
		this.setName(name);
	}

	public String getFood() {
		return "apple";
	}

	public void bark() {
		System.out.println("어흥");
	}
}


class Lion extends Animal implements Predator, Barkable {
	
	Lion(String name) {
		this.setName(name);
	}

	public String getFood() {
		return "banana";
	}

	public void bark() {
		System.out.println("으르렁");
	}
}


class ZooKeeper {
}


class Bouncer {
	void barkAnimal(Barkable animal) {
		animal.bark();
	}
		// if (animal instanceof Tiger) {
		// 	System.out.println("어흥");
		// } else if (animal instanceof Lion) {
		// 	System.out.println("으르렁");
		// }
}
