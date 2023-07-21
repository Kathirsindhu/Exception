package revision;

public class CustomException extends Exception {
	public CustomException(String a) {
		super(a);
	}

	public void printStackTrace() {
		System.out.println("password must be in 8 eight characters");
	}
}
