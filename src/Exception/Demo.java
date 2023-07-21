package Exception;

public class Demo {
	public static void main(String[] args) {
		int a = 10;
		int b = 0;
		System.out.println(a);
		System.out.println(b);
		try {
			System.out.println(a / b);
		} catch (Exception l) {
			// System.out.println("exception accured");
			// System.out.println(l);
			l.printStackTrace();
		}

		System.out.println(a + b);
		System.out.println(a - b);
	}
}
