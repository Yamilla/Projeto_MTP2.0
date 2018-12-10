package projeto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

import javax.swing.JOptionPane;

public class Conexao  {

	private String url = "jdbc:postgresql://localhost:5433/comercio";
	private String usuario = "postgres";
	private String senha = "mylla";
	public Connection conn;
	public Conexao () {
		conectar();
	}
	public void conectar() {
		try {
			Class.forName("org.postgresql.Driver");
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		}
		
		Properties props = new Properties();
		props.setProperty("user", this.usuario);
		props.setProperty("password", this.senha);
		
		try {
			this.conn = DriverManager.getConnection(this.url, props);
			if(this.conn==null) {
				System.out.println("");
			}
		} catch (SQLException e) {
			e.getMessage();
		}
	}
	// Metodo que retorna a conexão feita com o BD	
	public Connection getConnection() {
		return this.conn;
	}
	public void inserir(String nome, String email,String senha, String endereco, String cidade, String uf)  {		
		try {
			PreparedStatement d = this.conn.prepareStatement("INSERT INTO pessoa (nome ,email ,senha,endereco,cidade,uf) VALUES ( ?, ? , ?, ? , ?, ? )");
			d.setString(1, nome);
			d.setString(2,email);
			d.setString(3,senha);
			d.setString(4,endereco);
			d.setString(5,cidade);
			d.setString(6,uf);			
			d.executeUpdate();
			d.close();
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null , e , "Erro" , JOptionPane.ERROR_MESSAGE);
			e.printStackTrace();
		}
	}
	public void atualizar() {
		try {
			PreparedStatement st = this.conn.prepareStatement("UPDATE pessoa SET nome = ?");
			st.setString(1, "Thiago 2");
			st.executeUpdate();
			st.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public void excluir() {
		try {
			PreparedStatement st = this.conn.prepareStatement("DELETE FROM pessoa WHERE id = ?");
			st.setInt(1, 1);
			st.executeUpdate();
			st.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	//INSERIR PRODUTO
	public Boolean inserirProduto(InserirProduto produto) {
		
		Boolean retorno = false;
		String sql = "INSERT INTO exemplo (image) values (?)";
		PreparedStatement pst = Conexao.getPreparedStatement(sql);
		
		try {
			
			pst.setBytes(1, produto.getImage());
			retorno = pst.execute();
			
			
			
			
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		
		
		
		
		
		return retorno;
	}
	private static PreparedStatement getPreparedStatement(String sql) {
		
		return null;
	}
	
	
}

	//

	
