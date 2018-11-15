package projeto;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.List;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JFrame;
import javax.swing.JLabel;

@SuppressWarnings("serial")
public class ListaPessoa extends JFrame {
	
	// componente AWT List
	private List lista = new List();
	
	// conexão com o banco de dados
	Conexao con;
	
	public ListaPessoa() {
		super("Lista de Pessoas");
		setLayout(new FlowLayout());
		
		// inicio a conexão com o banco de dados
		con = new Conexao();
		
		try {
			// chamo o método preencherLista
			preencherLista();
		} catch (SQLException e) {
			// se der erro, imprimo um label na tela com o erro
			JLabel error = new JLabel("Erro ao preencher a lista");
			error.setPreferredSize(new Dimension(200, 100));
			add(error);
		}
		
		add(lista);
		
		pack();
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	/**
	 * Método que preenche a lista AWT com os nomes do banco de dados
	 * 
	 * @throws SQLException
	 */
	private void preencherLista() throws SQLException {
		// preparo a consulta
		PreparedStatement st = con.getConnection().prepareStatement("SELECT nome FROM pessoa");
		ResultSet rs = st.executeQuery();
		while (rs.next()) {
			// para cada valor retornado do banco de dados, adiciono na lista
			lista.add(rs.getString(1));
		}		
	}

}
