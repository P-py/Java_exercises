package chapter06;

import java.util.Scanner;
import java.util.Locale;

public class Ex01{
	public static final int SENHA = 2002;
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a senha: ");
		int tentativa = sc.nextInt();
		
		while (tentativa != SENHA) {
			System.out.println("Senha incorreta. Tente novamente.");
			tentativa = sc.nextInt();
		}
		System.out.println("Senha correta. Acesso permitido."); 
		
		sc.close();
	}
}