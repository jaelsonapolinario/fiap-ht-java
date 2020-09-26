package br.com.HealthTrack.App;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.Optional;

import br.com.HealthTrack.Entity.AtividadeFisicaEntity;

/**
 * Classe de controle de Exercicio
 * @author Jaelson Apolinario
 * @version 1.0
 */
public class ControleCadExercicio {
	private ArrayList<Exercicio> lista;
	private ArrayList<AtividadeFisicaEntity> listaAtividade;
	
	/**
	 * Cria uma instancia de ControleCadExercicio
	 */
	public ControleCadExercicio() {
		lista = new ArrayList<Exercicio>();
		listaAtividade = new ArrayList<AtividadeFisicaEntity>();
	}
	
	/**
	 * Cadastra um Exercicio
	 * @param usuario usuario autenticado
	 * @param atividade descricao atividade
	 * @param tempoExecutado em minutos
	 */
	public void cadastrar(Usuario usuario, String atividade, int tempoExecutado) {
		LocalDateTime hoje = LocalDateTime.now();
		Date dtHoje = Date.from(hoje.atZone(ZoneId.systemDefault()).toInstant());
		lista.add(new Exercicio(usuario, consultarAtividadeFisica(atividade), tempoExecutado, dtHoje));
	}
	
	/**
	 * Retorna objeto AtividadeFisica ou cria um novo caso nao seja encontrado
	 * @param atividade descricao atividade
	 * @return AtividadeFisica objeto
	 */
	public AtividadeFisicaEntity consultarAtividadeFisica(String atividade) {
		Optional<AtividadeFisicaEntity> resultado = listaAtividade.stream().filter(x -> x.getDescricao() == atividade).findFirst();
		
		if(resultado.isPresent()) {
			return resultado.get();
		}
		else {
			AtividadeFisicaEntity novoItem = new AtividadeFisicaEntity(listaAtividade.size() + 1, atividade);
			listaAtividade.add(novoItem);
			return novoItem;
		}
	}
}
