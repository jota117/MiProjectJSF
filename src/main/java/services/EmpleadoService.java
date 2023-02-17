package services;

import java.util.ArrayList;
import java.util.List;
import entitys.Empleado;

public class EmpleadoService {
	
	/**
	 *
	 * Metodo que permite consultar la lista de empleados de empresas de TI.
	 *
	 */
	public List<Empleado> consultarEmpleados(){
		
		//Generar la lista de empleados a consultar
		List<Empleado> empleados = new ArrayList<Empleado>();
		
		Empleado empleadoIBM = new Empleado();
		Empleado empleadoMicrosoft = new Empleado();
		Empleado empleadoApple = new Empleado();
		Empleado empleadoAmazon = new Empleado();
		Empleado empleadoOracle = new Empleado();
		Empleado empleadoHP = new Empleado();
		Empleado empleadoNetflix = new Empleado();
		Empleado empleadoStarlink = new Empleado();
	
		empleadoIBM.setNombre("Victor");
		empleadoIBM.setPrimerAp("Ramirez");
		empleadoIBM.setSegundoAp("Gonzales");
		empleadoIBM.setPuesto("Senior Developer Java");
		empleadoIBM.setStat(true);
		
		empleadoMicrosoft.setNombre("Luis");
		empleadoMicrosoft.setPrimerAp("Altamira");
		empleadoMicrosoft.setSegundoAp("Romero");
		empleadoMicrosoft.setPuesto("CEO");
		empleadoMicrosoft.setStat(true);
		
		empleadoApple.setNombre("Daniel");
		empleadoApple.setPrimerAp("Lopez");
		empleadoApple.setSegundoAp("Hernanadez");
		empleadoApple.setPuesto("Architect");
		empleadoApple.setStat(true);
		
		empleadoAmazon.setNombre("Gabriel");
		empleadoAmazon.setPrimerAp("Lopez");
		empleadoAmazon.setSegundoAp("Hernanadez");
		empleadoAmazon.setPuesto("Architect");
		empleadoAmazon.setStat(true);
		
		empleadoOracle.setNombre("Juan Jose");
		empleadoOracle.setPrimerAp("Lopez");
		empleadoOracle.setSegundoAp("Hernanadez");
		empleadoOracle.setPuesto("Architect");
		empleadoOracle.setStat(true);
		
		empleadoHP.setNombre("Manuel");
		empleadoHP.setPrimerAp("Lopez");
		empleadoHP.setSegundoAp("Hernanadez");
		empleadoHP.setPuesto("Architect");
		empleadoHP.setStat(true);
				
		empleadoNetflix.setNombre("Jazmin");
		empleadoNetflix.setPrimerAp("Lopez");
		empleadoNetflix.setSegundoAp("Hernanadez");
		empleadoNetflix.setPuesto("Architect");
		empleadoNetflix.setStat(true);
		
		empleadoStarlink.setNombre("Maribel");
		empleadoStarlink.setPrimerAp("Lopez");
		empleadoStarlink.setSegundoAp("Hernanadez");
		empleadoStarlink.setPuesto("Architect");
		empleadoStarlink.setStat(true);
		
		empleados.add(empleadoIBM);
		empleados.add(empleadoMicrosoft);
		empleados.add(empleadoApple);
		empleados.add(empleadoAmazon);
		empleados.add(empleadoHP);
		empleados.add(empleadoOracle);
		empleados.add(empleadoNetflix);
		empleados.add(empleadoStarlink);
		
		return empleados;
		
	}

}
