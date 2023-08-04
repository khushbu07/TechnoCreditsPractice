package ForWhile;

public class WhileLoop2 {
	
	void display(int start, int end) {

		int index = start;
		System.out.println("Divisible by 5, numbers are:");
		while (index <= end) {
			if(index%5==0)
			System.out.println(index);
			index++;
		}
		
	}

	public static void main(String[] args) {

		WhileLoop2 whileLoop2 = new WhileLoop2();
		whileLoop2.display(10, 30);

	}

}
