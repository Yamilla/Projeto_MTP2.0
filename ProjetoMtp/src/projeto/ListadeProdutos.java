package projeto;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JScrollBar;
import javax.swing.BoxLayout;
import javax.swing.JToolBar;
import javax.swing.JSeparator;
import java.awt.Color;
import javax.swing.SpringLayout;
import javax.swing.JToggleButton;
import java.awt.Font;
import java.awt.Image;
import java.awt.Panel;
import javax.swing.JScrollPane;
import javax.swing.JProgressBar;
import javax.swing.JTextArea;
import javax.swing.border.LineBorder;

import com.sun.corba.se.spi.orbutil.fsm.Guard.Result;

import java.awt.Scrollbar;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import java.awt.Window;

import javax.swing.JTextField;
import java.awt.Window.Type;
import javax.swing.UIManager;
import javax.swing.JTextPane;

public class ListadeProdutos extends JFrame{
	

	private JPanel contentPane;
	public static void main(String[] args) {
	}

	public ListadeProdutos(int idpessoa) {
		setType(Type.POPUP);
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\yamil\\eclipse-workspace\\ProjetoMtp\\src\\img\\010-star-trek.png"));
		setResizable(false);
		setTitle("Lista de Produtos");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 993, 623);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nome do Usuario");
		lblNewLabel.setBounds(91, 11, 99, 21);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Foto Perfil");
		lblNewLabel_1.setBounds(10, 11, 71, 76);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Atualizar dados");
		btnNewButton.addActionListener(new ActionListener() {
		
			//MOSTRAR A TELA DE ATUALIZAÇÃO DE DADOS
			public void actionPerformed(ActionEvent arg0) {
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						AtualizacaoDeDados frame = new AtualizacaoDeDados(idpessoa);
						frame.setVisible(true);

							} catch (Exception e) {
								e.printStackTrace();
							}
							dispose ();
							}
					});
			}
		});
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 9));
		btnNewButton.setBounds(91, 43, 106, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
					EventQueue.invokeLater(new Runnable() {
						public void run() {
							try {
								Carrinho frame = new Carrinho();
								frame.setVisible(true);

									} catch (Exception e) {
										e.printStackTrace();
									}
									dispose ();
									}
							});
			}
		});
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\yamil\\eclipse-workspace\\ProjetoMtp\\src\\img\\shopping_basket.png"));
		btnNewButton_1.setBackground(Color.WHITE);
		btnNewButton_1.setBounds(858, 11, 91, 98);
		contentPane.add(btnNewButton_1);
		
		JButton btnSair = new JButton("Sair");
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnSair.setForeground(Color.BLACK);
		btnSair.setBackground(Color.WHITE);
		btnSair.setFont(new Font("Times New Roman", Font.BOLD, 11));
		btnSair.setBounds(91, 77, 106, 23);
		contentPane.add(btnSair);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(20, 107, 957, 2);
		contentPane.add(separator);
		
		JLabel imgP1 = new JLabel("produto 1");
		imgP1.setBackground(Color.BLACK);
		imgP1.setBounds(10, 124, 133, 111);
		contentPane.add(imgP1);
		
		JButton btnNewButton_2 = new JButton("Adicionar ao carrinho");
		btnNewButton_2.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		btnNewButton_2.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton_2.setBounds(10, 302, 133, 23);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Adicionar ao carrinho");
		btnNewButton_3.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		btnNewButton_3.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton_3.setBounds(10, 550, 133, 23);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Adicionar ao carrinho");
		btnNewButton_4.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		btnNewButton_4.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton_4.setBounds(199, 302, 137, 23);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("Adicionar ao carrinho");
		btnNewButton_5.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		btnNewButton_5.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton_5.setBounds(199, 550, 137, 23);
		contentPane.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("Adicionar ao carrinho");
		btnNewButton_6.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		btnNewButton_6.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton_6.setBounds(393, 550, 141, 23);
		contentPane.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("Adicionar ao carrinho");
		btnNewButton_7.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		btnNewButton_7.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton_7.setBounds(393, 302, 137, 23);
		contentPane.add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("Adicionar ao carrinho");
		btnNewButton_8.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		btnNewButton_8.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton_8.setBounds(612, 550, 137, 23);
		contentPane.add(btnNewButton_8);
		
		JButton btnNewButton_9 = new JButton("Adicionar ao carrinho");
		btnNewButton_9.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		btnNewButton_9.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton_9.setBounds(608, 302, 137, 23);
		contentPane.add(btnNewButton_9);
		
		JButton btnNewButton_10 = new JButton("Adicionar ao carrinho");
		btnNewButton_10.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		btnNewButton_10.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton_10.setBounds(816, 302, 133, 23);
		contentPane.add(btnNewButton_10);
		
		JButton btnNewButton_11 = new JButton("Adicionar ao carrinho");
		btnNewButton_11.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		btnNewButton_11.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton_11.setBounds(813, 550, 136, 23);
		contentPane.add(btnNewButton_11);
		
		JButton btnCadastrarProd = new JButton("Cadastrar Produto");
		btnCadastrarProd.setBounds(220, 77, 133, 23);
		contentPane.add(btnCadastrarProd);
		
		JLabel valor1 = new JLabel("New label");
		valor1.setBounds(30, 277, 85, 14);
		contentPane.add(valor1);
		
		JLabel label = new JLabel("produto 1");
		label.setBackground(Color.BLACK);
		label.setBounds(203, 124, 133, 111);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("produto 1");
		label_1.setBackground(Color.BLACK);
		label_1.setBounds(393, 124, 133, 111);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("produto 1");
		label_2.setBackground(Color.BLACK);
		label_2.setBounds(612, 124, 133, 111);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("produto 1");
		label_3.setBackground(Color.BLACK);
		label_3.setBounds(816, 124, 133, 111);
		contentPane.add(label_3);
		
		JLabel label_4 = new JLabel("produto 1");
		label_4.setBackground(Color.BLACK);
		label_4.setBounds(10, 350, 133, 111);
		contentPane.add(label_4);
		
		JLabel label_5 = new JLabel("produto 1");
		label_5.setBackground(Color.BLACK);
		label_5.setBounds(199, 350, 133, 111);
		contentPane.add(label_5);
		
		JLabel label_6 = new JLabel("produto 1");
		label_6.setBackground(Color.BLACK);
		label_6.setBounds(403, 350, 133, 111);
		contentPane.add(label_6);
		
		JLabel label_7 = new JLabel("produto 1");
		label_7.setBackground(Color.BLACK);
		label_7.setBounds(612, 350, 133, 111);
		contentPane.add(label_7);
		
		JLabel label_8 = new JLabel("produto 1");
		label_8.setBackground(Color.BLACK);
		label_8.setBounds(816, 350, 133, 111);
		contentPane.add(label_8);
		
		JLabel label_9 = new JLabel("New label");
		label_9.setBounds(418, 273, 85, 18);
		contentPane.add(label_9);
		
		JLabel label_10 = new JLabel("New label");
		label_10.setBounds(220, 273, 85, 18);
		contentPane.add(label_10);
		
		JLabel prod1 = new JLabel("New label");
		prod1.setBounds(30, 248, 85, 18);
		contentPane.add(prod1);
		
		JLabel prod2 = new JLabel("New label");
		prod2.setBounds(220, 246, 85, 18);
		contentPane.add(prod2);
		
		JLabel label_13 = new JLabel("New label");
		label_13.setBounds(418, 246, 85, 18);
		contentPane.add(label_13);
		
		JLabel label_14 = new JLabel("New label");
		label_14.setBounds(629, 275, 85, 18);
		contentPane.add(label_14);
		
		JLabel label_15 = new JLabel("New label");
		label_15.setBounds(629, 250, 85, 18);
		contentPane.add(label_15);
		
		JLabel label_16 = new JLabel("New label");
		label_16.setBounds(834, 275, 85, 18);
		contentPane.add(label_16);
		
		JLabel label_17 = new JLabel("New label");
		label_17.setBounds(834, 246, 85, 18);
		contentPane.add(label_17);
		
		JLabel label_18 = new JLabel("New label");
		label_18.setBounds(30, 521, 85, 18);
		contentPane.add(label_18);
		
		JLabel label_19 = new JLabel("New label");
		label_19.setBounds(30, 496, 85, 18);
		contentPane.add(label_19);
		
		JLabel label_20 = new JLabel("New label");
		label_20.setBounds(220, 523, 85, 18);
		contentPane.add(label_20);
		
		JLabel label_21 = new JLabel("New label");
		label_21.setBounds(220, 498, 85, 18);
		contentPane.add(label_21);
		
		JLabel label_22 = new JLabel("New label");
		label_22.setBounds(418, 523, 85, 18);
		contentPane.add(label_22);
		
		JLabel label_23 = new JLabel("New label");
		label_23.setBounds(418, 498, 85, 18);
		contentPane.add(label_23);
		
		JLabel label_24 = new JLabel("New label");
		label_24.setBounds(642, 523, 85, 18);
		contentPane.add(label_24);
		
		JLabel label_25 = new JLabel("New label");
		label_25.setBounds(642, 498, 85, 18);
		contentPane.add(label_25);
		
		JLabel label_26 = new JLabel("New label");
		label_26.setBounds(834, 523, 85, 18);
		contentPane.add(label_26);
		
		JLabel label_27 = new JLabel("New label");
		label_27.setBounds(834, 496, 85, 18);
		contentPane.add(label_27);
		
		JButton btnNewButton_12 = new JButton("Gerenciar Produto");
		btnNewButton_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
				Conexao conexao = new Conexao();
				PreparedStatement st = conexao.conn.prepareStatement("SELECT administrador FROM pessoa WHERE idpessoa = ?");
					ResultSet rs = st.executeQuery();
					while(rs.next()) {
					
							new ListadeProdutos(rs.getInt(1)).setVisible(true);
							dispose();
							}
					rs.close();
					st.close();
				}catch (SQLException e) {
					
					e.printStackTrace();
				}
			}
			});
		
		
		boolean administrador = false;
		try {
			PreparedStatement st = Conexao.conn.prepareStatement("SELECT administrador FROM pessoa WHERE idpessoa = ?");
			st.setInt(1, idpessoa);
			ResultSet rs = st.executeQuery();
			if(rs.next()) {
				administrador = rs.getBoolean(1);
			}
		}catch(Exception e) {
			JOptionPane.showMessageDialog(null, "");
		}
		if(administrador) {
			btnCadastrarProd.setVisible(true);
		}else {
			btnCadastrarProd.setVisible(false);
		}
	}
	//pegar info dos prod
	int cont;
	Image img = null;
	try{
		PreparedStatement st = Conexao.conn.prepareStatement("SELECT nome , preco_venda, foto FROM produto WHERE idproduto = ?");
		st.setInt(1,cont);
		ResultSet rs = st.executeQuery();
		while(rs.next()) {
			JLabel prod1;
			JLabel valor1;
			JLabel imgP1;
			prod1.setText(rs.getString(1));
			valor1.setText(rs.getString(2));
			img = Toolkit.getDefaultToolkit().createImage(rs.getBytes(3));
			imgP1.setIcon( new ImageIcon(img));
			cont-=1;
		}
	}catch(){
}
	
		
		
