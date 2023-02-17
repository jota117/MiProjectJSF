package controllers;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import entitys.Empleado;
import lombok.Getter;
import lombok.Setter;
import services.EmpleadoService;

@ManagedBean
@ViewScoped //para mantener la informacion del contenido de mi pantalla
public class PrincipalController {

	/**
	 * Lista de empleados para la tabla
	 */
	@Getter @Setter
	private List<Empleado> empleados;
	
	/**
	 * SErvicio con los metodos que realizan la logica de negocio de empleados
	 */
	private EmpleadoService empleadoService = new EmpleadoService();
	
	@PostConstruct
	public void init() {
		this.consultarEmpleados();
		
	}
	
	/**
	 * Metodo que consulta la lista de empleados
	 */
	public void consultarEmpleados() {
		this.empleados = this.empleadoService.consultarEmpleados();
		
	}		

}
