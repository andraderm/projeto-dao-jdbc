package application;

import java.util.List;
import java.util.Locale;

import model.dao.FabricaDao;
import model.dao.VendedorDAO;
import model.entities.Departamento;
import model.entities.Vendedor;

public class Principal {

	public static void main(String[] args) {
		 
		Locale.setDefault(Locale.US);

		VendedorDAO vendedorDao = FabricaDao.createVendedorDAO();

		System.out.println("VENDEDOR findById");
		Vendedor vend = vendedorDao.findById(5);
		System.out.println(vend);
		
		System.out.println("\nVENDEDOR findByDepartamento");
		Departamento dept = new Departamento(2, null);
		List<Vendedor> list = vendedorDao.findByDepartamento(dept);
		for (Vendedor v : list) {
			System.out.println(v);
		}
		
		System.out.println("\nVENDEDOR findAll");
		list = vendedorDao.findAll();
		for (Vendedor v : list) {
			System.out.println(v);
		}

	}

}
