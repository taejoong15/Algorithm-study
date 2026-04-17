import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int X = sc.nextInt();
		int N = sc.nextInt();
		int c = 0;
		
		for (int i = 0; i < N; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			c += a * b;
		}		
		System.out.println(X == c ? "Yes" : "No");
		sc.close();
	}
}