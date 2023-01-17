

class Animal {
	String name;

	void setName(String name) {
		this.name = name;
	}
}


class Dog extends Animal {
	void sleep() {
		System.out.println(this.name + " sleep..zzz");
	}
}


class HouseDog extends Dog {
	HouseDog(String name) {
		this.setName(name);
	}

	HouseDog(int type) {
		if (type == 1) {
			this.setName("chiwhawha");
		}
		else {
			this.setName("bullDog");
		}
	}

	void sleep() {
		System.out.println(this.name + " sleep in house.");
	}

	void sleep(int hour) {
		System.out.println(this.name + " sleep in house " + hour + " hour.");
	}
}
