package general;

import transporte.TarifaChecker;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class MainClass {
	
	
	public static void main(String[] args) {
		
		String cartao, valor, linha, novoCartao, registro;
		
		try {
		      File relatorio = new File("C:\\Users\\Adm01\\Documents\\Teste passagens antigas.txt"); //encontra o arquivo
		      Scanner reader = new Scanner(relatorio); //objeto para ler as linhas
		      TarifaChecker checker = new TarifaChecker(); //objeto para checar a necessidade de modificar o cartao
		      
		      while (reader.hasNextLine()) {
		    	  
		      registro = reader.nextLine(); //obtem a próxima linha contendo um registro
		      
		      linha = registro.substring(1, 8);
		      cartao = registro.substring(65, 67);
		      valor = registro.substring(71, 76);
		      
		      novoCartao = checker.Check(linha, cartao, valor);
		      
		      StringBuffer registroBuffer = new StringBuffer(registro);
		      registroBuffer.replace(65, 67, novoCartao);
		      
		      }
		      
		      reader.close();
		    } catch (FileNotFoundException e) {
		      System.out.println("An error occurred:");
		      e.printStackTrace();
		    }
		
	}

}
