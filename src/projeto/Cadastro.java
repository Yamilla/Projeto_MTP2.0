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

public class Cadastro extends JFrame {
	
	Conexao conexao;

	private JPanel contentPane;
	protected JTextField textField_1;
	protected JTextField textField_2;
	protected JTextField textField_3;
	private JPasswordField passwordField;
	private JTextField textField;

	
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
		
		//Conexao con;
			
	public Cadastro() { //AO INVÉS DE PASSAR POR PARAMETRO FAZER UMA CLASSE CONTROLE
		
		
		setFont(new Font("Times New Roman", Font.BOLD, 14));
		setTitle("Cadastro");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 342);
		
		// conexão com o BD
		//con = new Conexao();
		
		
		contentPane = new JPanel();
		contentPane.setToolTipText("");
		contentPane.setForeground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(8, 8, 8, 8));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblNome.setBounds(10, 11, 46, 14);
		contentPane.add(lblNome);
		
		JLabel lblEmail = new JLabel("E-mail");
		lblEmail.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblEmail.setBounds(10, 55, 46, 14);
		contentPane.add(lblEmail);
		
		JLabel lblNewLabel = new JLabel("Cidade");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblNewLabel.setBounds(10, 104, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblSenha.setBounds(10, 154, 46, 14);
		contentPane.add(lblSenha);
		
		
		//TRATAMENTO DO BOTÃO CADASTRAR
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			
			 Conexao conexao;

			public void actionPerformed(ActionEvent arg0) {
				
				if(arg0.getSource()==btnCadastrar) {
				
				PreparedStatement st;
				Conexao conexao = new Conexao();
				conexao.inserir(textField_1.getText(),textField_2.getText(),textField_3.getText(),textField.getText(),passwordField.getText());
				
				
				
				
				
				
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
		});
		
		
		//Outra coisa
		btnCadastrar.setForeground(Color.BLACK);
		btnCadastrar.setFont(new Font("Times New Roman", Font.BOLD, 12));
		
			
			
		btnCadastrar.setBounds(107, 246, 89, 23);
		contentPane.add(btnCadastrar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//abrir a tela de inicio colocar if
				dispose();
				new Inicio();
			}
		});
		btnCancelar.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnCancelar.setBounds(272, 246, 89, 23);
		contentPane.add(btnCancelar);
		
		setTextField_1(new JTextField());
		getTextField_1().setBounds(58, 8, 366, 20);
		contentPane.add(getTextField_1());
		getTextField_1().setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(58, 52, 366, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(58, 101, 191, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(58, 151, 366, 20);
		contentPane.add(passwordField);
		
		JLabel lblEstado = new JLabel("UF");
		lblEstado.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblEstado.setBounds(272, 104, 24, 14);
		contentPane.add(lblEstado);
		
		textField = new JTextField();
		textField.setBounds(301, 101, 123, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		contentPane.setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{lblNome, lblEmail, lblNewLabel, lblSenha, btnCadastrar, btnCancelar, textField_1, textField_2, textField_3}));
		
		}
	
	public void Cadastro1() {
			// TODO Auto-generated constructor stub
		}

	public JTextField getTextField_1() {
		return textField_1;
	}

	public void setTextField_1(JTextField textField_1) {
		this.textField_1 = textField_1;
	}
	}

