package Exception;

public class String12 {
	public static void main(String[] args) {
		String b = "Tn22CK4372";
		try {
			int a = Integer.parseInt(b);
		} catch (ArithmeticException ae) {
			System.out.println("Arithmatic");
		} catch (NumberFormatException ne) {
			System.out.println("NumberFormat");
		} catch (NullPointerException npe) {
			System.out.println("null point");
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			System.out.println("important message");
		}
		System.out.println("its clear");

	}
}
