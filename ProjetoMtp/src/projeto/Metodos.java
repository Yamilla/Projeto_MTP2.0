package projeto;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Metodos {
	
	//VALIDAR BOTÃO CASO O USUARIO FOR ADM		
	public void ativarAdm (int idpessoa){
			boolean administrador = false;
			JButton btnCadastrarProd = null;
			try {
				PreparedStatement st = Conexao.conn.prepareStatement("SELECT administrador FROM pessoa WHERE idpessoa = ?");					
				st.setInt(1, idpessoa);
				ResultSet rs = st.executeQuery();
				
				if(rs.next()){
					administrador = rs.getBoolean(1);						
				}
				
				if (administrador) {
					btnCadastrarProd.setVisible(true);
				}
				else {
					btnCadastrarProd.setVisible(false);
				}
			}catch(Exception n){
				JOptionPane.showMessageDialog(null,"");
			
			}
		}

	//METODO PARA MOSTRAR O NOME DO USUARIO NA TELA DE PRODUTOS
	public String mostrarUsuario (int idpessoa){
		String usuario = null;
		try {
			PreparedStatement st = Conexao.conn.prepareStatement("SELECT nome FROM pessoa WHERE idpessoa = ?");
			st.setInt(1, idpessoa);
			ResultSet rs = st.executeQuery();
			if(rs.next()) {			
			usuario =rs.getString(1);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return usuario;
	}
	
	//INSERIR NO CARRINHO
	public void inserirCarrinho(int idproduto, int idpessoa, int quantidade){
		int qntd = 0;
		try {
			PreparedStatement st = Conexao.conn.prepareStatement("SELECT quantidade FROM carrinho WHERE idproduto = ? AND idpessoa = ?");
			st.setInt(1, idproduto);
			st.setInt(2, idpessoa);
			ResultSet rs = st.executeQuery();
			while(rs.next()) {
				qntd+=1;
			}
			rs.close();
			st.close();
			if(qntd == 0) {
				Conexao.inserirNoCarrinho(idproduto, idpessoa, quantidade);
			}else {
				st = Conexao.conn.prepareStatement("UPDATE carrinho SET quantidade = quantidade + ? WHERE idproduto = ? AND idpessoa = ?");
				st.setInt(1, quantidade);
				st.setInt(2, idproduto);
				st.setInt(3, idpessoa);
			} 
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		
		
	}//FIM METODO
	
	
	private void setText(String string) {
	}
	
}
