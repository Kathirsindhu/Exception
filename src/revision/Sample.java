package revision;

public class Sample {
	public static void main(String[] args) {
		String[] a = { "hai", "hello" };
		try {
			// System.out.println(a[5]);
			// System.out.println(a[0].charAt(5));
			System.out.println(a[0]);
		} catch (StringIndexOutOfBoundsException se) {
			System.out.println("String index out of bounds");
		} catch (IndexOutOfBoundsException ie) {
			System.out.println("Index out of bound");
		} catch (RuntimeException re) {
			System.out.println("runtime exception");
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			System.out.println("no exception");
		}
	}
}
