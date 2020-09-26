/**
 * 
 */
package br.com.HealthTrack.App;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.Optional;

/**
 * Classe de controle de Dieta
 * @author Jaelson Apolinario
 * @version 1.0
 */
public class ControleCadDieta {
	private ArrayList<Dieta> lista;
	private ArrayList<Refeicao> listaRefeicao;
	
	/**
	 * Cria uma instancia de ControleCadDieta
	 */
	public ControleCadDieta() {
		lista = new ArrayList<Dieta>();
		listaRefeicao = new ArrayList<Refeicao>();
	}
	
	/**
	 * Cadastra uma Dieta
	 * @param usuario usuario autenticado
	 * @param refeicao descricao refeicao
	 * @param calorias quantidade de calorias da refeicao
	 */
	public void cadastrar(Usuario usuario, String refeicao, double calorias) {
		LocalDateTime hoje = LocalDateTime.now();
		Date dtHoje = Date.from(hoje.atZone(ZoneId.systemDefault()).toInstant());
		lista.add(new Dieta(usuario, consultarRefeicao(refeicao), calorias, dtHoje));
	}
	
	/**
	 * Retorna objeto Refeicao ou cria um novo caso nao seja encontrado
	 * @param refeicao descricao da reifeicao
	 * @return Refeicao objeto
	 */
	public Refeicao consultarRefeicao(String refeicao) {
		Optional<Refeicao> resultado = listaRefeicao.stream().filter(x -> x.getDescricao() == refeicao).findFirst();
		
		if(resultado.isPresent()) {
			return resultado.get();
		}
		else {
			Refeicao novoItem = new Refeicao(listaRefeicao.size() + 1, refeicao);
			listaRefeicao.add(novoItem);
			return novoItem;
		}
	}
}
