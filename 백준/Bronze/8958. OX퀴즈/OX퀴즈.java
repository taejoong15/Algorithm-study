import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();

		int N = sc.nextInt();

		for (int i = 0; i < N; i++) {
			String str = sc.next();
			int num = 0;
			int sum = 0;

			for (int k = 0; k < str.length(); k++) {
				if (str.charAt(k) == 'O') {
					num++;
					sum += num;
				} else {
					num = 0;
				}
			}
			sb.append(sum).append("\n");
		}
		System.out.println(sb);
		sc.close();
	}
}