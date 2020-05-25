package application;

import java.text.SimpleDateFormat;
import java.util.Locale;

import model.dao.FabricaDao;
import model.dao.VendedorDAO;
import model.entities.Departamento;
import model.entities.Vendedor;

public class Principal {

	public static void main(String[] args) {
		 
		Locale.setDefault(Locale.US);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		Departamento dept = new Departamento(1, "Eletrônicos");
		VendedorDAO vendedorDao = FabricaDao.createVendedorDAO();
		
		Vendedor vend = vendedorDao.findById(5);
		
		System.out.println(vend);

	}

}
