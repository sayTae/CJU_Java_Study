
import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		
		// System.out.println(Day.MON.name());      // MON
		// System.out.println(Day.MON.label());     // Monday
		// System.out.println(Day.MON.num());     // Monday
		
		Day[] arr = Day.values();

		System.out.println(Arrays.toString(arr));
		System.out.println(Day.MON.ordinal());

        }

	enum Day {
		MON("Monday", 1),
		TUE("Tuesday", 2),
		WED("Wednesday", 3),
		THU("Thursday", 4),
		FRI("Friday", 5),
		SAT("Saturday", 6),
		SUN("Sunday", 7)
		;

		private final String label;
		private final int num;

		Day(String label, int num) {
			this.label = label;
			this.num = num;
		}

// 		public String label() {
// 			return label;
// 		}
// 		public int num() {
// 			return num;
// 		}
	}

}
