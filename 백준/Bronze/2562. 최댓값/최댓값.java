import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] a = new int[9];
		
		for (int i = 0; i < 9; i++) {
			a[i] = sc.nextInt();
		}
		
		int max = a[0];
		int b = 0;
		
		for (int i = 0; i < 9; i++) {
			if (a[i] > max) {
				max = a[i];
				b = i;
			}
		}
		System.out.println(max);
		System.out.println(b + 1);
		sc.close();
	}
}