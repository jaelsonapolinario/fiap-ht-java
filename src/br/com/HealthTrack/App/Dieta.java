package br.com.HealthTrack.App;

import java.util.Date;

/**
 * Classe que abstrai uma dieta
 * @author Jaelson Apolinario
 * @version 1.0
 */
public class Dieta {
	private Usuario usuario;
	private Refeicao refeicao;
	private double calorias;
	private Date data;
	
	/**
	 * Cria uma instancia de Dieta
	 * @param usuario usuario que possui essa dieta
	 * @param refeicao descricao refeicao
	 * @param calorias quantidade de calorias da refeicao
	 * @param data data da criacao do dado
	 */
	public Dieta(Usuario usuario, Refeicao refeicao, double calorias, Date data) {
		super();
		this.usuario = usuario;
		this.refeicao = refeicao;
		this.calorias = calorias;
		this.data = data;
	}
	
	/**
	 * Retorna o usuario
	 * @return the usuario
	 */
	public Usuario getUsuario() {
		return usuario;
	}
	
	/**
	 * Atribui um valor a usuario
	 * @param usuario the usuario to set
	 */
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	/**
	 * Retorna a refeicao
	 * @return the refeicao
	 */
	public Refeicao getRefeicao() {
		return refeicao;
	}
	
	/**
	 * Atribui um valor a refeicao
	 * @param refeicao
	 */
	public void setRefeicao(Refeicao refeicao) {
		this.refeicao = refeicao;
	}
	
	/**
	 * Retorna a calorias
	 * @return calorias
	 */
	public double getCalorias() {
		return calorias;
	}
	
	/**
	 * Atribui um valor a caloria
	 * @param calorias
	 */
	public void setCalorias(double calorias) {
		this.calorias = calorias;
	}
	
	/**
	 * Retorna a data
	 * @return data
	 */
	public Date getData() {
		return data;
	}
	
	/**
	 * Atribui um valor a data
	 * @param data 
	 */
	public void setData(Date data) {
		this.data = data;
	}
	
	
	
}
