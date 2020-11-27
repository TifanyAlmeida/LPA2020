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

	public class LancamentoForm extends JDialog implements ActionListener{
		private static final long serialVersionUID = 1L;
		private JPanel panel;
		private JComboBox<String> cbConta;
		private JLabel lbCabecalho, lbTotal, lbTotalDeb, lbBalanco;
		private JTextField tfdata, tfvalor, tfTotal, tfTotalDeb, tfBalanco; 
		
		private JTable table;
		private JScrollPane scroll;
		private DefaultTableModel tableModel;
		private JButton jbAdd, jbDel, jbCancelar, jbSalvar;


		LancamentoForm(){
			// Definições da Janela
			setTitle("Lancamento");
			setBounds(250,160,597,410);
			panel = new JPanel();
			setContentPane(panel);
			setLayout(null);

			// Criando o label
			lbCabecalho = new JLabel("Conta \s\s\s\s\s\s\s  Data	\s	Valor  \s");
			lbCabecalho.setBounds(10,10,580,20);
			panel.add(lbCabecalho);

			// Criando TextField
			cbConta = new JComboBox<String>();
			cbConta.setBounds(430,30,70,25);
			panel.add(cbConta);

			tfdata = new JTextField();
			tfdata.setBounds(50,30,30,25);
			panel.add(tfdata);

			tfvalor = new JTextField();
			tfvalor.setBounds(80,30,50,25);
			panel.add(tfvalor);
			
			cbConta = new JComboBox<String>();
			cbConta.setBounds(290,30,100,25);
			panel.add(cbConta);

			// Criando Tabela
			tableModel = new DefaultTableModel();
			tableModel.addColumn("Conta");
			tableModel.addColumn("Data");
			tableModel.addColumn("Valor");
			tableModel.addColumn("Total");
			tableModel.addColumn("TotalDeb");
			tableModel.addColumn("Balanco");

			table = new JTable(tableModel);
			scroll = new JScrollPane(table);
			scroll.setBounds(10,55,559,275);
			panel.add(scroll);
			
			
			// Totais rótulos e textfields
			lbTotal = new JLabel("Total");
			lbTotal.setBounds(10,330,40,20);
			panel.add(lbTotal);
			
			tfTotal = new JTextField();
			tfTotal.setBounds(50,330,40,25);
			panel.add(tfTotal);
			
			lbTotalDeb = new JLabel("Total Debito");
			lbTotalDeb.setBounds(90,330,40,20);
			panel.add(lbTotalDeb);
			
			tfTotalDeb = new JTextField();
			tfTotalDeb.setBounds(130,330,40,25);
			panel.add(tfTotalDeb);
			
			lbBalanco = new JLabel("Balanco");
			lbBalanco.setBounds(170,330,40,20);
			panel.add(lbBalanco);
			
			tfBalanco = new JTextField();
			tfBalanco.setBounds(210,330,40,25);
			panel.add(tfBalanco);

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
