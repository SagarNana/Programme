package Addition;

public class Paindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 454;

		int tem = num;
		int rev = 0;

		while (num > 0) {
			int d = num % 10;
			rev = rev * 10 + d;
			num = num / 10;
		}
		if (rev == tem) {
			System.out.println("Print the string is anagram");
		} else {
			System.out.println("Print the string is not anagram");
		}
	}

}
