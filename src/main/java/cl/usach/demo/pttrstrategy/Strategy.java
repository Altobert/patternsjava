package cl.usach.demo.pttrstrategy;

import java.util.List;

public interface Strategy {
	
	public void operacionContribuyente(List<Contribuyente> listCont,
			Contribuyente cont);	
	EstrategiasOperaciones obtenerEstrategia();

}
