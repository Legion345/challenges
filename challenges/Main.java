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
		Exponent(10, 5);
		System.out.println();
		Reversed(123456);
		System.out.println();
		int[] numbers = { 1, 2, 3, 4, 5, 6 };
		EvenOdd(numbers);
		System.out.println();
		System.out.println("The number is prime: " + isPrime(12));
		System.out.println();
		findHCF(100, 101);
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

	public static void Exponent(int base, int exponent) {
		int value = 1;

		for (int i = 1; i <= exponent; i++) {
			value *= base;
			System.out.println(i + "^" + exponent + " = " + value);

		}
	}

	public static void Reversed(int sequence) {
		int rev = 0;

		while (sequence != 0) {
			int rem = sequence % 10;
			rev = rev * 10 + rem;
			sequence = sequence / 10;
		}
		System.out.println(rev);
	}

	public static void EvenOdd(int[] numbers) {
		int evenSum = 0;
		int oddSum = 0;

		for (int i = 0; i < numbers.length; i++) {
			if ((numbers[i] % 2) == 0) {
				evenSum += numbers[i];
			} else {
				oddSum += numbers[i];
			}
		}
		System.out.println("The sum of the even numbers is " + evenSum);
		System.out.println("The sum of the odd numbers is " + oddSum);
	}

	public static boolean isPrime(int number) {
		if (number <= 1) {
			return false;
		}
		for (int i = 2; i <= number / 2; i++) {
			if ((number % i) == 0) {
				return false;
			}
		}
		return true;
	}

	public static void findHCF(int first, int second) {
	}
}
