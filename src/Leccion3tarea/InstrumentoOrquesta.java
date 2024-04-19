package Leccion3tarea;

public class InstrumentoOrquesta {
	private Instrumento instrumento;	//Campo o atributo que apunta a la interfaz
	
	public InstrumentoOrquesta (Instrumento instrumento) {		
		this.instrumento = instrumento;
	}
	//Constructor al que se le inyecta como parámetro el campo que apunta a la interfaz
	//El control de la creación de objetos no lo tiene InstrumentoOrquesta sino la interfaz Instrumento
	
	
	
	public void getIdentificacion() {	//Implementación del método llamando a la interfaz
		instrumento.identificacion();
	}
	
	public void getSonar() {	//Implementación del método llamando a la interfaz
		instrumento.sonar();
	}
	
	

}
