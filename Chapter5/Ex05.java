package chapter05;
import java.util.Scanner;

public class Ex05{
	public static void main(String[] args) {
		//config
		Scanner sc = new Scanner(System.in);
		
		//variables
		int code, units;
		int hot_dog_code = 1, x_salada_code = 2, x_bacon_code = 3;
		int torrada_code = 4, refrigerante_code = 5;
		double hot_dog_price = 4.0;
		double x_salada_price = 4.5;
		double x_bacon_price = 5.0;
		double torrada_price = 2.0;
		double refrigerante_price = 1.5;
		
		double final_price;
		
		code = sc.nextInt();
		units = sc.nextInt();
		
		sc.close();
		
		if (code == hot_dog_code) {
			final_price = units*hot_dog_price;
			System.out.printf("R$ %.2f", final_price);
		}
		else if (code == x_salada_code) {
			final_price = units*x_salada_price;
			System.out.printf("R$ %.2f", final_price);
		}
		else if (code == x_bacon_code) {
			final_price = units*x_bacon_price;
			System.out.printf("R$ %.2f", final_price);
		}
		else if (code == torrada_code) {
			final_price = units*torrada_price;
			System.out.printf("R$ %.2f", final_price);
		}
		else if (code == refrigerante_code) {
			final_price = units*refrigerante_price;
			System.out.printf("R$ %.2f", final_price);
		}
		else {
			System.out.println("Invalid product code.");
		}
	}
}