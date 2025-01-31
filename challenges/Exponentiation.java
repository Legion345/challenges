import java.util.Scanner;

public class Exponentiation {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);

		int base;
		int exponenet;
		int value = 1;

		System.out.print("Base: ");
		base = console.nextInt();

		System.out.print("Exponenet: ");
		exponenet = console.nextInt();

		for (int i = 1; i <= exponenet; i++) {
			value *= base;
			System.out.println(i + "^" + exponenet + " = " + value);
		}
	}
}
