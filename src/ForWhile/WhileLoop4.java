package ForWhile;

public class WhileLoop4 {
	
	void display(int start, int end) {

		int index = start;
		System.out.println("Divisible by 7 or 13, numbers are:");
		while (index <= end) {
			if(index%7==0)
			System.out.println(index +" is divisible by 7");
		      if(index%13==0)
				System.out.println(index +" is divisible by 13" );
				index++;
		}
		
	}

	public static void main(String[] args) {

		WhileLoop4 whileLoop4 = new WhileLoop4();
		whileLoop4.display(5, 40);

	}


}
