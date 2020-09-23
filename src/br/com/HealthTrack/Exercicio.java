package br.com.HealthTrack;

import java.util.Date;

/**
 * Classe que abstrai um exercicio
 * @author Jaelson Apolinario
 * @version 1.0
 */
public class Exercicio {
	private Usuario usuario;
	private AtividadeFisica atividade;
	private int tempoExecutado;
	private Date data;
	
	/**
	 * Cria uma instancia de Exercicio
	 * @param usuario usuario que executou o exercicio
	 * @param atividade descricao atividade fisica
	 * @param tempoExecutado quantidade de tempo executado em minutos
	 * @param data data da criacao do dado
	 */
	public Exercicio(Usuario usuario, AtividadeFisica atividade, int tempoExecutado, Date data) {
		this.usuario = usuario;
		this.atividade = atividade;
		this.tempoExecutado = tempoExecutado;
		this.data = data;
	}

	/**
	 * Retorna o usuario
	 * @return usuario
	 */
	public Usuario getUsuario() {
		return usuario;
	}

	/**
	 * Atribui um valor a usuario
	 * @param usuario
	 */
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	/**
	 * Retorna a atividade
	 * @return atividade
	 */
	public AtividadeFisica getAtividade() {
		return atividade;
	}

	/**
	 * Atribui um valor a atividade
	 * @param atividade
	 */
	public void setAtividade(AtividadeFisica atividade) {
		this.atividade = atividade;
	}

	/**
	 * Retorna o tempoExecutado
	 * @return tempoExecutado
	 */
	public int getTempoExecutado() {
		return tempoExecutado;
	}

	/**
	 * Atribui um valor a tempoExecutado
	 * @param tempoExecutado 
	 */
	public void setTempoExecutado(int tempoExecutado) {
		this.tempoExecutado = tempoExecutado;
	}

	/**
	 * Retorna a data
	 * @return data
	 */
	public Date getData() {
		return data;
	}

	/**
	 * Atrobui um valor a data
	 * @param data
	 */
	public void setData(Date data) {
		this.data = data;
	}
	
	
}
