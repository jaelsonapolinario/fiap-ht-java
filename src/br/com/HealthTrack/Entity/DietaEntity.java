package br.com.HealthTrack.Entity;

import java.util.Date;
import br.com.HealthTrack.Interface.EntityInterface;

/**
 * Classe que abstrai uma dieta
 * @author Jaelson Apolinario
 * @version 1.0
 */
public class DietaEntity implements EntityInterface {
	private UsuarioEntity usuario;
	private RefeicaoEntity refeicao;
	private double calorias;
	private Date data;
	
	/**
	 * Cria uma instancia de Dieta
	 * @param usuario usuario que possui essa dieta
	 * @param refeicao descricao refeicao
	 * @param calorias quantidade de calorias da refeicao
	 * @param data data da criacao do dado
	 */
	public DietaEntity(UsuarioEntity usuario, RefeicaoEntity refeicao, double calorias, Date data) {
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
	public UsuarioEntity getUsuario() {
		return usuario;
	}
	
	/**
	 * Atribui um valor a usuario
	 * @param usuario the usuario to set
	 */
	public void setUsuario(UsuarioEntity usuario) {
		this.usuario = usuario;
	}
	
	/**
	 * Retorna a refeicao
	 * @return the refeicao
	 */
	public RefeicaoEntity getRefeicao() {
		return refeicao;
	}
	
	/**
	 * Atribui um valor a refeicao
	 * @param refeicao
	 */
	public void setRefeicao(RefeicaoEntity refeicao) {
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