package projeto;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Window.Type;
import javax.swing.JEditorPane;
import javax.swing.JSeparator;
import java.awt.Color;
import javax.swing.JTextPane;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Component;

public class Inicio extends JFrame implements ActionListener {

	private JPanel contentPane;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Inicio frame = new Inicio();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			
		});		
	}
	
	JButton btnNewButton = new JButton("Cadastrar");
	JButton btnNewButton_1 = new JButton("Login");
	public Inicio() {
		setBackground(Color.DARK_GRAY);
		setForeground(new Color(0, 0, 51));
		setType(Type.POPUP);
		setFont(new Font("Segoe Script", Font.PLAIN, 12));
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\yamil\\Desktop\\033-super-mario.png"));
		setTitle("STUDIO GEEK");
		setResizable(false);
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 648, 454);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 102));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setBounds(154, 366, 109, 38);
		
		
		btnNewButton.setFont(new Font("Segoe Print", Font.BOLD | Font.ITALIC, 14));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		contentPane.setLayout(null);
		contentPane.add(btnNewButton);
		
		btnNewButton.addActionListener(this) ;
		btnNewButton_1.setBounds(414, 366, 89, 38);
		btnNewButton_1.addActionListener(this) ;
			
		
		
		btnNewButton_1.setFont(new Font("Segoe Print", Font.BOLD | Font.ITALIC, 14));
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\yamil\\Desktop\\GEEK-LOGO.jpg"));
		lblNewLabel_1.setBounds(0, 0, 632, 415);
		contentPane.add(lblNewLabel_1);
		setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{contentPane, btnNewButton, btnNewButton_1, lblNewLabel_1}));
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		if(arg0.getSource()==btnNewButton) {
			
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						Cadastro frame = new Cadastro() ;
						frame.setVisible(true);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
			
			
		}
		
		if(arg0.getSource()==btnNewButton_1) {
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
	
	}
}
