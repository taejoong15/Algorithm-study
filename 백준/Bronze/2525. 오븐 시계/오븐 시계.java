import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		int min = A * 60 + B;
		min += C;
		
		int endHour = (min / 60) % 24;
		int endMin = min % 60;
		
		System.out.println(endHour + " " + endMin);
		
		sc.close();
	}
}
