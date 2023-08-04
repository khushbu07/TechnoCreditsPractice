package ForWhile;

public class ForLoop1 {

	void display(int start, int end) {

		for (int index = start; index <= end; index++) {

			if (index % 2 == 0) {
				System.out.println("Even numbers are:"+index);
			}

		}
	}

	public static void main(String[] args) {

		ForLoop1 forloop1 = new ForLoop1();
		forloop1.display(10, 15);

	}

}
