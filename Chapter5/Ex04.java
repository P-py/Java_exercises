package chapter05;
import java.util.Scanner;

public class Ex04{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int hora_inicial, hora_final;
		int duracao;
		hora_inicial = sc.nextInt();
		hora_final = sc.nextInt();
		if(hora_inicial < hora_final) {
			duracao = hora_final - hora_inicial;
		}
		else {
			duracao = hora_final - hora_inicial + 24;
		}
		System.out.printf("O JOGO DUROU %d HORA(S)", duracao);
		sc.close();
	}
}