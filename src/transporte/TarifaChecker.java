package transporte;
import java.util.Arrays;

public class TarifaChecker {
	
	/*Metodo para verificar se o registro apresenta um valor antigo de meia passagem em cartao com credito*/
	private boolean MeiaChecker(String cartao, String valor) {
		
		String [] cartoes = {"23", "39"}; //contem os codigos de cartoes de meia passagem com credito
		String [] valores = {"00,95", "02,15", "02,65", 
				"03,65", "04,00", "04,80", "05,60", "07,70", 
				"01,65", "02,10", "03,00", "03,45", "04,00", 
				"04,70", "06,60", "00,50", "01,85", "02,65", 
				"03,45", "05,55"}; //contem todos os valores antigos de meia passagem

		boolean isCard = Arrays.asList(cartoes).contains(cartao); //verifica se foi informado um cartao de meia passagem com credito
		boolean isValue = Arrays.asList(valores).contains(valor); // verifica se foi informado um valor antigo de meia passagem
		
		return isCard && isValue;
	}
	
	/*Metodo para verificar se o registro apresenta um valor antigo de passagem inteira em cartao com credito*/
	private boolean InteiraChecker(String cartao, String valor) {
		
		String [] cartoes = {"17", "18", "19", "24", "34", "37", "38", "52"}; //contem os codigos de cartoes de passagem inteira com credito
		String [] valores = {"01,90", "04,30", "05,30", 
				"06,30", "07,30", "08,00", "09,60", "11,15", 
				"15,35", "01,60", "03,70", "04,70", "05,70", 
				"06,70", "07,40", "10,55", "14,75", "01,00", 
				"03,20", "06,85", "11,05", "00,50"}; //contem todos os valores antigos de passagem inteira
		
		boolean isCard = Arrays.asList(cartoes).contains(cartao); //verifica se foi informado um cartao de passagem inteira com credito
		boolean isValue = Arrays.asList(valores).contains(valor); // verifica se foi informado um valor antigo de passagem inteira
		
		return isCard && isValue;
	}
	
	private boolean LinhaChecker(String linha) {
		String [] linhas= {"    43M", "    44M", "    67M", "   570M", "   122M", " 10211M", " 10325M", " 20211M", " 20325M", " 10199M", " 30199M", "   896M"};
		
		boolean isLine = Arrays.asList(linhas).contains(linha); //verifica se o registro se refere a alguma linha metropolitana com muitos seccionamentos
		
		return isLine;
	}
	
	public String Check(String linha, String cartao, String valor) {
		
		if(LinhaChecker(linha)) {
			if(InteiraChecker(cartao, valor)) {
				return "54";
			}else if(MeiaChecker(cartao, valor)) {
				return "55";
			}else {
				return cartao;
			}
		}else {
			return cartao;
		}
		
		
		
	}

}
