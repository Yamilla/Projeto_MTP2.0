package projeto;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JSeparator;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Toolkit;
import java.awt.Window.Type;

public class CompraFinalizada extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CompraFinalizada frame = new CompraFinalizada();
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
	public CompraFinalizada() {
		setType(Type.POPUP);
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\yamil\\eclipse-workspace\\ProjetoMtp\\src\\img\\060-assassins-creed.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 365);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(0, 66, 424, 2);
		contentPane.add(separator);
		
		JLabel lblNewLabel = new JLabel("Compra finalizada!!");
		lblNewLabel.setFont(new Font("Yu Gothic Medium", Font.BOLD, 19));
		lblNewLabel.setBounds(10, 11, 414, 44);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("OK");
		btnNewButton.setBounds(167, 257, 65, 44);
		contentPane.add(btnNewButton);
	}
}
