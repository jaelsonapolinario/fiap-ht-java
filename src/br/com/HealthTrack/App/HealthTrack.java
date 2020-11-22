package br.com.HealthTrack.App;

import java.text.ParseException;

import br.com.HealthTrack.DAO.*;
import br.com.HealthTrack.Entity.*;

/**
 * Classe de teste que start a instancia das demais classes
 * @author Jaelson Apolinario
 * @version 1.0
 */
public class HealthTrack {
	
	public static void main(String[] args) {
		
		ControleCadUsuario controleUsuario = new ControleCadUsuario();
		ControleCadAnatomia controleAnatomia = new ControleCadAnatomia();
		ControleCadExercicio controleExercicio = new ControleCadExercicio();
		ControleCadDieta controleDieta = new ControleCadDieta();
		
		//criar usuario
		try {
			controleUsuario.cadastrar("Fulano1", "de Tal", "fulano1@email.com", "+5511987651234", "01/01/1990", "1234");
		} catch (ParseException e) {
			System.out.println("Não foi possivel criar usuário - data de nascimento inválida");
		} catch (Exception e) {
			System.out.println("Não foi possivel criar usuário");
			e.printStackTrace();
		}
		
		try {
			controleUsuario.cadastrar("Fulano2", "de Tal", "fulano2@email.com", "+5511987651234", "01/01/1991", "12345");
		} catch (ParseException e) {
			System.out.println("Não foi possivel criar usuário - data de nascimento inválida");
		} catch (Exception e) {
			System.out.println("Não foi possivel criar usuário");
			e.printStackTrace();
		}
		
		//autenticar usuario
		UsuarioEntity usuarioAutenticado = controleUsuario.autenticar("fulano1@email.com", "1234");
		
		if(usuarioAutenticado != null) {
			//cadastrar anatomia
			controleAnatomia.cadastrar(usuarioAutenticado, 1.90, 80.0);
			
			//cadastrar exercicio
			controleExercicio.cadastrar(usuarioAutenticado, "corrida", 30);
			
			//cadastrar dieta
			controleDieta.cadastrar(usuarioAutenticado, "macarronada", 300.05);
		}
		else {
			System.out.println("Dados de autenticação estão inválidos");
		}
			
	}
	
}
