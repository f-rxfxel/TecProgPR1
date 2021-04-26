package provas.periodo1;

public class Questao01 {

	public static void main(String[] args) {

		int n1 = 68, n2 = 76, n3 = 72, n4 = 70;

		int media = (n1 + n2 + n3 + n4) / 4;

		if (media >= 70) {
			
			System.out.println("Aluno aprovado!");
			
		}

		else if ((media >= 50) && (media <= 69)) {
			
			System.out.println("Aluno em recuperação!");
			
		} else {
			
			System.out.println("Aluno em dependência!");
		}
	}
}

/*
 * Aluno aprovado – caso a média seja maior ou igual a 70
 * 
 * Aluno em recuperação – caso a média seja entre 50 (inclusive) e 69
 * (inclusive)
 * 
 * Aluno em dependência – caso a nota seja menor que 50
 */