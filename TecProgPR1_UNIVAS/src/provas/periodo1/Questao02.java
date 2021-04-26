package provas.periodo1;

public class Questao02 {

	public static void main(String[] args) {
		
		int ano1 = 30, ano2 = 16, ano3 = 14;
		
		if (ano1 == ano2 || ano1 == ano3 || ano2 == ano3 || ano1 + ano2 == ano3 || ano1 + ano3 == ano2 || ano2 + ano3 == ano1) {
			
			System.out.println("É possível voltar ao presente.");
			
		} else {
			
			System.out.println("Não é possível voltar ao presente.");
		}
	}
}