package Exception;

public class Task {
	public static void main(String[] args) throws MailIdException {
		String a = "hai@mail.com";
		if (a.contains("gmail")) {
			System.out.println("its a gmail");
		} else {
			throw new MailIdException("check ur gmail");

		}

	}
}
