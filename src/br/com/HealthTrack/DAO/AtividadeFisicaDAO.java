package br.com.HealthTrack.DAO;

import java.util.List;
import java.util.ArrayList;
import br.com.HealthTrack.Entity.*;

/**
 * Classe DAO da entidade AtividadeFisicaEntity
 * @author Andrea Serpeloni - aserpeloni@hotmail.com
 * @author Fernando Grieco Feres - fegferes@gmail.com
 * @author Gabriel Silva Marçal - gmarcal6@gmail.com
 * @author Herbert de Souza Souto - herbert-93@hotmail.com
 * @author Jaelson Apolinário de Oliveira - jaelson.apolinario@gmail.com
 * 
 * @version 1.0
 */
public class AtividadeFisicaDAO {
	
	private List<AtividadeFisicaEntity> listaMOC;
	
	/**
	 * Cria uma instancia de AtividadeFisicaDAO
	 */
	public AtividadeFisicaDAO()
	{
		listaMOC = new ArrayList<AtividadeFisicaEntity>();
		listaMOC.add(new AtividadeFisicaEntity(101, "Corrida"));
		listaMOC.add(new AtividadeFisicaEntity(102, "Natação"));
		listaMOC.add(new AtividadeFisicaEntity(103, "Cliclismo"));
		listaMOC.add(new AtividadeFisicaEntity(104, "Surf"));
		listaMOC.add(new AtividadeFisicaEntity(105, "Triatlon"));
		listaMOC.add(new AtividadeFisicaEntity(106, "Musculação"));
		listaMOC.add(new AtividadeFisicaEntity(107, "Bike"));
		listaMOC.add(new AtividadeFisicaEntity(108, "Tênis"));
		listaMOC.add(new AtividadeFisicaEntity(109, "Yoga"));
		listaMOC.add(new AtividadeFisicaEntity(110, "Futebol"));
		listaMOC.add(new AtividadeFisicaEntity(111, "Volei"));
		listaMOC.add(new AtividadeFisicaEntity(112, "Basquete"));
	}
	
	/**
	 * Retorna todos os itens
	 * @return ArrayList lista de itens do DAO
	 */
	public ArrayList<AtividadeFisicaEntity> getAll() {
		return (ArrayList)listaMOC;
	}

}
