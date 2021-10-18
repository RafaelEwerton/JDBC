package model.dao;

import java.util.List;

import model.entities.Department;

//Transforma��o de entidades
public interface DepartmentDao {
	
	void insert(Department obj); //Inserir
	void update(Department obj); //Atualizar
	void deleteById(Integer id); //Delete
	Department findById(Integer id); // Consulta - Se existir retorna caso n�o, NULL.
	List<Department> findAll(); //listar todos
	
	
	
}
