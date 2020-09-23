package br.com.HealthTrack;

import java.util.Date;

/**
 * Classe que abstrai uma anatomia
 * @author Jaelson Apolinario
 * @version 1.0
 */
public class Anatomia {
	private Usuario usuario;
	private double altura;
	private double peso;
	private Date data;
	
	/**
	 * Cria uma instancia de Anatomia
	 * @param usuario usuario que possui essa anatomia
	 * @param altura altura do usuario
	 * @param peso peso do usuario
	 * @param data data do momento da criacao do dado
	 */
	public Anatomia(Usuario usuario, double altura, double peso, Date data) {
		super();
		this.usuario = usuario;
		this.altura = altura;
		this.peso = peso;
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
	 * Atribui um valor para usuario
	 * @param usuario
	 */
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	/**
	 * Retorna a altura
	 * @return altura
	 */
	public double getAltura() {
		return altura;
	}

	/**
	 * Atribui um valor a altura
	 * @param alturat
	 */
	public void setAltura(double altura) {
		this.altura = altura;
	}

	/**
	 * Retorna o peso
	 * @return peso
	 */
	public double getPeso() {
		return peso;
	}

	/**
	 * Atribui um valor a peso
	 * @param peso
	 */
	public void setPeso(double peso) {
		this.peso = peso;
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
