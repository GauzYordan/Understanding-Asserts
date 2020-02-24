package mx.tec.lab;

public class OtherClass {
	public int multiply(final int x, final int y) {
		if (x > 999) {
			throw new IllegalArgumentException("X should be less than 1000");
		}

		return x * y;
	}
}