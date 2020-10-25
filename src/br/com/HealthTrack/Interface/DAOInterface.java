package br.com.HealthTrack.Interface;

import java.util.List;

public interface DAOInterface {
	public void insert(EntityInterface entity);
	public List<EntityInterface> getAll();
//	public void atualizar(object entity);
//	public void remover(int codigo);
//	public object buscarPorId(int codigo);
}
