/**
 * 
 */
package br.com.HealthTrack.App;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Optional;

/**
 * Classe de controle de Usuario
 * @author Jaelson Apolinario
 * @version 1.0
 */
public class ControleCadUsuario {
	
	private ArrayList<Usuario> listaUsuario;
	
	public ControleCadUsuario() {
		listaUsuario = new ArrayList<Usuario>();
	}
	
	/**
	 * Efetua a autenticacao de um usuario
	 * @param email email do suaurio
	 * @param senha senha do usuario
	 * @return Usuario autenticado
	 */
	public Usuario autenticar(String email, String senha)
	{
		Optional<Usuario> usuario = listaUsuario.stream().filter(u -> u.getEmail() == email && u.getSenha() == senha)
				.findFirst();
		
		return usuario.isPresent() ? usuario.get() : null;
	}
	
	/**
	 * Cadastra um novo usuario
	 * @param nome nome do usuario
	 * @param sobrenome sobrenome do usuario
	 * @param email email do usuario
	 * @param celular numero de ceular do usuario
	 * @param dtNascimento data de nascimento
	 * @param senha senha para autenticacao
	 * @throws ParseException erro no cast da data de nascimento
	 */
	public void cadastrar(String nome, String sobrenome, String email, String celular, String dtNascimento,
			String senha) throws ParseException {
		
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
		Date data = formato.parse(dtNascimento);
		Usuario novoUsuario = new Usuario(listaUsuario.size() + 1, nome, sobrenome, email, celular, data,
				senha, true);
		listaUsuario.add(novoUsuario);
	}
	
	/**
	 * Busca um usuario
	 * @param codigo
	 * @return Usuario objeto
	 */
	public Usuario consultar(int codigo)
	{
		Optional<Usuario> usuario = listaUsuario.stream().filter(u -> u.getCodigo() == codigo)
				.findFirst();
		
		return usuario.get();
	}
}
