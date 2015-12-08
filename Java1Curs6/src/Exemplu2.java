import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exemplu2 {
	public static void main(String[] args) {
		BufferedReader in = null;

		try {
			in = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter first number: ");
			int firstNumber = Integer.parseInt(in.readLine());
			System.out.println("Enter second number: ");
			int secondNumber = Integer.parseInt(in.readLine());

			System.out.println("Their sum is " + (firstNumber + secondNumber));
		} catch (IOException e) {
			e.printStackTrace();
		} catch (NumberFormatException e2) {
			e2.printStackTrace();
		} finally {
			try {
				in.close();
			} catch (IOException e3) {
				e3.printStackTrace();
			}

		}
	}
}