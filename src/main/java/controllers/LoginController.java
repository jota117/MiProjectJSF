package controllers;

import java.io.IOException;

import javax.faces.application.FacesMessage;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;

import dto.UsuarioDTO;

import lombok.Getter;
import lombok.Setter;

/**
 * @author jjegarcia
 * Clase que nos permite controlar el funcionamiento de la
 *         pantalla con el login.xhtml.
 *
 */
@ManagedBean
public class LoginController {
	
	@Getter @Setter
	private String username;
	@Getter @Setter
	private String password;
	
	/**
	 * Bean que mantiene la informacion en sesion
	 */
	@Getter @Setter 
	@ManagedProperty("#{sessionController}")
	private SessionController sessionController;
	
	public void ingresar() {
		
		System.out.println("Usuario: " + username);
		
		// FacesContesxt es una clase del API de JSF
		if (username.equals("jota117") && password.equals("sso12345")) {
			/*FacesContext.getCurrentInstance().addMessage("formLogin: txtUsuario",
					new FacesMessage(FacesMessage.SEVERITY_INFO, "Usuario correcto", ""));*/
			try {
				UsuarioDTO usuarioDTO = new UsuarioDTO();
				usuarioDTO.setUsuario(this.username);
				usuarioDTO.setPassword(this.password);
				
				
				this.sessionController.setUsuarioDTO(usuarioDTO);
				this.redireccionar("principal.xhtml");
			} catch (IOException e) {
				FacesContext.getCurrentInstance().addMessage("formLogin: txtUsuario",
						new FacesMessage(FacesMessage.SEVERITY_FATAL, "La pagina no existe", ""));
				e.printStackTrace();
			}
			

		} else {
			FacesContext.getCurrentInstance().addMessage("formLogin: txtUsuario",
					new FacesMessage(FacesMessage.SEVERITY_ERROR, "Usuario y/o contraseña incorrectos", ""));

		}
		
	}
	
	
	private void redireccionar(String pagina) throws IOException  {
		ExternalContext ec = FacesContext.getCurrentInstance().getExternalContext();
		ec.redirect(pagina);
	}
	
	

}
