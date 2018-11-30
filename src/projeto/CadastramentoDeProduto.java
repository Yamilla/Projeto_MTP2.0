package projeto;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JToggleButton;
import java.awt.Window.Type;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionListener;
import java.io.File;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import java.awt.SystemColor;
import javax.swing.UIManager;

public class CadastramentoDeProduto extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JButton btnBuscarFoto;

	/**
	 *Lançamento da aplicação
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
	 * Criação do Frame
	 */
	public CadastramentoDeProduto() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\yamil\\Desktop\\Imagens Projeto MTP\\055-batman.png"));
		setTitle("Cadastramento de Produtos");
		setType(Type.POPUP);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 498, 549);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblProduto = new JLabel("Produto");
		lblProduto.setBounds(10, 14, 46, 14);
		contentPane.add(lblProduto);
		
		textField = new JTextField();
		textField.setBounds(88, 11, 349, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblDescrio = new JLabel("Descri\u00E7\u00E3o");
		lblDescrio.setBounds(10, 42, 68, 14);
		contentPane.add(lblDescrio);
		
		textField_1 = new JTextField();
		textField_1.setBounds(88, 39, 349, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblPreo = new JLabel("Valor");
		lblPreo.setBounds(10, 73, 46, 14);
		contentPane.add(lblPreo);
		
		textField_2 = new JTextField();
		textField_2.setBounds(88, 70, 104, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnNewButton = new JButton("Cadastrar produto");
		btnNewButton.setBackground(new Color(240, 240, 240));
		btnNewButton.setBounds(158, 476, 153, 23);
		contentPane.add(btnNewButton);
		//MÉTODO PARA BUSCAR A IMAGEM DE UM PRODUTO
		btnBuscarFoto = new JButton("Buscar Foto");
		btnBuscarFoto.addActionListener(new ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent ev2) {
				JLabel label = new JLabel("");
				label.setBounds(71, 101, 349, 231);
				contentPane.add(label);
				//VERIFICAR SE ESSE IF É NECESSÁRIO
				if(ev2.getSource()==btnBuscarFoto) {
					try {					
						JFileChooser file = new JFileChooser();
						file.setCurrentDirectory(new File("/produtos")); //ACREDITO NÃO ESTÁ FUNCIONANDO
						file.setDialogTitle("Imagem do Produto");
						file.showOpenDialog(label);
						label.setIcon(new ImageIcon(file.getSelectedFile().getPath()));
						label.setText(file.getSelectedFile().getPath());
						
					}catch(Exception e) {
							label.setIcon(new ImageIcon("C:\\Desktop\\Imagens Projeto MTP\\produtos\\camiseta.jpg"));
					}
				}
			}
		});
		btnBuscarFoto.setBounds(158, 442, 153, 23);
		contentPane.add(btnBuscarFoto);
		
		JLabel label = new JLabel("");
		label.setToolTipText("");
		label.setBackground(SystemColor.controlDkShadow);
		label.setBounds(457, 356, -425, -225);
		contentPane.add(label);
	}
}
