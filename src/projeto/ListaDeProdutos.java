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

public class ListadeProdutos extends JFrame {

	private JPanel contentPane;

	
	public static void main(String[] args) {
		
	}

	public ListadeProdutos(int idpessoa) {
		setTitle("Lista de Produtos");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 721, 506);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblOlSejaBem = new JLabel("Ol\u00E1! Seja bem vindo!");
		lblOlSejaBem.setBounds(35, 16, 100, 14);
		contentPane.add(lblOlSejaBem);
		setVisible(true);
	}
}
