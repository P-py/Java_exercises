package chapter04;
import java.util.Locale;
import java.util.Scanner;

public class Ex01{
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		int num1, num2;
		int soma;
		
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		soma = num1+num2;
		
		System.out.printf("SOMA = %d", soma);
		
		sc.close();
	}
}