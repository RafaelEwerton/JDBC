package model.entities;

import java.io.Serializable;

public class Department implements Serializable{
	
	//SERIALIZABLE - PARA QUE OS OBJETOS SEJAM TRANSFORMADOS EM BITS - SEJA GRAVADO EM ARQUIVOS, TRAFEGADOS EM REDE, ETC.
	
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String name;
	
	
	public Department() {
		
	}
	
	public Department(Integer id, String name) {
		this.id = id;
		this.name = name;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	
	
	//HASCODE E EQUALS - PARA QUE SEJA COMPARADO PELO CONTEUDO E NÃO PELA REFERENCIA.
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Department other = (Department) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Department [id=" + id + ", name=" + name + "]";
	}
	
	
	
	
	
	

}
