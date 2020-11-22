/**
 * 
 */
package br.com.HealthTrack.App;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.Optional;
import br.com.HealthTrack.Entity.*;

/**
 * Classe de controle de Dieta
 * @author Jaelson Apolinario
 * @version 1.0
 */
public class ControleCadDieta {
	private ArrayList<DietaEntity> lista;
	private ArrayList<RefeicaoEntity> listaRefeicao;
	
	/**
	 * Cria uma instancia de ControleCadDieta
	 */
	public ControleCadDieta() {
		lista = new ArrayList<DietaEntity>();
		listaRefeicao = new ArrayList<RefeicaoEntity>();
	}
	
	/**
	 * Cadastra uma Dieta
	 * @param usuario usuario autenticado
	 * @param refeicao descricao refeicao
	 * @param calorias quantidade de calorias da refeicao
	 */
	public void cadastrar(UsuarioEntity usuario, String refeicao, double calorias) {
		LocalDateTime hoje = LocalDateTime.now();
		Date dtHoje = Date.from(hoje.atZone(ZoneId.systemDefault()).toInstant());
		lista.add(new DietaEntity(usuario, consultarRefeicao(refeicao), calorias, dtHoje));
	}
	
	/**
	 * Retorna objeto Refeicao ou cria um novo caso nao seja encontrado
	 * @param refeicao descricao da reifeicao
	 * @return Refeicao objeto
	 */
	public RefeicaoEntity consultarRefeicao(String refeicao) {
		Optional<RefeicaoEntity> resultado = listaRefeicao.stream().filter(x -> x.getDescricao() == refeicao).findFirst();
		
		if(resultado.isPresent()) {
			return resultado.get();
		}
		else {
			RefeicaoEntity novoItem = new RefeicaoEntity(listaRefeicao.size() + 1, refeicao);
			listaRefeicao.add(novoItem);
			return novoItem;
		}
	}
}
