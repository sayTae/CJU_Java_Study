
class Calculator {
	int value;

	Calculator() {
		this.value = 0;
	}

	void add(int val) {
		this.value += val;
	}

	int getValue() {
		return this.value;
	}

	boolean isOdd(int val) {
		return (val % 2 == 1) ? true : false;
	}

	float avg(int[] arr) {
		int sum = 0;
		for (int num : arr) {
			sum += num;
		}
		return sum / arr.length;
	}
}


class UpgradeCalculator extends Calculator {
	void minus(int val) {
		this.value -= val;
	}
}


class MaxLimitCalculator extends Calculator {
	int getValue() {
		return (this.value < 100) ? this.value : 100;
	}
}
