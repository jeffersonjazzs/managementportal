package br.com.managementportal.daos;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.managementportal.models.Departamento;

@Repository
@Transactional
public class DepartamentoDAO {

	@PersistenceContext
	private EntityManager manager;

	public void gravar(Departamento departamento) {
		manager.persist(departamento);
	}
	
	public List<Departamento> listar(){
	    return manager.createQuery("select p from Departamento p", Departamento.class).getResultList();
	}
	
}