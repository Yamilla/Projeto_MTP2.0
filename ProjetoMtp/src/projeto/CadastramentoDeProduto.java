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

	//CRIAÇÃO DE FRAME
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
		textField.setBounds(66, 11, 349, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblDescrio = new JLabel("Descri\u00E7\u00E3o");
		lblDescrio.setBounds(10, 42, 68, 14);
		contentPane.add(lblDescrio);
		
		textField_1 = new JTextField();
		textField_1.setBounds(66, 42, 349, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblPreo = new JLabel("Valor");
		lblPreo.setBounds(10, 73, 46, 14);
		contentPane.add(lblPreo);
		
		textField_2 = new JTextField();
		textField_2.setBounds(66, 73, 86, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		
		//MÉTODO PARA INSERIR IMAGEM NO BD	
		/*JButton btnNewButton = new JButton("Cadastrar produto");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent ev1) {
				JLabel label = new JLabel("");
				Conexao conn = new Conexao();
				conn.conectar();
				String caminho = label.getIcon().toString();
				InputStream fs;
				File file = new File(caminho);
				try {					
					fs = new FileInputStream(file);
					PreparedStatement ps = conn.prepareStatement("INSERT INTO produto (nome,foto) VALUES (?,?)");
					String nome = textField.getText();
					
					ps.setString(1, nome);
					ps.setBinaryStream(2, fs, (int)file.length());
					ps.executeUpdate();
					ps.close();
					fs.close();	
			
					
			} catch(FileNotFoundException ex){
				Logger.getLogger(CadastramentoDeProduto.class.getName()).log(Level.SEVERE, null, ex);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				Logger.getLogger(CadastramentoDeProduto.class.getName()).log(Level.SEVERE, null, e);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				Logger.getLogger(CadastramentoDeProduto.class.getName()).log(Level.SEVERE, null, e);
			}
			}
		});
		
		*/
		//btnNewButton.setBackground(new Color(240, 240, 240));
		//btnNewButton.setBounds(158, 476, 153, 23);
		//contentPane.add(btnNewButton);
		
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
						file.showOpenDialog(label );
						label.setIcon(new ImageIcon(file.getSelectedFile().getPath()));
						label.setText(file.getSelectedFile().getPath());
						
					}catch(Exception e) {
							label.setIcon(new ImageIcon("C:\\Desktop\\Imagens Projeto MTP\\produtos\\camiseta.jpg"));
					}
				}
			}
		});
	
		btnBuscarFoto.setBounds(10, 465, 153, 23);
		contentPane.add(btnBuscarFoto);
		
		JLabel label = new JLabel("");
		label.setToolTipText("");
		label.setBackground(SystemColor.controlDkShadow);
		label.setBounds(477, 414, -470, -322);
		contentPane.add(label);
		
		JButton btnGravarNoBd = new JButton("Gravar no BD");
		btnGravarNoBd.addActionListener(new ActionListener() {
			
			//GRAVAR NO BD
			public void actionPerformed(ActionEvent arg0) {
			try {
				InserirProduto prod = new InserirProduto();
				byte[] d;
				//prod.setImage(ManipularImagem.getImBytes(d));
				Conexao conn = new Conexao();
				Boolean foi = conn.inserirProduto(prod);
				if(foi) {
					JOptionPane.showMessageDialog(rootPane,"foi");
				}else {
					JOptionPane.showMessageDialog(rootPane," n foi");
				}
				
				
			}catch(Exception ex){
				ex.printStackTrace();
			}
				
				
				
			}
		});
		btnGravarNoBd.setBounds(293, 465, 153, 23);
		contentPane.add(btnGravarNoBd);
		}
	
}
