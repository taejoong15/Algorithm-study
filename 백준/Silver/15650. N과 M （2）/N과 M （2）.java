import java.util.Scanner;

class Main {

	static int N, M;
	static int arr[];

	static void combination(int idx, int start) {

		if (idx == M) {
			for (int i = 0; i < M; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();
			return;
		}

		for (int i = start; i <= N; i++) {
			arr[idx] = i;
			combination(idx + 1, i + 1);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		N = sc.nextInt();
		M = sc.nextInt();
		arr = new int[M];

		combination(0, 1);

		sc.close();
	}
}