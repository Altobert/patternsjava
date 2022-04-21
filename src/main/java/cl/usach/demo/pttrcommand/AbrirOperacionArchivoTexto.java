package cl.usach.demo.pttrcommand;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import cl.usach.demo.controller.ControllerPattern;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class AbrirOperacionArchivoTexto implements OperacionArchivoTexto {
	
	private ArchivoTexto textFile;
	
	private static final Logger logger = LoggerFactory.getLogger(AbrirOperacionArchivoTexto.class);
	
	public AbrirOperacionArchivoTexto(ArchivoTexto textFile) {
		this.textFile = textFile;
	}

	@Override
	public String ejecutar() {
		// TODO Auto-generated method stub
		logger.info("Operacion abrir archivo: "+textFile.getNombre());
		return "Abrir Archivo: "+textFile.getNombre();
	}

}
