package Aula05;

import javax.swing.JFrame;

public class Principal {

	public static void main(String[] args) {
		
		TextFieldFrame textFieldFrame = new TextFieldFrame();
		textFieldFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		textFieldFrame.setSize(350,200); //largura e altura
		textFieldFrame.setVisible(true);
		
	}

}
