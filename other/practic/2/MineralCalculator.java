

class Mineral {
	String name;
	int value;

	Mineral() {
		this.name = "null_Strone";
		this.value = 0;
	}

	void setName(String name) {
		this.name = name;
	}

	void setValue(int val) {
		this.value = val;
	}

	String getName() {
		return this.name;
	}

	int getValue() {
		return this.value;
	}

}


class Gold extends Mineral {
	Gold() {
		this.setName("Gold");
		this.setValue(100);
	}
}


class Silver extends Mineral {
	Silver() {
		this.setName("Silver");
		this.setValue(90);
	}
}
	

class Bronze extends Mineral {
	Bronze() {
		this.setName("Bronze");
		this.setValue(80);
	}
}


class MineralCalculator {
	public int value = 0;

	int add(Mineral mineral) {
		return mineral.getValue();
	}
}
