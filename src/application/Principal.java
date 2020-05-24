package application;

import java.text.ParseException;
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
		
		try {
			
			Departamento dept = new Departamento(1, "Eletrônicos");
			Vendedor v1 = new Vendedor(1, "Fábio", "fabio@gmail.com", sdf.parse("08/10/1989") ,4500.00, dept);
			VendedorDAO vendedorDao = FabricaDao.createVendedorDAO();
			
			System.out.println(v1);
			
		} catch (ParseException e) {
			System.out.println("Erro: " + e.getMessage());
		}

	}

}
