package general;

import transporte.TarifaChecker;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class MainClass {
	
	
	public static void main(String[] args) {
		
		String cartao, valor, linha, novoCartao, registro;
		String relatorio = "C:\\Users\\Adm01\\Documents\\TesteInteg.txt";
		String modificado = "C:\\Users\\Adm01\\Documents\\ArquivoFinal.txt";
		
		try {
		      
		      BufferedReader reader = new BufferedReader(new FileReader(relatorio)); //objeto para ler as linhas
		      BufferedWriter destino = new BufferedWriter(new FileWriter(modificado)); //criando o buffered writer que fará toda a escrita no arquivo final
		      TarifaChecker checker = new TarifaChecker(); //objeto para checar a necessidade de modificar o cartao
		      StringBuilder registroBuilder = new StringBuilder(); //objeto auxiliar para fazer as modificacoes de cartao
		      
		      destino.write(reader.readLine()); //escreve de imediato a linha de cabeçalho
		      destino.newLine();
		      
		      
		      //loop a ser realizado para todos os registro de tarifa, ate encontrar o indicador de final de arquivo identificado pela letra C
		      while (!(registro = reader.readLine()).equals("C")) {
		    	  
		    	  /*Identificar se o registro foi uma integracao*/
		    	  if(registro.charAt(190) == '1'){
		    		  novoCartao = "-2";
		    		  
		    	  }else { //Caso nao seja integracao, verifica se é uma passagem antiga
		    		  
		    		  /*Indentificadores de linha, cartao e valor de passagem do registro atual*/
				      linha = registro.substring(1, 8); 
				      cartao = registro.substring(65, 67);
				      valor = registro.substring(71, 76);
				      
				      novoCartao = checker.Check(linha, cartao, valor); //recebe o cartao que deve ser colocado no registro  
		    	  }

			      registroBuilder.delete(0, registroBuilder.length()); //esvazia o Builder
			      registroBuilder.append(registro); //insere o registro atual
			      registroBuilder.replace(65, 67, novoCartao); //realiza a modificacao do cartao
			      
			      destino.write(registroBuilder.toString()); //escreve o registro atual no destino
			      destino.newLine();
		      
		      }
		      
		      destino.write(registro); //Escreve a linha final do arquivo no destino
		      
		      /*Fechando todos os buffers*/
		      reader.close();
		      destino.close();
		      
		    } catch (IOException e) {
		    	
		      System.out.println("An error occurred:");
		      e.printStackTrace();
		      
		    }
		
	}

}
