package projeto;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JButton;
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

}
