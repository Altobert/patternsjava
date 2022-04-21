package cl.usach.demo.pttrstrategy;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Contribuyente implements Serializable{
	
	
	private static final long serialVersionUID = 1L;
	private Integer rut;
	private Integer nombre;
	private TipoPersona tpPersona;

}

