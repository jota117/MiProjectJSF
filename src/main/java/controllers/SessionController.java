package controllers;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import dto.UsuarioDTO;
import lombok.Getter;
import lombok.Setter;

@ManagedBean
@SessionScoped
public class SessionController {
	
	/*
	 * Usuario que se mantendra en sesion
	 * 
	 */
	@Getter @Setter
	private UsuarioDTO usuarioDTO;
	
	@PostConstruct
	public void init() {
		System.out.println("Cargando informacion del usuario en sesion...");
	}

}
