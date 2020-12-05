package views;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class RelatorioForm extends JDialog implements ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel panel;
	private JTextArea areaDeTexto;
	private JScrollPane scroll; 
	private JButton jbSalvar;
	
	RelatorioForm(){
		setTitle("Relatório de Investimento");
		setBounds(250,149,700,450);
		panel = new JPanel();
		setContentPane(panel);
		setLayout(null);
		
		// Declaração dos componentes do relatório
		areaDeTexto = new JTextArea("TEXTO DO RELATÓRIO AQUI");
		scroll = new JScrollPane(areaDeTexto);
		scroll.setBounds(10,10,665,360);
		panel.add(scroll);
		
		jbSalvar = new JButton("Salvar");
		jbSalvar.setBounds(570,372,100,30);
		panel.add(jbSalvar);
		jbSalvar.addActionListener(this);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == jbSalvar) {
			System.out.println("Entrei pelo botão salvar");
		}
		
	}
	

}
