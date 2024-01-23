package chapter08;

import java.util.Locale;
import java.util.Scanner;
import entities_chapter08.Student;

public class Ex03{
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Student aluno1 = new Student();
		
		aluno1.name = sc.nextLine();
		aluno1.grade1 = sc.nextDouble();
		aluno1.grade2 = sc.nextDouble();
		aluno1.grade3 = sc.nextDouble();
		
		System.out.printf("\nFINAL GRADE = %.2f", aluno1.finalGrade());
		System.out.printf("%s", aluno1.approve());
		
		sc.close();
	}
}