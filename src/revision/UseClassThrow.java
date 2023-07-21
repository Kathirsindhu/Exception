package revision;

import java.util.Scanner;

public class UseClassThrow {
	public static void main(String[] args) throws SampleException {
		System.out.println("enter a number");
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		System.out.println("enter a string ");
		String b = s.next();
		System.out.println(b);
		if (a % 5 == 0) {
			System.out.println("it will divisible by 5");
		} else {
			throw new SampleException("give me a number which will divisible by 5");
		}
	}
}
