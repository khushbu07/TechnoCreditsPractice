
package CustomException;

public class Pub {

	void validateEntry(int age) {
		if (age >= 18)
			System.out.println("welcome");
		else
			throw new AgeNotException("throw age is not valid");

	}

	public static void main(String[] args) {
		Pub p1 = new Pub();
		try {
			p1.validateEntry(10);
		} catch (AgeNotException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("end");

	}
}
