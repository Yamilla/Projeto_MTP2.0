package projeto;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
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
import java.awt.Panel;
import javax.swing.JScrollPane;
import javax.swing.JProgressBar;
import javax.swing.JTextArea;
import javax.swing.border.LineBorder;
import java.awt.Scrollbar;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import javax.swing.JTextField;
import java.awt.Window.Type;
import javax.swing.UIManager;

public class ListadeProdutos extends JFrame {

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
		
		JLabel lblNewLabel = new JLabel("nome");
		lblNewLabel.setBounds(91, 11, 99, 21);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("foto");
		lblNewLabel_1.setBounds(10, 11, 71, 76);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Atualizar dados");
		btnNewButton.addActionListener(new ActionListener() {
		
			// tratamento do botao atualizar dados
			public void actionPerformed(ActionEvent arg0) {
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						AtualizacaoDeDados frame = new AtualizacaoDeDados();
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
		btnNewButton_1.setBounds(850, 11, 99, 98);
		contentPane.add(btnNewButton_1);
		
		JButton btnSair = new JButton("Sair");
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnSair.setForeground(Color.BLACK);
		btnSair.setBackground(Color.WHITE);
		btnSair.setFont(new Font("Times New Roman", Font.BOLD, 11));
		btnSair.setBounds(101, 77, 89, 23);
		contentPane.add(btnSair);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 111, 957, 2);
		contentPane.add(separator);
		
		JLabel lblProduto = new JLabel("produto 1");
		lblProduto.setBackground(Color.BLACK);
		lblProduto.setBounds(10, 124, 153, 140);
		contentPane.add(lblProduto);
		
		JLabel lblPrduto = new JLabel("produto2");
		lblPrduto.setBounds(173, 124, 153, 140);
		contentPane.add(lblPrduto);
		
		JLabel label = new JLabel("produto 1");
		label.setBackground(Color.BLACK);
		label.setBounds(20, 336, 153, 140);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("produto 1");
		label_1.setBackground(Color.BLACK);
		label_1.setBounds(168, 345, 153, 140);
		contentPane.add(label_1);
		
		JLabel label_3 = new JLabel("produto 1");
		label_3.setBackground(Color.BLACK);
		label_3.setBounds(360, 129, 153, 140);
		contentPane.add(label_3);
		
		JLabel label_4 = new JLabel("produto 1");
		label_4.setBackground(Color.BLACK);
		label_4.setBounds(360, 345, 153, 140);
		contentPane.add(label_4);
		
		JLabel label_5 = new JLabel("produto 1");
		label_5.setBackground(Color.BLACK);
		label_5.setBounds(586, 129, 153, 140);
		contentPane.add(label_5);
		
		JLabel label_6 = new JLabel("produto 1");
		label_6.setBackground(Color.BLACK);
		label_6.setBounds(586, 345, 153, 140);
		contentPane.add(label_6);
		
		JLabel label_7 = new JLabel("produto 1");
		label_7.setBackground(Color.BLACK);
		label_7.setBounds(785, 129, 153, 140);
		contentPane.add(label_7);
		
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
		btnNewButton_5.setBounds(189, 550, 137, 23);
		contentPane.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("Adicionar ao carrinho");
		btnNewButton_6.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		btnNewButton_6.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton_6.setBounds(389, 550, 141, 23);
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
		btnNewButton_8.setBounds(586, 550, 137, 23);
		contentPane.add(btnNewButton_8);
		
		JButton btnNewButton_9 = new JButton("Adicionar ao carrinho");
		btnNewButton_9.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		btnNewButton_9.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton_9.setBounds(586, 302, 137, 23);
		contentPane.add(btnNewButton_9);
		
		JButton btnNewButton_10 = new JButton("Adicionar ao carrinho");
		btnNewButton_10.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		btnNewButton_10.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton_10.setBounds(816, 302, 133, 23);
		contentPane.add(btnNewButton_10);
		
		JLabel label_2 = new JLabel("produto 1");
		label_2.setBackground(Color.BLACK);
		label_2.setBounds(773, 345, 153, 140);
		contentPane.add(label_2);
		
		JButton btnNewButton_11 = new JButton("Adicionar ao carrinho");
		btnNewButton_11.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		btnNewButton_11.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton_11.setBounds(813, 550, 136, 23);
		contentPane.add(btnNewButton_11);
		setVisible(true);
		
		
	}
}
