package views;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class ContaForm extends JDialog implements ActionListener{

	private static final long serialVersionUID = 1L;
	private JPanel panel;
	private JLabel lbCabecalho;
	private JTextField tfCodConta, tfTipo, tfPerfilCategoria, tfDescricao;
	private JTable table;
	private JScrollPane scroll;
	private DefaultTableModel tableModel;
	private JButton jbAdd, jbDel, jbCancelar, jbSalvar;


	ContaForm(){
		// Definições da Janela
		setTitle("Contas");
		setBounds(250,160,597,410);
		panel = new JPanel();
		setContentPane(panel);
		setLayout(null);

		// Criando o label
		lbCabecalho = new JLabel("CodConta \s\s\s\s\s\s\s  Tipo	\s\s\s\s\s\s\s\s\s\s\s\s\s\s\s\s\s\s\s\s\s\s\s\s\s\s\s\s\s\s\s\s\s\s\s\s	Categoria	\s\s\s\s\s\s\s Descricao \s\s\s\s\s\s\s ");
		lbCabecalho.setBounds(10,10,580,20);
		panel.add(lbCabecalho);

		// Criando TextField
		tfCodConta = new JTextField();
		tfCodConta.setEnabled(false);
		tfCodConta.setBounds(10,30,40,25);
		panel.add(tfCodConta);

		tfTipo = new JTextField();
		tfTipo.setBounds(50,30,150,25);
		panel.add(tfTipo);

		tfPerfilCategoria = new JTextField();
		tfPerfilCategoria.setBounds(200,30,150,25);
		panel.add(tfPerfilCategoria);

		tfDescricao = new JTextField();
		tfDescricao.setBounds(350,30,80,25);
		panel.add(tfDescricao);


		// Criando Tabela
		tableModel = new DefaultTableModel();
		tableModel.addColumn("CodConta");
		codConta.setBounds(116,335,60,20);
		tableModel.addColumn("Tipo");
		tableModel.addColumn("Categoria");
		tableModel.addColumn("Descrição");
		

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

}