package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Locale;

import model.dao.FabricaDao;
import model.dao.VendedorDAO;
import model.entities.Departamento;
import model.entities.Vendedor;

public class Principal {

	public static void main(String[] args) {
		 
		Locale.setDefault(Locale.US);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

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
		
		System.out.println("\nVENDEDOR insert");
		try {
			Vendedor novoVendedor = new Vendedor(null, "Gustavo Novarte", "gunov85@gmail.com", sdf.parse("07/07/1985"), 4500.00, dept);
			vendedorDao.insert(novoVendedor);
			System.out.println("Inserido! Novo ID = " + novoVendedor.getId());
		} catch (ParseException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("\nVENDEDOR update");
		vend = vendedorDao.findById(12);
		vend.setNome("Gustavo Frederico Novarte");
		vendedorDao.update(vend);
		System.out.println("Atualização concluída.");

	}

}
