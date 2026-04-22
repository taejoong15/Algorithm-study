import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String A = sc.next();
		String B = sc.next();
		int C = sc.nextInt();
		
		int nA = Integer.parseInt(A);
		int nB = Integer.parseInt(B);
		
		System.out.println(nA + nB - C);
		
		String sum = A + B;
		int num = Integer.parseInt(sum);
		System.out.println(num - C);
		
		sc.close();
	}
}