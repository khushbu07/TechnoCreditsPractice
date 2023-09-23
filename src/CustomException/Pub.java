
package CustomException;

public class Pub {

	void validateEntry(int age) throws Exception {
		if (age <= 18) {

			throw new AgeNotException();
		}

	}

	public static void main(String[] args) {

		try {
			new Pub().validateEntry(15);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
