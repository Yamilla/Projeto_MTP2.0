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
import java.awt.GridLayout;

public class ListadeProdutos extends JFrame {

	private JPanel contentPane;

	
	public static void main(String[] args) {
		
	}

	public ListadeProdutos(int idpessoa) {
		setResizable(false);
		setTitle("Lista de Produtos");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 993, 623);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 3, 0, 0));
		
		JLabel lblNewLabel_1 = new JLabel("foto");
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("nome");
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton_1 = new JButton("Carrinho ");
		btnNewButton_1.setBackground(Color.WHITE);
		contentPane.add(btnNewButton_1);
		
		JLabel label = new JLabel("");
		contentPane.add(label);
		
		JButton btnNewButton = new JButton("Atualizar dados");
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 9));
		contentPane.add(btnNewButton);
		
		JLabel label_1 = new JLabel("");
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("");
		contentPane.add(label_2);
		
		JButton btnSair = new JButton("Sair");
		btnSair.setBackground(Color.WHITE);
		btnSair.setFont(new Font("Times New Roman", Font.BOLD, 11));
		contentPane.add(btnSair);
		
		JLabel label_3 = new JLabel("");
		contentPane.add(label_3);
		
		JSeparator separator = new JSeparator();
		contentPane.add(separator);
		
		JLabel label_4 = new JLabel("");
		contentPane.add(label_4);
		
		JLabel label_5 = new JLabel("");
		contentPane.add(label_5);
		setVisible(true);
		
		
	}
}
