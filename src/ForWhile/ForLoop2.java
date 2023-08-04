package ForWhile;

public class ForLoop2 {

	void display(int start, int end) {

		for (int index = start; index <= end; index++) {

			if (index % 5 == 0) {
				System.out.println("Divisible by 5, numbers are:"+index);
			}

		}
	}

	public static void main(String[] args) {

		ForLoop2 forloop2 = new ForLoop2();
		forloop2.display(10, 30);

	}

}
