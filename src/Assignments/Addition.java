package Assignments;



public class Addition {

	// Program - 4:
	// Create a class Addition and write add method for:
	// a) add two integers
	// b) add two decimal
	// c) add two String

	public static void main(String[] args) {
		Addition addition = new Addition();
		addition.addInt(10, 20);
		addition.addDecimal(10.5f, 20.5f);
		addition.addString("10A", "20B");
	}

	void addInt(int a, int b) {
		int sum = a + b;
		System.out.println("Integer Sum :"+sum);
	}

	void addDecimal(float a, float b) {
		float sum = a + b;
		System.out.println("Float Sum :"+sum);
	}

	void addString(String a, String b) {
		String sum = a + b;
		System.out.println("String Sum :"+sum);
	}

}
