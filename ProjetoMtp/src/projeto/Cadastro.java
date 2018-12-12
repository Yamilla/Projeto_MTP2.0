package projeto;

import java.awt.BorderLayout;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Window.Type;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import java.awt.Toolkit;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Component;
import javax.swing.JFormattedTextField;
import javax.swing.JPasswordField;
import java.awt.Dialog.ModalExclusionType;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.SystemColor;
import javax.swing.border.MatteBorder;
import javax.swing.ImageIcon;

public class Cadastro extends JFrame {
	
	private JPanel contentPane;
	private JTextField textField_1;
	private JTextField textField_2;
	protected JTextField textField_3;
	private JPasswordField passwordField;
	private JTextField textField;
	private JTextField textField_4;

	//TELA DE CADASTRO
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cadastro frame = new Cadastro();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}	
	public Cadastro() {
		setResizable(false);
		setType(Type.POPUP);
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\yamil\\Desktop\\Imagens Projeto MTP\\055-batman.png"));
		
		
		setFont(new Font("Times New Roman", Font.BOLD, 14));
		setTitle("Cadastro");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 351);
		
		
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setToolTipText("");
		contentPane.setForeground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNome.setBounds(10, 28, 46, 14);
		contentPane.add(lblNome);
		
		JLabel lblEmail = new JLabel("E-mail");
		lblEmail.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblEmail.setBounds(10, 73, 46, 14);
		contentPane.add(lblEmail);
		
		JLabel lblNewLabel = new JLabel("Cidade");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel.setBounds(10, 217, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblSenha.setBounds(10, 124, 46, 14);
		contentPane.add(lblSenha);
		

		
		
		//TRATAMENTO DO BOTÃO CADASTRAR
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				//VERIFICAÇÃO DE NULOS
				if(arg0.getSource()==btnCadastrar){
				
				if(verificaNulo()==false) {
					JOptionPane.showMessageDialog(null, "Por favor! Preencha os campos para efetuar o cadastro", "Aviso", JOptionPane.ERROR_MESSAGE);
				}else {
					
				// CADASTRO DE NULO
				Conexao conexao = new Conexao();
				conexao.inserir(textField_1.getText(),textField_2.getText(),new String(passwordField.getPassword()), textField_4.getText(),textField_3.getText(),textField.getText());			
							
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							Inicio frame = new Inicio();
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
		btnCadastrar.setForeground(Color.BLACK);
		btnCadastrar.setFont(new Font("Times New Roman", Font.BOLD, 12));
		
		btnCadastrar.setBounds(90, 268, 89, 23);
		contentPane.add(btnCadastrar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {				
				dispose();
				new Inicio().setVisible(true);
			}
		});
		btnCancelar.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnCancelar.setBounds(272, 268, 89, 23);
		contentPane.add(btnCancelar);
		
		setTextField_1(new JTextField());
		getTextField_1().setBounds(74, 25, 350, 20);
		contentPane.add(getTextField_1());
		getTextField_1().setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		textField_2.setBounds(74, 70, 350, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		textField_3.setBounds(74, 214, 260, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		passwordField.setBounds(74, 121, 350, 20);
		contentPane.add(passwordField);
		
		JLabel lblEstado = new JLabel("UF");
		lblEstado.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblEstado.setBounds(344, 217, 24, 14);
		contentPane.add(lblEstado);
		
		textField = new JTextField();
		textField.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		textField.setBounds(378, 214, 46, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Endere\u00E7o");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_1.setBounds(10, 172, 54, 20);
		contentPane.add(lblNewLabel_1);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		textField_4.setBounds(74, 172, 350, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		contentPane.setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{lblNome, lblEmail, lblNewLabel, lblSenha, btnCadastrar, btnCancelar, textField_1, textField_2, textField_3}));
		
		}
	
	//VERIFICAÇÃO DE NULOS
	public boolean verificaNulo(){
		boolean t = true;
		//verificar multiplos espaços
		if(textField.getText().trim().isEmpty()||textField_1.getText().trim().isEmpty()||textField_2.getText().trim().isEmpty()||textField_3.getText().trim().isEmpty()||textField_4.getText().trim().isEmpty()||new String(passwordField.getPassword()).trim().isEmpty()){
			t = false;
			}
		return t;
	}
	
	public void Cadastro1() {
			
		}

	public JTextField getTextField_1() {
		return textField_1;
	}

	public void setTextField_1(JTextField textField_1) {
		this.textField_1 = textField_1;
		textField_1.setFont(new Font("Times New Roman", Font.PLAIN, 12));
	}
	}

