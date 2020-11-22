package br.com.HealthTrack.Teste;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import br.com.HealthTrack.Entity.*;
import br.com.HealthTrack.Interface.*;
import br.com.HealthTrack.DAO.*;

public class TesteApp {

	public static void main(String[] args) {
		
		
		// Teste FASE6 CAP8
		//AtividadeFisica
		DAOInterface objDAO = new AtividadeFisicaDAO();
		EntityInterface atividadeFisica = null;
		objDAO.insert(new AtividadeFisicaEntity(1,"teste444"));
		
		for(EntityInterface item : objDAO.getAll()){
			AtividadeFisicaEntity entity = (AtividadeFisicaEntity)item;
            System.out.println(entity.toString());
            
            if(atividadeFisica == null)
            	atividadeFisica = entity;
        }
		
		//Usuario
		EntityInterface usuario = new UsuarioEntity(1, "Fulano1", "de Tal", "fulano1@email.com", "+5511987651234", Calendar.getInstance(), "1234", true);
		
		//Exercicio
		DAOInterface execDAO = new ExercicioDAO();
		EntityInterface exercicio = new ExercicioEntity((UsuarioEntity)usuario, (AtividadeFisicaEntity)atividadeFisica, 300, Calendar.getInstance());
		execDAO.insert(exercicio);
		
		for(EntityInterface item : execDAO.getAll()){
			ExercicioEntity entity = (ExercicioEntity)item;
            System.out.println(entity.toString());
            
            if(atividadeFisica == null)
            	atividadeFisica = entity;
        }
		
		EntityInterface byId = execDAO.findById(1);

	}

}
