package model.dao;

import db.DB;
import model.dao.impl.SellerDaoJDBC;



//Fabrica de dao - Operacoes estaticas para instanciar os DAOs.
public class DaoFactory {
	
	public static SellerDao createSellerDao() {
		return new SellerDaoJDBC(DB.getConnection());
	}
	

}
