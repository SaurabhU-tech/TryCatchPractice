package tcPackage;

public class WoExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 0;
		try {
		int result = a/b;
		System.out.println(result);
		}
		catch (ArithmeticException e) {
		System.out.println("Divided by zero Error");
		}
		System.out.println("Hello Selenium");
		System.out.println("Hello Java");
		
		int array1 [] = new int [4];
		try {
		array1[10] = 100;
		System.out.println(array1[10]);
		}
		catch (ArrayIndexOutOfBoundsException e2) {
			System.out.println("Value assign to wrong index");
		}
		System.out.println("added new print statement...");

	}

}
