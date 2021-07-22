package firstproject;

public class ExceptionExample {

	public static void main(String[] args) {
		try {
			int data = 50 /0; // throw exception
		}
		// handling the exception
		catch (Exception e) {
			// displaying the custom message
			System.out.println("Can't divided by zero");
		}
	}
}
