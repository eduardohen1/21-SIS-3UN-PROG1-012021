package Aula05;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class TextFieldFrame extends JFrame {
	
	//argumentos
	private JTextField     txtField1;
	private JTextField     txtField2;
	private JTextField     txtField3;
	private JPasswordField txtPassword;
	
	//construtor
	public TextFieldFrame() {
		super("Teste de formulário"); //Título do frame
		setLayout(new FlowLayout());  //setando o layout do frame
		txtField1 = new JTextField(10); //Criando o objeto txtField1
		add(txtField1);               //Colocando o txtField1 no frame
	}
	
}
