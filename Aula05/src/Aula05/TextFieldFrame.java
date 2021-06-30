package Aula05;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class TextFieldFrame extends JFrame {
	
	//argumentos
	private JTextField     txtField1;
	private JTextField     txtField2;
	private JTextField     txtField3;
	private JPasswordField txtPassword;
	private JButton        btnEntrar;
	private JButton        btnOk;
	private JButton        btnSair;
	
	//construtor
	public TextFieldFrame() {
		super("Teste de formulário");   //Título do frame
		setLayout(new FlowLayout());    //setando o layout do frame
		//Adicionando componentes ao Frame -------------------------------------
		txtField1 = new JTextField(10); //Criando o objeto txtField1
		add(txtField1);                 //Colocando o txtField1 no frame
		
		txtField2 = new JTextField("Entre com seu texto aqui!");
		add(txtField2); //Colocando o txtField2 no frame
		
		txtField3 = new JTextField("Campo desabilitado",21);
		txtField3.setEnabled(false);
		add(txtField3);
		
		txtPassword = new JPasswordField("Minha senha");
		add(txtPassword);
		
		btnEntrar = new JButton("Entrar");
		add(btnEntrar);
		
		btnOk = new JButton("Ok?");
		add(btnOk);
		
		btnSair = new JButton("Sair");
		add(btnSair);
		
		//Adicionando Eventos aos componentes -------------------------------------
		btnEntrar.addActionListener(
				new ActionListener() {					
					@Override
					public void actionPerformed(ActionEvent arg0) {
						JOptionPane.showMessageDialog(null, "Mensagem do botão");
					}
				});
		
		txtField1.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				String texto = String.format("txtField1: %s", txtField1.getText());
				JOptionPane.showMessageDialog(null, "O texto do txtField1 é: " + texto);
			}
		});
		
		txtPassword.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				String texto = String.format("%s", txtPassword.getText());
				JOptionPane.showMessageDialog(null, "Sua senha é: " + texto);				
			}
		});
		
		btnOk.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(
					JOptionPane.showConfirmDialog(
							null, 
							"Não está OK?",
							"Título da msm",
							JOptionPane.YES_NO_OPTION,
							JOptionPane.QUESTION_MESSAGE
							) == 0
						) {
					//YES
					JOptionPane.showMessageDialog(null, "Não está ok :'(");
				}else {
					//NO
					JOptionPane.showMessageDialog(null, "Está ok!!!");
				}
			}
		});
		
		btnSair.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		
	}
	
}
