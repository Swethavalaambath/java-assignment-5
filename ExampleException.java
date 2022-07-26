package exceptionex;

public class ExampleException {

	public static void main(String[] args) {

		int i = 10;
		int j = 0;
		try {
			int result = i / j;
		} catch (ArithmeticException e) {
			System.out.println("Can't be devided by Zero.");
		}

	}}
