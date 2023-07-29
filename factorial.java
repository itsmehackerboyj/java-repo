import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n;

		Scanner s = new Scanner(System.in);
		System.out.println("Enter the star value :");
		n = s.nextInt();

		int fact = 1;

		for (int i = 1; i <= n; i++) {
			fact = fact * i;

		}
		System.out.println("Factorial " + n + " is :" + fact);

	}

}
