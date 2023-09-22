package chapter05;
import java.util.Scanner;

public class Ex01{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number;
		number = sc.nextInt();
		
		if (number < 0) {
			System.out.println("NEGATIVO");
		}
		else if (number == 0) {
			System.out.println("ZERO.");
		}
		else if (number > 0) {
			System.out.println("NAO NEGATIVO.");
		}
		
		sc.close();
	}
}