package dto;

import lombok.Getter;
import lombok.Setter;

/**
 * @author jjegarcia
 * Clase que permitira contener la informacion del usuario en sesion
 *
 */
public class UsuarioDTO {
	
	@Getter @Setter
	private String usuario;
	@Getter @Setter
	private String password;

}
