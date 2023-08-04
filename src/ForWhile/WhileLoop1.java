package ForWhile;

public class WhileLoop1 {

	void display(int start, int end) {

		int index = start;
		System.out.println("Even numbers are:");
		while (index < end) {
			if(index%2==0)
			System.out.println(index);
			index++;
		}
		
	}

	public static void main(String[] args) {

		WhileLoop1 whileLoop1 = new WhileLoop1();
		whileLoop1.display(10, 15);

	}
}