public class Fibonacci {

	public static void main(String[] args) {
		System.out.println(printFibo(10));
	}

	private static int printFibo(int n) {
		if (n <= 0) {
			return 0;
		}
		if (n == 1) {
			return 1;
		}
		return printFibo(n - 1) + printFibo(n - 2);

	}
}
