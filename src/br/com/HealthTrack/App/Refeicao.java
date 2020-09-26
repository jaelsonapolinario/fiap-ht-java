package br.com.HealthTrack.App;

/**
 * Classe que abstrai uma refeicao
 * @author Jaelson Apolinario
 * @version 1.0
 */
public class Refeicao {

	private int codigo;
	private String descricao;
	
	/**
	 * Cria uma instancia de Refeicao
	 * @param codigo codigo da refeicao
	 * @param descricao descricao da refeicao
	 */
	public Refeicao(int codigo, String descricao) {
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
