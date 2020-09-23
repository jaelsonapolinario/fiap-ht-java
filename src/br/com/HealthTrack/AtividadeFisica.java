/**
 * 
 */
package br.com.HealthTrack;

/**
 * Classe que abstrai uma atividade fisica
 * @author Jaelson Apolinario
 * @version 1.0
 */
public class AtividadeFisica {
	private int codigo;
	private String descricao;
	
	
	/**
	 * Cria uma instancia de AtividadeFisica
	 * @param codigo codigo da atividade
	 * @param descricao descricao da atividade
	 */
	public AtividadeFisica(int codigo, String descricao) {
		super();
		this.codigo = codigo;
		this.descricao = descricao;
	}

	/**
	 * Retorna o codigo
	 * @return codigo
	 */
	public int getCodigo() {
		return codigo;
	}
	
	/**
	 * Atribui valor ao codigo
	 * @param codigo
	 */
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	/**
	 * Retorna a descricao
	 * @return descricao
	 */
	public String getDescricao() {
		return descricao;
	}
	
	/**
	 * Atribui valor a descricao
	 * @param descricao
	 */
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
}
