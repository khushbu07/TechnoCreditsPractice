package ForWhile;

public class WhileLoop3 {
	
	void display(int start, int end) {

		int index = start;
		System.out.println("Divisible by 5 & 3, numbers are:");
		while (index <= end) {
			if(index%3==0 && index%5==0)
			System.out.println(index);
			index++;
		}
		
	}

	public static void main(String[] args) {

		WhileLoop3 whileLoop3 = new WhileLoop3();
		whileLoop3.display(5, 18);

	}

}
