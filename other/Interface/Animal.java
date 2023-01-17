
interface Predator {
	String getFood();

	default void printFood() {
		System.out.printf("my food is %s\n", getFood());
	}
}

class Animal {
	String name;

	void setName(String name) {
		this.name = name;
	}
}


class Tiger extends Animal implements Predator {
	public String getFood() {
		return "apple";
	}
}


class Lion extends Animal implements Predator {
	public String getFood() {
		return "banana";
	}
}


class Crocodile extends Animal implements Predator {
	public String getFood() {
		return "melon";
	}
}


class ZooKeeper {
	void feed(Predator predator) {
		System.out.println("feed " + predator.getFood());
	}
}

