package ForWhile;

public class ForLoop3 {

	void display(int start, int end) {
		
		System.out.println("Divisible by 5 & 3, numbers are:");
		
		for (int index = start; index <= end; index++) {

			if (index % 3 == 0 && index % 5 == 0) {
				System.out.println(index);
			}

		}
	}

	public static void main(String[] args) {

		ForLoop3 forloop3 = new ForLoop3();
		forloop3.display(5, 18);

	}

}
