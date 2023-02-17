package entitys;

import lombok.Getter;
import lombok.Setter;

public class Empleado {
	
	@Getter @Setter
	private String nombre;
	@Getter @Setter
	private String primerAp;
	@Getter @Setter
	private String segundoAp;
	@Getter @Setter
	private String puesto;
	@Getter @Setter
	private boolean stat;

}
