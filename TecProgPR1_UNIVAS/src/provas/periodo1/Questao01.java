package provas.periodo1;

public class Questao01 {

	public static void main(String[] args) {

		int n1 = 68, n2 = 76, n3 = 72, n4 = 70;

		int media = (n1 + n2 + n3 + n4) / 4;

		if (media >= 70) {
			
			System.out.println("Aluno aprovado!");
			
		}

		else if ((media >= 50) && (media <= 69)) {
			
			System.out.println("Aluno em recupera��o!");
			
		} else {
			
			System.out.println("Aluno em depend�ncia!");
		}
	}
}

/*
 * Aluno aprovado � caso a m�dia seja maior ou igual a 70
 * 
 * Aluno em recupera��o � caso a m�dia seja entre 50 (inclusive) e 69
 * (inclusive)
 * 
 * Aluno em depend�ncia � caso a nota seja menor que 50
 */