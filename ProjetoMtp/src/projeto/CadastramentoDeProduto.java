package projeto;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.GraphicsConfiguration;
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
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
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
	private JTextField textField_3;
	private File foto;

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

	//CRIAÇÃO DE FRAME
	public CadastramentoDeProduto() {
		
		foto = null;
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
		lblProduto.setBounds(10, 14, 56, 20);
		contentPane.add(lblProduto);
		
		textField = new JTextField();
		textField.setBounds(76, 11, 349, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblDescrio = new JLabel("Descri\u00E7\u00E3o");
		lblDescrio.setBounds(10, 42, 68, 20);
		contentPane.add(lblDescrio);
		
		textField_1 = new JTextField();
		textField_1.setBounds(76, 42, 349, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblPreo = new JLabel("Pre\u00E7o Custo");
		lblPreo.setBounds(119, 91, 86, 14);
		contentPane.add(lblPreo);
		
		textField_2 = new JTextField();
		textField_2.setBounds(215, 88, 86, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		

		//MÉTODO PARA BUSCAR A IMAGEM DE UM PRODUTO
		btnBuscarFoto = new JButton("Buscar Foto");
		btnBuscarFoto.addActionListener(new ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent ev2) {
				JLabel label = new JLabel("");
				label.setBounds(71, 101, 349, 231);
				contentPane.add(label);
				
				if(ev2.getSource()==btnBuscarFoto) {
					try {					
						JFileChooser file = new JFileChooser();
						file.setCurrentDirectory(new File("/produtos")); 
						file.setDialogTitle("Imagem do Produto");
						file.showOpenDialog(label);
						if(file.getSelectedFile()!=null)
						foto = file.getSelectedFile();
						
						
				
						else {
							JOptionPane.showMessageDialog(null," ");
						}
						
						label.setIcon(new ImageIcon(file.getSelectedFile().getPath()));
						
						label.setIcon(new ImageIcon());
						
					}catch(Exception e) {
							label.setIcon(new ImageIcon("C:\\Desktop\\Imagens Projeto MTP\\produtos\\camiseta.jpg"));
					}
				}
			}
		});
	
		btnBuscarFoto.setBounds(10, 465, 153, 23);
		contentPane.add(btnBuscarFoto);
		
		JLabel label = new JLabel("SEM IMAGEM");
		label.setIcon(new ImageIcon("C:\\Users\\yamil\\Desktop\\Imagens Projeto MTP\\download.png"));
		label.setToolTipText("");
		label.setBackground(SystemColor.controlDkShadow);
		label.setBounds(339, 401, -192, -134);
		contentPane.add(label);
		
		JButton btnGravarNoBd = new JButton("Cadastrar");
		btnGravarNoBd.addActionListener(new ActionListener() {
			//GRAVAR NO BD			
			public void actionPerformed(ActionEvent arg0) {
				if(foto!=null) {
					try {
					Conexao conexao = new Conexao();
					InserirProduto prod = new InserirProduto();
					conexao.inserirProduto(textField.getText(), textField_1.getText(), Float.parseFloat(textField_2.getText()), Float.parseFloat(textField_3.getText()), foto);
					foto=null;
					}catch(Exception ex){
					ex.printStackTrace();
					}
					dispose();
					
				}
			}
		});
		
		
		
		
		btnGravarNoBd.setBounds(293, 465, 153, 23);
		contentPane.add(btnGravarNoBd);
		
		JLabel lblPreoVenda = new JLabel("Pre\u00E7o Venda");
		lblPreoVenda.setBounds(119, 135, 79, 14);
		contentPane.add(lblPreoVenda);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(215, 132, 86, 20);
		contentPane.add(textField_3);
		}
}
