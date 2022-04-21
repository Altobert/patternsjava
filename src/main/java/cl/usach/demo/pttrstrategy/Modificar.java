package cl.usach.demo.pttrstrategy;

import java.util.List;

public class Modificar implements Strategy{

	@Override
	public void operacionContribuyente(List<Contribuyente> listCont, 
			Contribuyente cont) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public EstrategiasOperaciones obtenerEstrategia() {
		// TODO Auto-generated method stub
		return EstrategiasOperaciones.modificarContribuyemte;
	}

}
