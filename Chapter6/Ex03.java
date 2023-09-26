package chapter06;

import java.util.Scanner;
import java.util.Locale;

public class Ex03{
	public static final int ALCOOL = 1;
	public static final int GASOLINA = 2;
	public static final int DIESEL = 3;
	public static final int FIM = 4;
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int soma_alcool = 0, soma_gasolina = 0, soma_diesel = 0;
		
		System.out.print("Digite uma entrada: ");
		int entrada = sc.nextInt();
		while (entrada != FIM) {
			if (entrada == ALCOOL) { 
				soma_alcool += 1;
			}
			else if (entrada == GASOLINA) {
				soma_gasolina += 1;
			}
			else if (entrada == DIESEL) {
				soma_diesel += 1;
			}
			entrada = sc.nextInt();
		}
		System.out.println("MUITO OBRIGADO!");
		System.out.printf("Alcool: %d\n", soma_alcool);
		System.out.printf("Gasolina: %d\n", soma_gasolina);
		System.out.printf("Diesel %d\n", soma_diesel);
		
		sc.close();
	}
}