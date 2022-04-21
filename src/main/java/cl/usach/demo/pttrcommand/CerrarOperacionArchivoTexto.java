package cl.usach.demo.pttrcommand;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CerrarOperacionArchivoTexto implements OperacionArchivoTexto {
	
	private ArchivoTexto textFile;
	
	private static final Logger logger = LoggerFactory.getLogger(CerrarOperacionArchivoTexto.class);
	
	public CerrarOperacionArchivoTexto(ArchivoTexto textFile) {
		this.textFile = textFile;
	}

	@Override
	public String ejecutar() {
		// TODO Auto-generated method stub
		logger.info("Operacion cerrar archivo: ", textFile.getNombre());
		return "Cerrar Archivo";
	}

}
