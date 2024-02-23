package transporte;

public class Linha {
	
	private String codigo; //codigo da linha conforme cadastro na ARCE
	private String nome; //nome que identifica a linha
	private double tarifa_cheia; //valor da tarifa principal da linha
	private double extensao; //a extensao da linha conforme cadastro na ARCE
	
	
	public Linha(String codigo) { //O metodo basico exige inserir ao menos o codigo da linha
		this.setCodigo(codigo);
	}

	public Linha(String codigo, String nome) { //O segundo metodo construtor informa codigo e nomenclatura
		this.setCodigo(codigo);
		this.setNome(nome);
	}

	public String getCodigo() {
		return codigo;
	}


	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public double getTarifa_cheia() {
		return tarifa_cheia;
	}


	public void setTarifa_cheia(double tarifa_cheia) {
		this.tarifa_cheia = tarifa_cheia;
	}


	public double getExtensao() {
		return extensao;
	}


	public void setExtensao(double extensao) {
		this.extensao = extensao;
	}
	
	

}
