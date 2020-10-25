package br.com.HealthTrack.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import br.com.HealthTrack.Entity.*;
import br.com.HealthTrack.Interface.*;
import br.com.HealthTrack.Singleton.ConnectionManager;

public class ExercicioDAO implements DAOInterface {
	private Connection conexao;

	@Override
	public void insert(EntityInterface entity) {
		// TODO Auto-generated method stub
		ExercicioEntity dado = (ExercicioEntity) entity;
		PreparedStatement stmt = null;
		try {
			conexao = ConnectionManager.getInstance().getConnection();
			String sql = "INSERT INTO T_HT_EXEC "
					+ "(ID, T_HT_USUARIO_CD_USUARIO, T_HT_AT_FISICA_CD_ATIVIDADE, VL_TEMPO_EXEC, DT_DATA) " + "VALUES "
					+ "(SQ_EXEC.NEXTVAL, ?, ?, ?, ? )";
			stmt = conexao.prepareStatement(sql);
			stmt.setInt(1, dado.getUsuario().getCodigo());
			stmt.setInt(2, dado.getAtividade().getCodigo());
			stmt.setInt(3, dado.getTempoExecutado());
			java.sql.Date data = new java.sql.Date(dado.getData().getTimeInMillis());
			stmt.setDate(4, data);

			stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				stmt.close();
				conexao.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	@Override
	public List<EntityInterface> getAll() {
		List<EntityInterface> lista = new ArrayList<EntityInterface>();
		PreparedStatement stmt = null;
		ResultSet rs = null;
		try {
			conexao = ConnectionManager.getInstance().getConnection();
			stmt = conexao.prepareStatement("SELECT * FROM T_HT_EXEC EX, T_HT_AT_FISICA AF, T_HT_USUARIO US "
					+ "WHERE AF.CD_ATIVIDADE = EX.T_HT_AT_FISICA_CD_ATIVIDADE "
					+ " AND US.CD_USUARIO = EX.T_HT_USUARIO_CD_USUARIO");
			rs = stmt.executeQuery();

			while (rs.next()) {
				int codigo = rs.getInt("CD_ATIVIDADE");
				String descricao = rs.getString("DS_ATIVIDADE");
				
				EntityInterface usuario = getUsuarioFromResultSet(rs);
				EntityInterface atividadeFisica = getAtividadeFisicaFromResultSet(rs);
				
			   java.sql.Date data = rs.getDate("DT_DATA");
	           Calendar dataCalendar = Calendar.getInstance();
	           dataCalendar.setTimeInMillis(data.getTime());
				EntityInterface dado = new ExercicioEntity((UsuarioEntity)usuario, (AtividadeFisicaEntity)atividadeFisica, rs.getInt("VL_TEMPO_EXEC"),dataCalendar);
				lista.add(dado);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				stmt.close();
				rs.close();
				conexao.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return lista;
	}
	
	private UsuarioEntity getUsuarioFromResultSet(ResultSet rs) throws SQLException {
		int codigo = rs.getInt("CD_USUARIO");
		String nome = rs.getString("NM_NOME");
		String sobrenome = rs.getString("NM_SOBRENOME");
		String email = rs.getString("DS_EMAIL");
		String celular = rs.getString("NR_CELULAR");
		
		java.sql.Date data = rs.getDate("DT_NASCIMENTO");
	    Calendar dataNascimento = Calendar.getInstance();
	    dataNascimento.setTimeInMillis(data.getTime());
	    
	    String senha = rs.getString("VL_SENHA");
	    boolean ativo = rs.getBoolean("ST_ATIVO");
	    
		return new UsuarioEntity(codigo, nome, sobrenome, email, celular, dataNascimento, senha, ativo);
	}
	
	private AtividadeFisicaEntity getAtividadeFisicaFromResultSet(ResultSet rs) throws SQLException {
		int codigo = rs.getInt("CD_ATIVIDADE");
		String descricao = rs.getString("DS_ATIVIDADE");

		return new AtividadeFisicaEntity(codigo, descricao);
	}

}
