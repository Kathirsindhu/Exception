package error;

public class Demo {
	public void findA() {
		findB();
	}

	public void findB() {
		findA();

	}

	public static void main(String[] args) {
		Demo a = new Demo();
		a.findA();
	}
}
