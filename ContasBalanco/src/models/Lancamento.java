package models;

public class Lancamento {
	Conta conta;
	String data;
	double valor;
	
	//gettersAndSetters
	public Conta getConta() {
		return conta;
	}
	public void setConta(Conta conta) {
		this.conta = conta;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	//CalcularBalanco
	
	//toCSV
	public String toCSV() {
		return conta + ";" + data + ";" + valor;
	}
	
	//toHTML
	public String toHTML(){
		return "<tr><td>" + conta + "</td><td>" + data + "</td><td>"+ valor +"</td></tr>";
	}
	
	//toString
	@Override
	public String toString() {
		return "Lancamento [conta=" + conta + ", data=" + data + ", valor=" + valor + "]";
	}
	
	//toVetor
	public String[] toVetor(){
		String[] vetorString = new String[3];
		//vetorString = {conta, data, valor};
		vetorString[0] = String.valueOf(conta);
		vetorString[1] = data;
		vetorString[2] = Double.toString(valor);
		
		return vetorString;
	}
	
}
