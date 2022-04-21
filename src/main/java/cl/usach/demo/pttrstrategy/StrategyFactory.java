package cl.usach.demo.pttrstrategy;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class StrategyFactory {

	private Map<EstrategiasOperaciones, Strategy> estrategias;

	@Autowired
	public StrategyFactory(Set<Strategy> estrategiaSet) {
		crearEstrategia(estrategiaSet);
	}

	public Strategy buscarEstrategia(EstrategiasOperaciones estrategiaNombre) {
		return estrategias.get(estrategiaNombre);
	}

	private void crearEstrategia(Set<Strategy> estrategiaSet) {
		estrategias = new HashMap<EstrategiasOperaciones, Strategy>();
		/*
		 * Por cada estrtegia, crear un conjunto del nombre de la estrategia y su metodo
		 */
		estrategiaSet.forEach(estrategia -> estrategias.put(estrategia.obtenerEstrategia(), estrategia));
	}
}
