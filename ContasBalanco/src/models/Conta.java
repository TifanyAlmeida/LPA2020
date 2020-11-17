package models;

public class Conta {
	private int codConta;
	private String tipo, categoria, descricao;
	
	//gettersAndSetters
	public int getCodConta() {
		return codConta;
	}
	public void setCodConta(int codConta) {
		this.codConta = codConta;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	//toCSv
	public String toCSV() {
	return codConta + ";" + tipo + ";" + categoria + ";" + descricao;
	}
		
	//toHTML
		public String toHTML() {
			return  "<tr><td>"+ codConta + "</td><td>" + tipo + "</td><td>" + categoria + "</td><td>" + descricao +"</td></tr>";
		}
		
	//toString
	@Override
	public String toString() {
		return "Conta [codConta=" + codConta + ", tipo=" + tipo + ", categoria=" + categoria + ", descricao="
				+ descricao + "]";
	}
	
	//toVetor
	public String[] toVetor()
	{
		String [] vetorString = new String[4];
		//vetorString = {codConta,tipo,categoria,descricao};
		vetorString[0]= Integer.toString(codConta);
		vetorString[1]= tipo;
		vetorString[2]= categoria;
		vetorString[3]= descricao;
		return vetorString;
	}
}
