package cl.usach.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.usach.demo.pttrcommand.AbrirOperacionArchivoTexto;
import cl.usach.demo.pttrcommand.ArchivoTexto;
import cl.usach.demo.pttrcommand.CerrarOperacionArchivoTexto;
import cl.usach.demo.pttrcommand.EjecutorOperacionArchivo;
import cl.usach.demo.pttrstrategy.EstrategiasOperaciones;
import cl.usach.demo.pttrstrategy.Strategy;
import cl.usach.demo.pttrstrategy.StrategyFactory;
import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class ControllerPattern {

	private static final Logger logger = LoggerFactory.getLogger(ControllerPattern.class);
	
	@Autowired
	private StrategyFactory strategyFactory;
		
	@GetMapping("/Strategy")
	public void patternStrategy() {

		logger.info("Patron patternStrategy");
		Strategy st= null;
		st = strategyFactory.buscarEstrategia(EstrategiasOperaciones.consultarContribuyente);
		//st.operacionContribuyente(listCont, cont);
		st = strategyFactory.buscarEstrategia(EstrategiasOperaciones.modificarContribuyemte);
		//st.operacionContribuyente(listCont, cont);
		st = strategyFactory.buscarEstrategia(EstrategiasOperaciones.registrarContribuyente);
		//st.operacionContribuyente(listCont, cont);

	}

	@GetMapping("/Adapter")
	public void patternAdapter() {

		logger.info("Patron Adapter");

	}

	@GetMapping("/Command")
	public void patternCommand() {

		logger.info("Patron Command");
		
		EjecutorOperacionArchivo ejecutorCommand = new EjecutorOperacionArchivo();
		
		ejecutorCommand.executeOperation(new AbrirOperacionArchivoTexto(new ArchivoTexto("miArchivo.txt")));
		
		ejecutorCommand.executeOperation(new CerrarOperacionArchivoTexto(new ArchivoTexto("miArchivo.txt")));
		
	}

	@GetMapping("/AbFactory")
	public void patternAbFactory() {

		logger.info("AbFactory");

	}

}
