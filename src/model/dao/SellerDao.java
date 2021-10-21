package model.dao;

import java.util.List;

import model.entities.Department;
import model.entities.Seller;

public interface SellerDao {
	
	void insert(Seller obj); //Inserir
	void update(Seller obj); //Atualizar
	void deleteById(Integer id); //Delete
	Seller findById(Integer id); // Consulta - Se existir retorna caso não, NULL.
	List<Seller> findAll(); //listar todos
	
	List<Seller> findByDepartment(Department department);
	

}
