package cl.usach.demo.pttrcommand;

import java.util.ArrayList;
import java.util.List;


public class EjecutorOperacionArchivo {

	
	private final List<OperacionArchivoTexto> textFileOperations  = new ArrayList<>();
	
	
	public String executeOperation(OperacionArchivoTexto textFileOperation) {
        textFileOperations.add(textFileOperation);
        return textFileOperation.ejecutar();
    }

}
