package br.com.HealthTrack.App;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;

/**
 * Classe de controle de Anatomia
 * @author Jaelson Apolinario
 * @version 1.0
 */
public class ControleCadAnatomia {
	
	private ArrayList<Anatomia> lista;
	
	/**
	 * Cria uma instancia de ControleCadAnatomia
	 */
	public ControleCadAnatomia() {
		lista = new ArrayList<Anatomia>();
	}
	
	/**
	 * Cadastra uma anatomia
	 * @param usuario usuario autenticado
	 * @param altura altura do usuario
	 * @param peso peso do usuario
	 */
	public void cadastrar(Usuario usuario, double altura, double peso) {
		LocalDateTime hoje = LocalDateTime.now();
		Date dtHoje = Date.from(hoje.atZone(ZoneId.systemDefault()).toInstant());
		lista.add(new Anatomia(usuario, peso, altura, dtHoje));
	}
}
