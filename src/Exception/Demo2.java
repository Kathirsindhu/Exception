package Exception;

public class Demo2 {
	public static void main(String[] args) {
		String a = null;
		try {
			System.out.println(a.toUpperCase());
		} catch (ArithmeticException ae) {
			System.out.println(ae);
		} catch (NumberFormatException ne) {
			System.out.println(ne);
		} catch (NullPointerException npe) {
			System.out.println(npe);
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println(a);
	}
}
