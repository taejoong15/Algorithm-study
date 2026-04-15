import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		int B = sc.nextInt();

		if (0 < A && 0 < B) {
			System.out.print("1");
		} else if (0 > A && 0 < B) {
			System.out.print("2");
		} else if (0 > A && 0 > B) {
			System.out.print("3");
		} else {
			System.out.print("4");
		}
		sc.close();
	}
}
