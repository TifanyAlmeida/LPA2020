package models.dao;


import  java.io.BufferedReader ;
import  java.io.BufferedWriter ;
import  java.io.FileNotFoundException ;
import  java.io.FileReader ;
import  java.io.FileWriter ;
import  java.io.IOException ;
import  java.util.ArrayList ;

importar  modelos.Pagamento ;

public  class  PagamentoDAO {

	BufferedWriter bw;
	BufferedReader br;
	String arquivo =  " . \\ bd \\ pagamentos.csv " ;

	public  boolean  salvar ( ArrayList < Pagamento >  pagamentos ) {

		retorno booleano =  falso ;
		tente {
			bw =  new  BufferedWriter ( new  FileWriter (arquivo, false ));

			para ( Pagamento pagamento : pagamentos) {
				bw . escrever (pagamento . toCSV ());
			}

			bw . fechar();
			retorno =  verdadeiro ;
		} catch ( IOException e) {
			Sistema . para fora . println ( " Erro ao salvar: " + e);
		}

		return retorno;
	}

	public  ArrayList < Pagamento >  retornar () {
		ArrayList < Pagamento > pagamentos =  novo  ArrayList < Pagamento > ();
		String [] campos;
		Pagamento pagamento;

		tente {
			br =  novo  BufferedReader ( novo  FileReader (arquivo));
			String linha;

				linha = br . Leia a linha();

			while (linha ! = null ) {
				campos = linha . dividir ( " ; " );
				pagamento =  nova  Pagamento ();
				pagamento . setId ( Integer . parseInt (campos [ 0 ]));
				pagamento . setCodConta (campos [ 1 ]);
				pagamento . setTipo (campos [ 2 ]);
				pagamento . setCategoria ( Double . parseDouble (campos [ 3 ]));
				pagamento . setDescricao ( Double . parseDouble (campos [ 4 ]));
				pagamentos . adicionar (pagamento);
				linha = br . Leia a linha();
			}
			br . fechar();
		} catch ( FileNotFoundException e) {
			Sistema . para fora . println ( " Erro ao retornar, arquivo não encontrado: " + e);
		} catch ( IOException e) {
			Sistema . para fora . println ( " Erro ao retornar, erro na leitura da linha: " + e);
		} 

		retornar pagamentos;
	

	}

}

	public static void main(String[]args){
		
		ArrayList<Pagamento> pagamentos = new ArrayList<Pagamento>();
		pagamento carteiraAdrieli = new Pagamento();
		pagamentoAdrieli.setId(1);
		pagamentoAdrieli.setCodConta(1);
		pagamentoAdrieli.setTipo("Débito");
		pagamentoAdrieli.setCategoria("Despesa");
		pagamentoAdrieli.setDescricao("Pagamento de Aluguel");
		
		ArrayList<Pagamento> pagamentos = new ArrayList<Pagamento>();
		pagamento carteiraTifany = new Pagamento();
		pagamentoTifany.setId(1);
		pagamentoTifany.setCodConta(8);
		pagamentoTifany.setTipo("Débito");
		pagamentoTifany.setCategoria("Investimento");
		pagamentoTifany.setDescricao("Aporte de investimentos em Ações");
		
		ArrayList<Pagamento> pagamentos = new ArrayList<pagamento>();
		pagamento carteiraKetyele = new Pagamento();
		pagamentoKetyele.setId(1);
		pagamentoKetyele.setCodConta(13);
		pagamentoKetyele.setTipo("Crédito");
		pagamentoKetyele.setCategoria("Receita");
		pagamentoKetyele.setDescricao("Venda direta à vista");
		
		pagamentos.add(pagamentoAdrieli);
		pagamentos.add(pagamentoTifany);
		pagamentos.add(pagamentoKetyele);
		
		PagamentoDAO pagamentoDAO = new PagamentoDAO();
		
		if(!pagamentoDAO.salvar(pagamentos))
			System.out.println("Erro ao salvar");
		
		pagamentos2 = pagamentoDAO.retornar();
		
		for(Pagamento pagamento: pagamentos2){
			System.out.println(carteira.getNome());
		}
		
		System.out.println("Final do arquivo");
		
	}


