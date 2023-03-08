package Addition;

public class Fibonacci_Series_Recursion {

	public static int fibo(int n) {

		if (n == 0) {
			return 0;

		}
		if (n == 1 || n == 2) {
			return 1;
		}
		return fibo(n - 2) + fibo(n - 1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int maxNumber = 10;
		System.out.println("Print the NUMBER :" + maxNumber + " ");

		for (int i = 0; i < maxNumber; i++) {
			System.out.println(fibo(i) + " ");
		}
	}

}
/*
 * A recursive function is one that has the capability to call itself.
 * 
 * fibonacciRecursion():
 * 
 * The Java Fibonacci recursion function takes an input number. Checks for 0, 1,
 * 2 and returns 0, 1, 1 accordingly because Fibonacci sequence in Java starts
 * with 0, 1, 1. When input n is >=3, The function will call itself recursively.
 * The call is done two times. Let’s see the Fibonacci Series in Java using
 * recursion example for input of 4.
 */
