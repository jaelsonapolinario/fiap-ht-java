package br.com.HealthTrack.Teste;

import br.com.HealthTrack.DAO.*;
import br.com.HealthTrack.Entity.*;

public class TesteApp {

	public static void main(String[] args) {
		// Teste FASE6 CAP2
		AtividadeFisicaDAO objDAO = new AtividadeFisicaDAO();
		for(AtividadeFisicaEntity item : objDAO.getAll()){
            System.out.println(item.getCodigo() +" - " +item.getDescricao());
        }

	}

}
