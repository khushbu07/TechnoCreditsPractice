package ForWhile;

public class ForLoop4 {

	void display(int start, int end) {

		System.out.println("Divisible by 7 or 13, numbers are:");
		
		for (int index = start; index <= end; index++) {

			if (index % 7 == 0  )
			System.out.println(index +" is divisible by 7");
			
			if (index % 13 == 0 )
				System.out.println(index +" is divisible by 13");
	}

	}
	public static void main(String[] args) {

		ForLoop4 forloop4 = new ForLoop4();
		forloop4.display(5, 40);

	}

}
