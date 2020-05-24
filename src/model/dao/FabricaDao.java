package model.dao;

import model.dao.impl.VendedorDaoJDBC;

public class FabricaDao {
	
	public static VendedorDAO createVendedorDAO() {
		
		return new VendedorDaoJDBC();
		
	}

}
