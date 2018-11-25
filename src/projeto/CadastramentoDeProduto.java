package projeto;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JToggleButton;
import java.awt.Window.Type;
import java.awt.Color;

public class CadastramentoDeProduto extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastramentoDeProduto frame = new CadastramentoDeProduto();
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
	public CadastramentoDeProduto() {
		setTitle("Cadastramento de Produtos");
		setType(Type.POPUP);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 398, 510);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblProduto = new JLabel("Produto");
		lblProduto.setBounds(10, 31, 46, 14);
		contentPane.add(lblProduto);
		
		textField = new JTextField();
		textField.setBounds(66, 28, 276, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblDescrio = new JLabel("Descri\u00E7\u00E3o");
		lblDescrio.setBounds(10, 94, 46, 14);
		contentPane.add(lblDescrio);
		
		textField_1 = new JTextField();
		textField_1.setBounds(66, 91, 276, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblPreo = new JLabel("Pre\u00E7o");
		lblPreo.setBounds(10, 154, 46, 14);
		contentPane.add(lblPreo);
		
		textField_2 = new JTextField();
		textField_2.setBounds(67, 151, 275, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnNewButton = new JButton("Cadastrar produto");
		btnNewButton.setBackground(new Color(240, 240, 240));
		btnNewButton.setBounds(121, 423, 153, 23);
		contentPane.add(btnNewButton);
	}
}
