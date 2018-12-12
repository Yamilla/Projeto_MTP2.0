package projeto;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JPasswordField;
import java.awt.Toolkit;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Window.Type;

public class AtualizacaoDeDados extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AtualizacaoDeDados frame = null; //VERIFICAR ESSE NULL
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @return 
	 */
	public  AtualizacaoDeDados(int idpessoa) {
		setType(Type.POPUP);
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\yamil\\eclipse-workspace\\ProjetoMtp\\src\\img\\036-jedi.png"));
		setTitle("Atualiza\u00E7\u00E3o de dados ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 368, 317);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nome");
		lblNewLabel.setBounds(10, 22, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(10, 74, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JButton btnAtualizar = new JButton("Atualizar ");
		btnAtualizar.addActionListener(new ActionListener() {
			//Tratamento do botao atualizar                                  
			public void actionPerformed(ActionEvent arg0) {
				
				if(arg0.getSource()==btnAtualizar){					
					
					if(verificaNulo2()==false) {
						JOptionPane.showMessageDialog(null, "Algum campo não foi preenchido", "Aviso", JOptionPane.ERROR_MESSAGE);
					}else {
						
					// ATUALIZAÇÃO DE DADOS
					Conexao conexao = new Conexao();
					conexao.atualizar(idpessoa, textField.getText(),textField_2.getText(),textField_1.getText(),textField_3.getText(),new String(passwordField.getPassword()));			
								
					EventQueue.invokeLater(new Runnable() {
						public void run() {
							try {
								ListadeProdutos frame = new ListadeProdutos(idpessoa);
								frame.setVisible(true);
							} catch (Exception e) {
								e.printStackTrace();
							}
						}
					});
					dispose(); 
					
						}
					}
					}
		});
		btnAtualizar.setBackground(Color.LIGHT_GRAY);
		btnAtualizar.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btnAtualizar.setBounds(30, 233, 89, 23);
		contentPane.add(btnAtualizar);
		
		textField = new JTextField();
		textField.setBounds(66, 19, 254, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblCidade = new JLabel("Cidade");
		lblCidade.setBounds(10, 116, 46, 14);
		contentPane.add(lblCidade);
		
		textField_1 = new JTextField();
		textField_1.setBounds(66, 113, 173, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Endere\u00E7o");
		lblNewLabel_2.setBounds(10, 74, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		textField_2 = new JTextField();
		textField_2.setBounds(66, 68, 254, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(287, 116, 33, 20);
		contentPane.add(textField_3);
		
		JLabel lblUf = new JLabel("UF");
		lblUf.setBounds(249, 116, 26, 14);
		contentPane.add(lblUf);
		
		JLabel lblNewLabel_3 = new JLabel("Senha");
		lblNewLabel_3.setBounds(10, 173, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(66, 170, 260, 20);
		contentPane.add(passwordField);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		btnCancelar.setBounds(210, 233, 89, 23);
		contentPane.add(btnCancelar);
	}
	//VERIFICAÇÃO DE NULOS
			public boolean verificaNulo2(){
				boolean t = true;
				//verificar multiplos espaços
				if(textField.getText().trim().isEmpty()||textField_2.getText().trim().isEmpty()||textField_1.getText().trim().isEmpty()||textField_3.getText().trim().isEmpty()||new String(passwordField.getPassword()).trim().isEmpty()){
					t = false;
					}
				return t;
			}
}
