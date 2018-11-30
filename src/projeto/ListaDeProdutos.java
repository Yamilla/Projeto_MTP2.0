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
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("nome");
		lblNewLabel.setBounds(91, 11, 99, 21);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("foto");
		lblNewLabel_1.setBounds(10, 11, 71, 76);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Atualizar dados");
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 9));
		btnNewButton.setBounds(91, 43, 106, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Carrinho ");
		btnNewButton_1.setBackground(Color.WHITE);
		btnNewButton_1.setBounds(802, 23, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnSair = new JButton("Sair");
		btnSair.setBackground(Color.WHITE);
		btnSair.setFont(new Font("Times New Roman", Font.BOLD, 11));
		btnSair.setBounds(101, 77, 89, 23);
		contentPane.add(btnSair);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 111, 957, 21);
		contentPane.add(separator);
		
		JPanel panel = new JPanel();
		panel.setBounds(20, 140, 194, 124);
		contentPane.add(panel);
		setVisible(true);
		
		
	}
}
