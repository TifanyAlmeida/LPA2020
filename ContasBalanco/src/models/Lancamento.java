package models;

public class Lancamento {
	private Conta conta;
	private String data;
	private double valor;
	
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
		return conta.getCodConta() + ";" + data + ";" + valor;
	}
	
	//toHTML
	public String toHTML(){
		return "<tr><td>" + conta.getCodConta() + "</td><td>" + data + "</td><td>"+ valor +"</td></tr>";
	}
	
	//toString
	@Override
	public String toString() {
		return "Lancamento [conta=" + conta.getCodConta() + ", data=" + data + ", valor=" + valor + "]";
	}
	
	//toVetor
	public String[] toVetor(){
		String[] vetorString = new String[3];
		//vetorString = {conta, data, valor};
		vetorString[0] = Integer.toString(conta.getCodConta());
		vetorString[1] = data;
		vetorString[2] = Double.toString(valor);
		
		return vetorString;
	}
	public void calcularBalanco(String tipo)
	{
		//mes 1
		double soma1 = 0,balanco1,somad1= 0;
		for(int i = 0; i<valor;i++)
		{
			soma1 = soma1+valor;
		}
		if(tipo == "debito")
		{
			somad1 = somad1+valor;
		}	
		balanco1 = soma1+somad1;
		System.out.printf("Balanco mes : %d",balanco1);
		
		//mes 2
		double soma2= 0,balanco2,somad2= 0;
	    for(int h = 0; h<valor;h++)
		{
	    	soma2 = soma2+valor;
		}
		if(tipo == "debito")
		{
			somad2 = somad2+valor;
		}	
		balanco2 = soma2+somad2;
		System.out.printf("Balanco mes : %d",balanco2);	
		
		//mes 3
		double soma3 = 0,balanco3,somad3= 0;
		for(int g = 0; g<valor;g++)
		{
		   soma3 = soma3+valor;
		}
	    if(tipo == "debito")
	    {
		   somad3 = somad3+valor;
	    }	
		balanco3 = soma3+somad3;
		System.out.printf("Balanco mes : %d",balanco3);
		
		//total
		
	}
}
