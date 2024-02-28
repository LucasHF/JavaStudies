package general;

import java.util.Scanner;
import transporte.Linha;

public class MainClass {
	
	public void Sum() { //Method to test basic sum
		int a, b, c;
		
		a = 10;
		b = 11;
		
		Scanner entries = new Scanner(System.in);
		
		System.out.println("Enter the first number: ");
		a = entries.nextInt();
		
		System.out.println("Enter the second number: ");
		b = entries.nextInt();
		
		c = a+b;
		
		System.out.println("The sum of the numbers is: "+c);
		
		System.out.println("Enter a new number to sum: ");
		c += entries.nextInt();
		
		System.out.println("The final numbers is: "+c);
		
		
		entries.close();
		
	}

	public void Bigger() { //Method to check bigger between two number
		int a, b, c;
		
		a = 10;
		b = 11;
		
		Scanner entries = new Scanner(System.in);
		
		System.out.println("Enter the first number: ");
		a = entries.nextInt();
		
		System.out.println("Enter the second number: ");
		b = entries.nextInt();
		
		c = a+b;
		
		if(a>b) {
			System.out.println("The first number is the bigger!\n");			
		}else if (b>a) {
			System.out.println("The second number is the bigger!\n");
		}else {
			System.out.println("Equal numbers inserted! \n");
		}
		
		System.out.println("The final numbers is: "+c);
		
		entries.close();
		
	}
	
	public void GuessNumber() {// Method to test while loop with a "guess the number" game
		int a=0;

		Scanner entries = new Scanner(System.in);
		
		System.out.println("Choose a number from 1 to 10");
		a = entries.nextInt();
		
		while( a!=3) { //There will be a loop until the user insert the number 3
			System.out.println("\n Wrong number!! Try another one!");
			a = entries.nextInt();
		}
		
		System.out.println("Great!! The right number is 3. You did it!");
		
		entries.close();
		
	}
	
	public void TestarLinhas() { //Method to test objects from class transporte.linha
		
		Linha MpeFor = new Linha("67M"); //utilizando o construtor simples somente com o codigo
		Linha MpeMar = new Linha("373M", "Maranguape/Maracanau"); //utilizando o construtor secundario, incluindo o nome da linha
		
		System.out.printf("A primeira linha: %s - %s%n", MpeFor.getCodigo(), MpeFor.getNome());
		System.out.printf("A segunda linha: %s - %s%n", MpeMar.getCodigo(), MpeMar.getNome());
		
		MpeFor.setNome("Maranguape/Fortaleza");
		MpeFor.setExtensao(27.4);
		MpeFor.setTarifa_cheia(9.0);
		
		MpeMar.setExtensao(26.4);
		MpeMar.setTarifa_cheia(2.15);
		
		System.out.printf("%nA primeira linha: %s - %s - %.1f KM - com tarifa principal de %.2f %n", MpeFor.getCodigo(), MpeFor.getNome(), MpeFor.getExtensao(), MpeFor.getTarifa_cheia());
		System.out.printf("A segunda linha: %s - %s - %.1f KM - com tarifa principal de %.2f %n", MpeMar.getCodigo(), MpeMar.getNome(), MpeMar.getExtensao(), MpeMar.getTarifa_cheia());
		
		
	}
	
	public static void main(String[] args) {
		
		String passagens = "B    67M  57030 171740 732320570040OPERACAO VALIDADOR"
				+ "            17000805,95000047,600000000127/02/2024 07:46:4127/02/2024 09:19:17"
				+ "0006669900066731I27/02/2024 08:06:1027/02/2024 09:16:06"
				+ "   00000000,0027/02/202427/02/20240000,00";
		
		String cartao, valor;
		
		cartao = passagens.substring(65, 67);
		valor = passagens.substring(71, 76);
		
		System.out.println("O cartao é: "+cartao);
		System.out.println("O valor passagem é: R$"+valor);
	}

}
