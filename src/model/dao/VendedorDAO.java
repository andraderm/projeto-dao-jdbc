package model.dao;

import java.util.List;

import model.entities.Departamento;
import model.entities.Vendedor;

public interface VendedorDAO {
	
	void insert(Vendedor dept);
	void update(Vendedor dept);
	void deleteById(Vendedor dept);
	Vendedor findById (Integer id);
	List<Vendedor> findAll();
	List<Vendedor> findByDepartamento(Departamento departamento);

}
