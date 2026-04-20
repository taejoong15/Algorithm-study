import java.util.Scanner;

class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		while(true) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			if(A != 0 && B != 0)
			sb.append(A+B).append(" ").append("\n");
			
			if(A == 0 && B == 0) break;
		}
		System.out.println(sb);
	}
}