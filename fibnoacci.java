import java.util.Scanner;

public class fibnoacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("FIBONACCI");
		System.out.println("~~~~~~~~~");

		int n;

		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number :");
		n = s.nextInt();

		int a = 0, b = 1, d = 2, e = 3, c;
		System.out.println(a + " " + b + " " + d + " " + e);

		for (int i = 0; i < n; i++) {
			c = a + b;

			System.out.println("" + c);
			a = b;
			b = c;

		}

	}
}
