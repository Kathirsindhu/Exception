package revision;

public class CheckPassword {
	public void checkPassword(String a) throws CustomException {
		try {
			if (a.length() >= 8) {
				System.out.println("login success");
			} else {
				throw new CustomException("pasword must contain more than eight");
			}
		} catch (CustomException se) {
			se.printStackTrace();
		}
	}
}
