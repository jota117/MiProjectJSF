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
		
		empleados.add(empleadoIBM);
		empleados.add(empleadoMicrosoft);
		empleados.add(empleadoApple);
		
		return empleados;
		
	}

}
