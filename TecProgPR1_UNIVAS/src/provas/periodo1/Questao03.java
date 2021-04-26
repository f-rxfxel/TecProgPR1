package provas.periodo1;

public class Questao03 {

	public static void main(String[] args) {

		int dSemana = 2;
		
		switch (dSemana) {
		
		case 1:
			System.out.println("O funcionário deverá trabalhar 0 horas!");
			break;
			
		case 2:
			System.out.println("O funcionário deverá trabalhar 7 horas!");
			break;
			
		case 3:
			System.out.println("O funcionário deverá trabalhar 7 horas!");
			break;
			
		case 4:
			System.out.println("O funcionário deverá trabalhar 6 horas!");
			break;
			
		case 5:
			System.out.println("O funcionário deverá trabalhar 5 horas!");
			break;
			
		case 6:
			System.out.println("O funcionário deverá trabalhar 4 horas!");
			break;
			
		default:
			System.out.println("O funcionário deverá trabalhar 4 horas!");
			break;
		}
	}
}

/*
* Dia da Semana: 			1 2 3 4 5 6 7
* Quantidade de Horas: 		0 7 7 6 5 4 4
*/