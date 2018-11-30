package projeto;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JLabel;

public class Carrinho extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Carrinho frame = new Carrinho();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Carrinho() {
		setTitle("Carrinho");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 545, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Finalizar compra");
		btnNewButton.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton.setBounds(377, 227, 109, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Retornar a lista de produto");
		btnNewButton_1.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton_1.setBounds(10, 227, 163, 23);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setBounds(20, 24, 61, 14);
		contentPane.add(lblNome);
	}

}
