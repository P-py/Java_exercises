package chapter07;

import java.util.Scanner;
import java.util.Locale;

public class Main{
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		/*int n1 = 89;
		int n2 = 60;
		System.out.printf("\n%d", n1&n2);
		System.out.printf("\n%d", n1|n2);
		System.out.printf("\n%d", n1^n2);*/
		
		/*int mask = 0b100000;
		int n = sc.nextInt();
		if ((n&mask) !=0) {
			System.out.println("6th bit is true!");
		}
		else {
			System.out.println("6th bit is false!");
		}*/
		/*String original = " ABC def ABC";
		String s01 = original.toLowerCase();
		String s02 = original.toUpperCase();
		String s03 = original.trim();
		String s04 = original.substring(2);
		String s05 = original.substring(2, 4);
		String s06 = original.replace('A', 'X');
		String s07 = original.replace("ABC", "XYZ");
		int index = original.indexOf("BC");
		int index2 = original.lastIndexOf("BC");
		System.out.printf("\nOriginal: -%s-", original);
		System.out.printf("\ntoLowerCase: -%s-", s01);
		System.out.printf("\ntoUpperCase: -%s-", s02);
		System.out.printf("\ntrim: -%s-", s03);
		System.out.printf("\nsubstring(2): -%s-", s04);
		System.out.printf("\nsubstring(2, 4): -%s-", s05);
		System.out.printf("\nreplace('A', 'X'): -%s-",s06);
		System.out.printf("\nreplace('ABC', 'XYZ': -%s-", s07);
		System.out.printf("\nindexOf('BC'): -%s-", index);
		System.out.printf("\nlastIndexOf('BC'): -%s-", index2);*/
		//O codigo abaixo foi feito para demonstrar a
		//estruturacao de um funcao em java
		System.out.printf("\nEnter three numbers: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int higher = max(a,b,c);
		showResult(higher);
		sc.close();
	}
	public static int max(int x, int y, int z) {
		int aux;
		if (x>y && x>z) {
			aux = x;
		}
		else if(y>z) {
			aux = y;
		}
		else {
			aux = z;
		}
		return aux;
	}
	public static void showResult(int value) {
		System.out.printf("\nHigher: %d", value);
	}
}