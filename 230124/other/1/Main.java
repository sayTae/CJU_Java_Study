
// import java.util.ArrayList;

// public class Main {
// 	public static void main(String[] args) {

// 		ArrayList<Integer> myArr = new ArraList<Integer>();
// 		myArr.add(1);
// 		myArr.add(2);
// 		myArr.add(3);

// 		printmyArr(myArr);

// 		public static void printMyArr (ArrayList<Integer> myArr) {
// 			Iterator iter = list.iterator();
// 			while (iter.hasnext()) {
// 				System.out.printf(iter.next());
// 			}
// 		}
// 	}
// }


import java.util.ArrayList;

class Main {

  public static void display(ArrayList<String> languages) {

    System.out.print("ArrayList: ");
    for(String language : languages) {
      System.out.print(language + ", ");
    }
  }
  public static void main(String[] args) {

    // create an arraylist
    ArrayList<String> languages = new ArrayList<>();
    languages.add("Java");
    languages.add("Python");
    languages.add("JavaScript");

    // passing arraylist as function parameter
    display(languages);
  }
}
