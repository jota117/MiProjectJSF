package controllers;

import java.io.IOException;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

/**
 * @author jjegarcia
 *Clase que se encarga de cerrar la sesion del usuario
 */
@ManagedBean
public class SessionClosedController {
	
	@PostConstruct
	public void init() {
		System.out.println("Cerrar sesión...");
	}
	
	public void cerrarSesion() {
		ExternalContext externalContext = FacesContext.getCurrentInstance().getExternalContext();
		externalContext.invalidateSession();
		
		try {
			this.redireccionar("login.xhtml");
		} catch (IOException e) {
			// Mensaje Opcional
			e.printStackTrace();
		}
	}
	
	/**
	 * Metodo que permite redireccionar a una pantalla
	 * @param pagina {@link String} pagina a redireccionar.
	 * throws IOException Excepcion en caso de error al encontrar la pagina
	 * 
	 * */	
	private void redireccionar(String pagina) throws IOException  {
		ExternalContext ec = FacesContext.getCurrentInstance().getExternalContext();
		ec.redirect(pagina);

	}

}
