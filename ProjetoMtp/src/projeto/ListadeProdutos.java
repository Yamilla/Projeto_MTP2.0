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
		
		JLabel usuario = new JLabel("Nome do Usuario");
		usuario.setBounds(91, 11, 99, 21);
		contentPane.add(usuario);
		
		Metodos m1 = new Metodos();
		usuario.setText(m1.mostrarUsuario(idpessoa));
		
		
		
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
				dispose();
				new Inicio().setVisible(true);
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
		
		
		
		JButton btnCadastrarProd = new JButton("Cadastrar Produto");
		btnCadastrarProd.setBackground(Color.WHITE);
		btnCadastrarProd.setFont(new Font("Times New Roman", Font.BOLD, 11));
		btnCadastrarProd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				CadastramentoDeProduto c1 = new CadastramentoDeProduto();
				c1.setVisible(true);
				//dispose();
			}
			
		});dispose();
		
		btnCadastrarProd.setBounds(220, 77, 133, 23);
		contentPane.add(btnCadastrarProd);
		
		JLabel valor1 = new JLabel("New label");
		valor1.setBounds(30, 277, 85, 14);
		contentPane.add(valor1);
		
		JLabel imgP2 = new JLabel("produto 1");
		imgP2.setBackground(Color.BLACK);
		imgP2.setBounds(203, 124, 133, 111);
		contentPane.add(imgP2);
		
		JLabel imgP3 = new JLabel("produto 1");
		imgP3.setBackground(Color.BLACK);
		imgP3.setBounds(393, 124, 133, 111);
		contentPane.add(imgP3);
		
		JLabel img4 = new JLabel("produto 1");
		img4.setBackground(Color.BLACK);
		img4.setBounds(612, 124, 133, 111);
		contentPane.add(img4);
		
		JLabel img5 = new JLabel("produto 1");
		img5.setBackground(Color.BLACK);
		img5.setBounds(816, 124, 133, 111);
		contentPane.add(img5);
		
		JLabel img6 = new JLabel("produto 1");
		img6.setBackground(Color.BLACK);
		img6.setBounds(10, 350, 133, 111);
		contentPane.add(img6);
		
		JLabel img7 = new JLabel("produto 1");
		img7.setBackground(Color.BLACK);
		img7.setBounds(199, 350, 133, 111);
		contentPane.add(img7);
		
		JLabel img8 = new JLabel("produto 1");
		img8.setBackground(Color.BLACK);
		img8.setBounds(403, 350, 133, 111);
		contentPane.add(img8);
		
		JLabel img9 = new JLabel("produto 1");
		img9.setBackground(Color.BLACK);
		img9.setBounds(612, 350, 133, 111);
		contentPane.add(img9);
		
		JLabel img10 = new JLabel("produto 1");
		img10.setBackground(Color.BLACK);
		img10.setBounds(816, 350, 133, 111);
		contentPane.add(img10);
		
		JLabel valor3 = new JLabel("Pre\u00E7o");
		valor3.setBounds(418, 273, 85, 18);
		contentPane.add(valor3);
		
		JLabel valor2 = new JLabel("New label");
		valor2.setBounds(220, 273, 85, 18);
		contentPane.add(valor2);
		
		JLabel prod1 = new JLabel("New label");
		prod1.setBounds(30, 248, 85, 18);
		contentPane.add(prod1);
		
		JLabel prod2 = new JLabel("New label");
		prod2.setBounds(220, 246, 85, 18);
		contentPane.add(prod2);
		
		JLabel prod3 = new JLabel("Produto");
		prod3.setBounds(418, 246, 85, 18);
		contentPane.add(prod3);
		
		JLabel valor4 = new JLabel("Pre\u00E7o");
		valor4.setBounds(629, 275, 85, 18);
		contentPane.add(valor4);
		
		JLabel nome4 = new JLabel("Produto");
		nome4.setBounds(629, 250, 85, 18);
		contentPane.add(nome4);
		
		JLabel valor5 = new JLabel("Pre\u00E7o");
		valor5.setBounds(834, 275, 85, 18);
		contentPane.add(valor5);
		
		JLabel nome5 = new JLabel("Produto");
		nome5.setBounds(834, 246, 85, 18);
		contentPane.add(nome5);
		
		JLabel valor6 = new JLabel("Pre\u00E7o");
		valor6.setBounds(30, 521, 85, 18);
		contentPane.add(valor6);
		
		JLabel nome6 = new JLabel("Produto");
		nome6.setBounds(30, 496, 85, 18);
		contentPane.add(nome6);
		
		JLabel valor7 = new JLabel("Pre\u00E7o");
		valor7.setBounds(220, 523, 85, 18);
		contentPane.add(valor7);
		
		JLabel nome7 = new JLabel("Produto");
		nome7.setBounds(220, 498, 85, 18);
		contentPane.add(nome7);
		
		JLabel valor8 = new JLabel("Pre\u00E7o");
		valor8.setBounds(418, 523, 85, 18);
		contentPane.add(valor8);
		
		JLabel nome8 = new JLabel("Produto");
		nome8.setBounds(418, 498, 85, 18);
		contentPane.add(nome8);
		
		JLabel valor9 = new JLabel("Pre\u00E7o");
		valor9.setBounds(642, 523, 85, 18);
		contentPane.add(valor9);
		
		JLabel nome9 = new JLabel("Produto");
		nome9.setBounds(642, 498, 85, 18);
		contentPane.add(nome9);
		
		JLabel valor10 = new JLabel("Pre\u00E7o");
		valor10.setBounds(834, 523, 85, 18);
		contentPane.add(valor10);
		
		JLabel nome10 = new JLabel("Produto");
		nome10.setBounds(834, 496, 85, 18);
		contentPane.add(nome10);
		
		JLabel lblNewLabel_2 = new JLabel("Bem Vindo");
		lblNewLabel_2.setForeground(Color.BLUE);
		lblNewLabel_2.setFont(new Font("Segoe Script", Font.BOLD, 23));
		lblNewLabel_2.setBounds(454, 30, 187, 27);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Otimas compras!!");
		lblNewLabel_3.setForeground(Color.BLUE);
		lblNewLabel_3.setFont(new Font("Segoe Print", Font.BOLD, 23));
		lblNewLabel_3.setBounds(454, 73, 260, 27);
		contentPane.add(lblNewLabel_3);
		
		JButton btnNewButton_12 = new JButton("Gerenciar Produto");
		btnNewButton_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new CadastramentoDeProduto();
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
		
	int [] idproduto = new int [10];	
	//idproduto[0] = idMax;

	//MOSTRAR PRODUTOS
		int idMax = 0;
		byte[] imageByte = null;
		Image img = null;
		try {
			PreparedStatement st = Conexao.conn.prepareStatement("SELECT Max(idProduto) FROM produto");
			ResultSet rs = st.executeQuery();
			if (rs.next()) {
				idMax = rs.getInt(1);
			}
			rs.close();
			st.close();
			if (idMax>=1) {
				//Pega o produto com o maior id (sempre o mais recente)
				idproduto[0] = idMax;
				st = Conexao.conn.prepareStatement("SELECT nome, preco_venda,foto FROM produto WHERE idProduto = ?");
				st.setInt(1, idMax);
				rs = st.executeQuery();
				if (rs.next()) {
					prod1.setText(rs.getString(1));
					valor1.setText(String.valueOf(rs.getFloat(2)));
					img= Toolkit.getDefaultToolkit().createImage(rs.getBytes(3));
					imgP1.setIcon(new ImageIcon(img.getScaledInstance(imgP1.getWidth(), imgP1.getHeight(), Image.SCALE_DEFAULT)));
					imgP1.repaint();

				}
				rs.close();
				st.close();
				--idMax;
				if (idMax>=1) {	
					idproduto[1] = idMax;
					st = Conexao.conn.prepareStatement("SELECT nome, preco_venda,foto FROM produto WHERE idProduto = ?");
					st.setInt(1, idMax);
					rs = st.executeQuery();
					if (rs.next()) {
						prod2.setText(rs.getString(1));
						valor2.setText(String.valueOf(rs.getFloat(2)));
						img = Toolkit.getDefaultToolkit().createImage(rs.getBytes(3));
						imgP2.setIcon(new ImageIcon(img.getScaledInstance(imgP2.getWidth(), imgP2.getHeight(), Image.SCALE_DEFAULT)));
						imgP2.repaint();
						
					}
					rs.close();
					st.close();
					--idMax;
					if (idMax>=1) {
						idproduto[2] = idMax;
						st = Conexao.conn.prepareStatement("SELECT nome, preco_venda,foto FROM produto WHERE idProduto = ?");
						st.setInt(1, idMax);
						rs = st.executeQuery();
						if (rs.next()) {
							prod3.setText(rs.getString(1));
							valor3.setText(String.valueOf(rs.getFloat(2)));
							img = Toolkit.getDefaultToolkit().createImage(rs.getBytes(3));
							imgP3.setIcon(new ImageIcon(img.getScaledInstance(imgP3.getWidth(), imgP3.getHeight(), Image.SCALE_DEFAULT)));
							imgP3.repaint();
						}
						rs.close();
						st.close();
						--idMax;
						if (idMax>=1) {
							idproduto[3] = idMax;
							st = Conexao.conn.prepareStatement("SELECT nome, preco_venda,foto FROM produto WHERE idProduto = ?");
							st.setInt(1, idMax);
							rs = st.executeQuery();
							if (rs.next()) {
								nome4.setText(rs.getString(1));
								valor4.setText(String.valueOf(rs.getFloat(2)));
								img = Toolkit.getDefaultToolkit().createImage(rs.getBytes(3));
								img4.setIcon(new ImageIcon(img.getScaledInstance(img4.getWidth(), img4.getHeight(), Image.SCALE_DEFAULT)));
								img4.repaint();
							}
							rs.close();
							st.close();
							--idMax;
							if (idMax>=1) {
								idproduto[4] = idMax;
								st = Conexao.conn.prepareStatement("SELECT nome, preco_venda,foto FROM produto WHERE idProduto = ?");
								st.setInt(1, idMax);
								rs = st.executeQuery();
								if (rs.next()) {
									nome5.setText(rs.getString(1));
									valor5.setText(String.valueOf(rs.getFloat(2)));
									img = Toolkit.getDefaultToolkit().createImage(rs.getBytes(3));
									img5.setIcon(new ImageIcon(img.getScaledInstance(img5.getWidth(), img5.getHeight(), Image.SCALE_DEFAULT)));
									img5.repaint();
								}
								rs.close();
								st.close();
								--idMax;
								if (idMax>=1) {
									idproduto[5] = idMax;
									st = Conexao.conn.prepareStatement("SELECT nome, preco_venda,foto FROM produto WHERE idProduto = ?");
									st.setInt(1, idMax);
									rs = st.executeQuery();
									if (rs.next()) {
										nome6.setText(rs.getString(1));
										valor6.setText(String.valueOf(rs.getFloat(2)));
										img = Toolkit.getDefaultToolkit().createImage(rs.getBytes(3));
										img6.setIcon(new ImageIcon(img.getScaledInstance(img6.getWidth(), img6.getHeight(), Image.SCALE_DEFAULT)));
										img6.repaint();
									}
									rs.close();
									st.close();
									--idMax;
								}
								if (idMax>=1) {
									idproduto[6] = idMax;
									st = Conexao.conn.prepareStatement("SELECT nome, preco_venda,foto FROM produto WHERE idProduto = ?");
									st.setInt(1, idMax);
									rs = st.executeQuery();
									if (rs.next()) {
										nome7.setText(rs.getString(1));
										valor7.setText(String.valueOf(rs.getFloat(2)));
										img = Toolkit.getDefaultToolkit().createImage(rs.getBytes(3));
										img7.setIcon(new ImageIcon(img.getScaledInstance(img7.getWidth(), img7.getHeight(), Image.SCALE_DEFAULT)));
										img7.repaint();
									}
									rs.close();
									st.close();
									--idMax;
								}
								if (idMax>=1) {
									idproduto[7] = idMax;
									st = Conexao.conn.prepareStatement("SELECT nome, preco_venda,foto FROM produto WHERE idProduto = ?");
									st.setInt(1, idMax);
									rs = st.executeQuery();
									if (rs.next()) {
										nome8.setText(rs.getString(1));
										valor8.setText(String.valueOf(rs.getFloat(2)));
										img = Toolkit.getDefaultToolkit().createImage(rs.getBytes(3));
										img8.setIcon(new ImageIcon(img.getScaledInstance(img8.getWidth(), img8.getHeight(), Image.SCALE_DEFAULT)));
										img8.repaint();
									}
									rs.close();
									st.close();
									--idMax;
								}
								if (idMax>=1) {
									idproduto[8] = idMax;
									st = Conexao.conn.prepareStatement("SELECT nome, preco_venda,foto FROM produto WHERE idProduto = ?");
									st.setInt(1, idMax);
									rs = st.executeQuery();
									if (rs.next()) {
										nome9.setText(rs.getString(1));
										valor9.setText(String.valueOf(rs.getFloat(2)));
										img = Toolkit.getDefaultToolkit().createImage(rs.getBytes(3));
										img9.setIcon(new ImageIcon(img.getScaledInstance(img9.getWidth(), img9.getHeight(), Image.SCALE_DEFAULT)));
										img9.repaint();
									}
									rs.close();
									st.close();
									--idMax;
								}
								if (idMax>=1) {		
									idproduto[9] = idMax;
									st = Conexao.conn.prepareStatement("SELECT nome, preco_venda,foto FROM produto WHERE idProduto = ?");
									st.setInt(1, idMax);
									rs = st.executeQuery();
									if (rs.next()) {
										nome10.setText(rs.getString(1));
										valor10.setText(String.valueOf(rs.getFloat(2)));
										img = Toolkit.getDefaultToolkit().createImage(rs.getBytes(3));
										img10.setIcon(new ImageIcon(img.getScaledInstance(img10.getWidth(), img10.getHeight(), Image.SCALE_DEFAULT)));
										img10.repaint();
									}
									rs.close();
									st.close();
									--idMax;
								}
								
							}
						}
					}
				}
			}
		
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		JButton bt0 = new JButton("Adicionar ao carrinho");
		bt0.setFont(new Font("Times New Roman", Font.BOLD, 11));
		bt0.setHorizontalAlignment(SwingConstants.LEFT);
		bt0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Metodos m1 = new Metodos();
			    int quantidade =1;				
				m1.inserirCarrinho(idproduto[0], idpessoa,quantidade);
				JOptionPane.showMessageDialog(null, "Produto enviado ao carrinho!");
			}
		});
		bt0.setBounds(10, 302, 133, 23);
		contentPane.add(bt0);
		
		JButton bt5 = new JButton("Adicionar ao carrinho");
		bt5.setFont(new Font("Times New Roman", Font.BOLD, 11));
		bt5.setHorizontalAlignment(SwingConstants.LEFT);
		bt5.setBounds(10, 550, 133, 23);
		contentPane.add(bt5);
		
		JButton bt1 = new JButton("Adicionar ao carrinho");
		bt1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Metodos m1 = new Metodos();
			    int quantidade =1;				
				m1.inserirCarrinho(idproduto[1], idpessoa,quantidade);
				JOptionPane.showMessageDialog(null, "Produto enviado ao carrinho!");
				
			}
		});
		bt1.setFont(new Font("Times New Roman", Font.BOLD, 11));
		bt1.setHorizontalAlignment(SwingConstants.LEFT);
		bt1.setBounds(199, 302, 137, 23);
		contentPane.add(bt1);
		
		JButton bt6 = new JButton("Adicionar ao carrinho");
		bt6.setFont(new Font("Times New Roman", Font.BOLD, 11));
		bt6.setHorizontalAlignment(SwingConstants.LEFT);
		bt6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		bt6.setBounds(199, 550, 137, 23);
		contentPane.add(bt6);
		
		JButton bt7 = new JButton("Adicionar ao carrinho");
		bt7.setFont(new Font("Times New Roman", Font.BOLD, 11));
		bt7.setHorizontalAlignment(SwingConstants.LEFT);
		bt7.setBounds(393, 550, 141, 23);
		contentPane.add(bt7);
		
		JButton bt2 = new JButton("Adicionar ao carrinho");
		bt2.setFont(new Font("Times New Roman", Font.BOLD, 11));
		bt2.setHorizontalAlignment(SwingConstants.LEFT);
		bt2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		bt2.setBounds(393, 302, 137, 23);
		contentPane.add(bt2);
		
		JButton bt8 = new JButton("Adicionar ao carrinho");
		bt8.setFont(new Font("Times New Roman", Font.BOLD, 11));
		bt8.setHorizontalAlignment(SwingConstants.LEFT);
		bt8.setBounds(612, 550, 137, 23);
		contentPane.add(bt8);
		
		JButton bt3 = new JButton("Adicionar ao carrinho");
		bt3.setFont(new Font("Times New Roman", Font.BOLD, 11));
		bt3.setHorizontalAlignment(SwingConstants.LEFT);
		bt3.setBounds(608, 302, 137, 23);
		contentPane.add(bt3);
		
		JButton bt4 = new JButton("Adicionar ao carrinho");
		bt4.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		bt4.setHorizontalAlignment(SwingConstants.LEFT);
		bt4.setBounds(816, 302, 133, 23);
		contentPane.add(bt4);
		
		JButton bt9 = new JButton("Adicionar ao carrinho");
		bt9.setFont(new Font("Times New Roman", Font.BOLD, 11));
		bt9.setHorizontalAlignment(SwingConstants.LEFT);
		bt9.setBounds(813, 550, 136, 23);
		contentPane.add(bt9);
	}
}

	
		
		
