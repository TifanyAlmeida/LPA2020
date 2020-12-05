package views;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class RegistroForm extends JDialog implements ActionListener{
	private static final long serialVersionUID = 1L;
	private JPanel panel;
	private JLabel lbCabecalho;
	private JTextField tfCod, tfTipo, tfCategoria, tfDescricao;
	private JComboBox<String> cbPagamento;
	private JTable table;
	private JScrollPane scroll;
	private DefaultTableModel tableModel;
	private JButton jbAdd, jbDel, jbCancelar, jbSalvar;


	RegistroForm(){
		// Definições da Janela
		setTitle("Cadastro de Investimento");
		setBounds(250,160,597,410);
		panel = new JPanel();
		setContentPane(panel);
		setLayout(null);

		// Criando o label
		lbCabecalho = new JLabel("Cod \s\s\s\s\s\s\s\s\s\s\s\s\s\s\s\s\s  Tipo	\s\s\s\s\s\s\s\s\s\s	Categoria	\s\s\s\s\s\s\s\s\s\s\s\s\s\s\s\s\s\s\s\s\s\s\s\s\s\s\s\s\s Descricao \s\s\s\s\s\s\s\s\s");
		lbCabecalho.setBounds(10,10,580,20);
		panel.add(lbCabecalho);

		// Criando TextField
		tfCod = new JTextField();
		tfCod.setBounds(10,30,40,25);
		tfCod.setEnabled(false);
		panel.add(tfCod);

		tfTipo = new JTextField();
		tfTipo.setBounds(130,30,80,25);
		panel.add(tfTipo);


		tfCategoria = new JTextField();
		tfCategoria.setBounds(130,30,80,25);
		panel.add(tfCategoria);

		
		cbPagamento = new JComboBox<String>();
		cbPagamento.setBounds(290,30,100,25);
		panel.add(cbPagamento);
		
		
		tfDescricao = new JTextField();
		tfDescricao.setBounds(470,30,40,25);
		panel.add(tfDescricao);

		// Criando Tabela
		tableModel = new DefaultTableModel();
		tableModel.addColumn("Cod");
		tableModel.addColumn("DT Compra");
		tableModel.addColumn("DT Tipo");
		tableModel.addColumn("Descricao");


		table = new JTable(tableModel);
		scroll = new JScrollPane(table);
		scroll.setBounds(10,55,559,275);
		panel.add(scroll);
		
		
	
		
	

		// Criar os botões
		jbAdd = new JButton("Add");
		jbAdd.setBounds(500,30,68,25);
		jbAdd.addActionListener(this);
		panel.add(jbAdd);


		jbDel = new JButton("Del");
		jbDel.setBounds(278,330,59,30);
		jbDel.addActionListener(this);
		panel.add(jbDel);

		jbCancelar = new JButton("Cancelar");
		jbCancelar.setBounds(328,330,120,30);
		jbCancelar.addActionListener(this);
		panel.add(jbCancelar);

		jbSalvar = new JButton("Salvar");
		jbSalvar.setBounds(448,330,120,30);
		jbSalvar.addActionListener(this);
		panel.add(jbSalvar);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == jbAdd) {
			System.out.println("Add");
		} else if (e.getSource() == jbDel) {
			System.out.println("Del");
		} else if (e.getSource() == jbCancelar) {
			System.out.println("Cancelar");
		} else if (e.getSource() == jbSalvar) {
			System.out.println("Salvar");
		}
	}

	public JTextField getTfCodConta() {
		return tfCod;
	}

	public void setTfCodConta(JTextField tfCodConta) {
		this.tfCod = tfCodConta;
	}
}
