package projeto;

import java.awt.BorderLayout;
import javax.swing.JOptionPane;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import java.awt.SystemColor;
import javax.swing.UIManager;
import javax.swing.JSeparator;

public class login extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login frame = new login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public login() {
		setResizable(false);
		setTitle("Login");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\yamil\\Desktop\\Imagens Projeto MTP\\009-superman.png"));
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);		
		setBounds(100, 100, 397, 476);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setForeground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblLogin = new JLabel("Login:");
		lblLogin.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 12));
		lblLogin.setBounds(10, 289, 46, 14);
		contentPane.add(lblLogin);
		
		JLabel lblSenha = new JLabel("Senha:");
		lblSenha.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 12));
		lblSenha.setBounds(10, 333, 46, 14);
		contentPane.add(lblSenha);
		
		textField = new JTextField();
		textField.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		textField.setBounds(56, 286, 297, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		passwordField.setBounds(56, 330, 297, 20);
		contentPane.add(passwordField);
		
		JButton btnNewButton = new JButton("Entrar");
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnNewButton.addActionListener(new ActionListener() {
			
		//VALIDAÇÃO DO USUÁRIO
			public void actionPerformed(ActionEvent arg0) {
				try {
				Conexao conexao = new Conexao();
				PreparedStatement st = conexao.conn.prepareStatement("SELECT idpessoa FROM pessoa WHERE email = ? AND senha = ?");
					st.setString(1, textField.getText());
					st.setString(2, new String (passwordField.getPassword()));
					String senha1 = new String(passwordField.getPassword());
					ResultSet rs = st.executeQuery();
					while(rs.next()) {
						if(textField.getText().equals(textField.getText())) {
							if(senha1.equals(new String (passwordField.getPassword()))) {
								//passar O ID DO USUARIO PARA MOSTRAR NOME, BOTAO ADM ETC
								new ListadeProdutos(rs.getInt(1)).setVisible(true);
								dispose();
							}
						}
					}
					rs.close();
					st.close();
				} catch (SQLException e) {
					
					e.printStackTrace();
				}
				dispose();
			}
			
		});
		btnNewButton.setBounds(71, 385, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Sair");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(arg0.getSource()==btnNewButton_1) {
					dispose();
				}
			}
		});
		btnNewButton_1.setBounds(227, 384, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\yamil\\Desktop\\Imagens Projeto MTP\\images.png"));
		lblNewLabel.setBounds(76, 24, 227, 232);
		contentPane.add(lblNewLabel);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 254, 361, 2);
		contentPane.add(separator);
	}
}
