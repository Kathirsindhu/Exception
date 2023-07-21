package Exception;

import java.util.Scanner;

public class LogIn {
	public static void main(String[] args) throws LoginException {
		Scanner a = new Scanner(System.in);
		System.out.println("enter username");
		String aa = a.next();
		System.out.println("enter password");
		String bb = a.next();
		try {
			if (aa.equals("hello") && bb.equals("hai")) {
				System.out.println("authorised person");
			} else {
				throw new LoginException("wrong");
			}
			System.out.println("thank you");
		} catch (Exception e) {
			System.out.println("invalid credentials");
		} finally {
			System.out.println("finally");
		}

	}
}
