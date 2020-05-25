package application;

import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import model.dao.DepartamentoDAO;
import model.dao.FabricaDao;
import model.entities.Departamento;

public class Programa2 {
	
	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Scanner sc = new Scanner(System.in);
	
		DepartamentoDAO departamentoDao = FabricaDao.createDepartamentoDAO();
	
		System.out.println("DEPARTAMENTO findById");
		Departamento dept = departamentoDao.findById(5);
		System.out.println(dept);
		
		System.out.println("\nDEPARTAMENTO findAll");
		List<Departamento>list = departamentoDao.findAll();
		for (Departamento d : list) {
			System.out.println(d);
		}
		
		System.out.println("\nDEPARTAMENTO insert");
		Departamento novoDepartamento = new Departamento(null, "Alimentação");
		departamentoDao.insert(novoDepartamento);
		System.out.println("Inserido! Novo ID = " + novoDepartamento.getId());
		
		System.out.println("\nDEPARTAMENTO update");
		dept = departamentoDao.findById(12);
		dept.setNome("Cinema");
		departamentoDao.update(dept);
		System.out.println("Atualização concluída");
	
		System.out.println("\nDEPARTAMENTO delete");
		System.out.print("Entre um Id para deleção: ");
		int id = sc.nextInt();
		departamentoDao.deleteById(id);
		System.out.println("Departamento deletado");
		
		sc.close();
	}

}
