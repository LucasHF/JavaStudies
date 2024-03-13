package general;

import transporte.TarifaChecker;

public class MainClass {
	
	
	public static void main(String[] args) {
		
		String passagens = "B    67M  57030 171740 732320570040OPERACAO VALIDADOR"
				+ "            17000805,95000047,600000000127/02/2024 07:46:4127/02/2024 09:19:17"
				+ "0006669900066731I27/02/2024 08:06:1027/02/2024 09:16:06"
				+ "   00000000,0027/02/202427/02/20240000,00";
		
		
		
		
		//Changing the string to StringBuffer for editing purposes
		StringBuffer registro = new StringBuffer(passagens);
		
		String cartao, valor, linha, novoCartao;
		
		linha = passagens.substring(1, 8);
		cartao = passagens.substring(65, 67);
		valor = passagens.substring(71, 76);
		
		TarifaChecker checker = new TarifaChecker();
		
		novoCartao = checker.Check(linha, cartao, valor);
		
		registro.replace(65, 67, novoCartao);
		
		System.out.println("O novo cartao é: "+novoCartao);
		
		
	}

}
