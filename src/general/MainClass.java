package general;

import transporte.TarifaChecker;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class MainClass {
	
	
	public static void main(String[] args) {
		
		String cartao, valor, linha, novoCartao, registro;
		
		/*try {
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
		    }*/
		
		try {
			 File relatorio = new File("C:\\Users\\Adm01\\Documents\\ArquivoFinal.txt"); //encontra o arquivo
			 if(!relatorio.exists()) {
				 relatorio.createNewFile();
			 }
			FileWriter destino = new FileWriter(relatorio);
			BufferedWriter bfDestino = new BufferedWriter(destino);
			
			bfDestino.write("B   373M  57018 171741 732320570041OPERACAO VALIDADOR"
					+ "            24000101,90000001,900000000121/12/2021 06:15:0221/12/2021 "
					+ "08:12:100006773300067789I21/12/2021 06:47:3721/12/2021 08:05:23   "
					+ "00000000,0021/12/202121/12/20210000,00");
			
			bfDestino.close();
			destino.close();
			
		}catch (IOException e) {
		      System.out.println("An error occurred:");
		      e.printStackTrace();
		}
		
	}

}
