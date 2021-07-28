package CadAlunos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import model.Aluno;

public class CadAlunos extends JInternalFrame {	
	//Atributos
	private JLabel lblMatricula;
	private JLabel lblCodigo;
	private JLabel lblNome;
	private JLabel lblEmail;
	private JLabel lblIdade;
	
	private JTextField txtMatricula;
	private JTextField txtCodigo;
	private JTextField txtNome;
	private JTextField txtEmail;	
	private JSpinner txtIdade;
	
	private JButton btnNovoRegistro;
	private JButton btnGravarRegistro;
	private JButton btnProximo;
	private JButton btnAnterior;
	
	Aluno alunos[] = new Aluno[5];
	int qteAlunos = -1; //controle de inserções.	
		
	//Construtor
	public CadAlunos() {
		setClosable(true);
		setMaximizable(true);
        setResizable(true);
        setTitle("Cadastro de alunos");
        
        //instanciar atributos:
        lblMatricula = new JLabel();
        lblCodigo    = new JLabel();
        lblNome      = new JLabel();
        lblEmail     = new JLabel();
        lblIdade     = new JLabel();
        
        txtMatricula = new JTextField();
        txtCodigo    = new JTextField();
        txtNome      = new JTextField();
        txtEmail     = new JTextField();
        txtIdade     = new JSpinner();
        
        btnNovoRegistro   = new JButton();
        btnGravarRegistro = new JButton();
        btnProximo        = new JButton();
        btnAnterior       = new JButton();
        
        lblMatricula.setText("Matrícula:");
        lblCodigo.setText("Código:");
        lblNome.setText("Nome:");
        lblEmail.setText("E-mail:");
        lblIdade.setText("Idade:");
        
        btnNovoRegistro.setText("Adulto?");
        btnGravarRegistro.setText("Gravar registro");
        btnProximo.setText("Próximo");
        btnAnterior.setText("Anterior");
        
        txtCodigo.setEnabled(false);
        
        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            //.addGap(0, 394, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
            	.addContainerGap()
            	.addGroup(
            		layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            		.addGroup(layout.createSequentialGroup()
            			.addGap(0, 0, Short.MAX_VALUE)
            			.addComponent(btnNovoRegistro)
            			.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
            			.addComponent(btnGravarRegistro)
            			.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
            			.addComponent(btnProximo)
            		)
            		.addGroup(layout.createSequentialGroup()
            			.addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
            				.addGroup(layout.createSequentialGroup()
            					.addComponent(lblNome)
            					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            					.addComponent(txtNome,GroupLayout.PREFERRED_SIZE, 157, GroupLayout.PREFERRED_SIZE)
            				)
            				.addGroup(GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
            					.addComponent(lblMatricula)
            					.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
            					.addComponent(txtMatricula,GroupLayout.PREFERRED_SIZE, 157, GroupLayout.PREFERRED_SIZE)
            				)
            				.addGroup(layout.createSequentialGroup()
            					.addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            						.addComponent(lblEmail)
            						.addComponent(lblIdade)
            					)
            					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            					.addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            						.addComponent(txtIdade, GroupLayout.PREFERRED_SIZE,  48, GroupLayout.DEFAULT_SIZE)
            						.addComponent(txtEmail, GroupLayout.PREFERRED_SIZE, 157, GroupLayout.DEFAULT_SIZE)
            					)
            				)
            			)
            			.addGap(0, 0, Short.MAX_VALUE)
            		)
            	)
            	.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
            	.addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            		.addGroup(layout.createSequentialGroup()
            			.addComponent(lblCodigo)
            			.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
            			.addComponent(txtCodigo, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
            		)
            		.addComponent(btnAnterior)
            	)
            	.addContainerGap()
            )
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            //.addGap(0, 274, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblMatricula)
                        .addComponent(txtMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblCodigo))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblNome)
                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblEmail)
                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblIdade)
                        .addComponent(txtIdade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnNovoRegistro)
                        .addComponent(btnGravarRegistro)
                        .addComponent(btnProximo)
                        .addComponent(btnAnterior))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        
        //ações de botões:
        btnGravarRegistro.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//validar a tela				
				if(validarTela() == true) {
					//verificar posição do vetor
					if(qteAlunos <= 3) {
						qteAlunos++; //incrementa em +1						
						//gravar
						Aluno aluno = new Aluno(txtNome.getText(), txtEmail.getText(), (Integer)txtIdade.getValue(), txtMatricula.getText());
						alunos[qteAlunos] = aluno; //BD
						JOptionPane.showMessageDialog(null, "Dados gravados com sucesso!");
						//limpar a tela
						limparTela();
					}else {
						JOptionPane.showMessageDialog(null, "Não existe mais espaço para novos alunos!");
					}
				}
				
			}
		});
        
        btnProximo.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				try {
					int proximo = 0;
					//verificar se a qte de alunos é >= 0	
					if(qteAlunos >= 0) {
						//limparTela();
						if(txtCodigo.getText().length() == 0) {
							txtCodigo.setText("0");
						}else {
							proximo = Integer.parseInt(txtCodigo.getText()) + 1;
							if(proximo <= qteAlunos) {
								txtCodigo.setText(String.valueOf(proximo));
							}
						}
						//pesquisar no vetor:
						if(Integer.parseInt(txtCodigo.getText()) <= qteAlunos) {
							int codigo = Integer.parseInt(txtCodigo.getText());
							Aluno aluno = alunos[codigo]; //busco do BD
							txtMatricula.setText(aluno.getMatricula());
							txtNome.setText(aluno.getNome());
							txtEmail.setText(aluno.getEmail());
							txtIdade.setValue(aluno.getIdade());
						}
					}
				}catch (Exception ex) {
					txtCodigo.setText("");
					limparTela();
					JOptionPane.showMessageDialog(null, "Atenção!\nOcorreu um erro ao buscar"
							                      + " dados de alunos(prx): " + ex.getMessage());
				}
			}
		});
        
        btnAnterior.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//tratamento de exceção
				try {
					//Criar rotina de anterior
					int anterior = 0;
					if(qteAlunos >= 0) {
						if(txtCodigo.getText().length() == 0) {
							txtCodigo.setText("0");
						}else {
							anterior = Integer.parseInt(txtCodigo.getText()) - 1;
							if(anterior >= 0) {
								txtCodigo.setText(String.valueOf(anterior));
							}else {
								txtCodigo.setText("0");
							}
							if(Integer.parseInt(txtCodigo.getText()) <= qteAlunos) {
								Aluno aluno = alunos[Integer.parseInt(txtCodigo.getText())];
								txtMatricula.setText(aluno.getMatricula());
								txtNome.setText(aluno.getNome());
								txtEmail.setText(aluno.getEmail());
								txtIdade.setValue(aluno.getIdade());
							}							
														
						}
					}
				}catch (Exception ex) {
					txtCodigo.setText("");
					limparTela();
					JOptionPane.showMessageDialog(null, "Atenção!\nOcorreu um erro ao buscar"
							                      + " dados de alunos(ant): " + ex.getMessage());
				}
			}
		});
        
        btnNovoRegistro.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					if(txtCodigo.getText().length() > 0) {
						Aluno aluno = alunos[Integer.parseInt(txtCodigo.getText())];
						if(aluno.alunoDeMaior())
							JOptionPane.showMessageDialog(null, "O aluno " + aluno.getNome() + " já é adulto!");
						else
							JOptionPane.showMessageDialog(null, "O aluno " + aluno.getNome() + " não é adulto!");
					}
				}catch (Exception ex) {
					JOptionPane.showMessageDialog(null, "Erro ao verificar se "
							                          + "aluno é de maior: " + ex.getMessage());
				}				
			}
		});
        
        pack();
	}
	
	/**
	 * Esta rotina server para validar se os campos em tela estão preenchidos
	 * @return True ou False
	 */
	private boolean validarTela() {
		boolean resposta = true;
		//validar a tela.
		if(txtMatricula.getText().length() == 0) {
			JOptionPane.showMessageDialog(null, "Campo matrícula em branco. Verifique!");
			resposta = false;
		}		
		if(txtNome.getText().length() == 0 && resposta == true) {
			JOptionPane.showMessageDialog(null, "Campo nome em branco. Verifique!");
			resposta = false;
		}		
		if(txtEmail.getText().length() == 0 && resposta == true) {
			JOptionPane.showMessageDialog(null, "Campo e-mail em branco. Verifique!");
			resposta = false;
		}		
		if((Integer)txtIdade.getValue() <= 0 && resposta == true) {
			JOptionPane.showMessageDialog(null, "Campo idade inválido. Verifique!");
			resposta = false;
		}
		return resposta;
	}
	
	/**
	 * Rotina para limpar a tela, zerando os campos digitados
	 */
	private void limparTela() {
		txtMatricula.setText("");
		txtNome.setText("");
		txtEmail.setText("");
		txtIdade.setValue(0);
		txtMatricula.requestFocus();
	}
	
}
