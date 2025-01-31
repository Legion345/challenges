
public class Main {
	public static void main(String[] args) {
		PrintNum(10);
		System.out.println();
		SumNaturalNum(10);
		System.out.println();
		MuplicationTable(12);
		System.out.println();
		Factorial(5);
		System.out.println();
		Exponentiation(int base, int exponent);
	}

	public static void PrintNum(int size) {
		System.out.print("First " + size + " numbers = ");
		for (int i = 1; i < size; i++) {
			System.out.print(i + ", ");
		}
		System.out.print(size);
	}

	public static void SumNaturalNum(int lastNum) {
		int sum = 0;
		for (int i = 1; i <= lastNum; i++) {
			sum += i;
		}
		System.out.println("Sum = " + sum);
	}

	public static void MuplicationTable(int size) {
		System.out.println("Multiplication Table:");
		for (int i = 1; i <= size; i++) {
			for (int j = 1; j <= size; j++) {
				System.out.print(i * j + "\t");
			}
			System.out.println();

		}
	}

	public static void Factorial(int value) {
		int product = 1;
		String fact = "1";

		System.out.println("1! = 1");
		for (int i = 2; i <= value; i++) {
			fact = i + " x " + fact;
			product *= i;
			System.out.println(i + "! = " + fact + " = " + product);
		}
	}
	public static void Exponentiation(int base, int exponent) {
		Scanner console = new Scanner(System.in);
		int value = 1;

		System.out.print("Base: ");
		base = console.nextInt();

		System.out.print("Exponenet: ");
		exponent = console.nextInt();

		for (int i = 1; i <= exponent; i++) {
			value *= base;
			System.out.println(i + "^" + exponent + " = " + value);
		}
	}
}
