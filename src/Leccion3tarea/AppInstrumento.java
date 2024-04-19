package Leccion3tarea;

public class AppInstrumento {

	public static void main(String[] args) {
		InstrumentoOrquesta instrumento1 = new InstrumentoOrquesta(new Violin()); 
		//Se pasa como parámetro una instancia de la clase que extiende la interfaz
		//Se ha inyectado la dependencia
		
		InstrumentoOrquesta instrumento2 = new InstrumentoOrquesta(new Trompeta()); 
		InstrumentoOrquesta instrumento3 = new InstrumentoOrquesta(new Bombo()); 
		
		//A continuación se aplican los métodos que llamarán a las clases de las que son dependientes
		instrumento1.getSonar();
		System.out.println("");
		instrumento2.getSonar();
		System.out.println("");
		instrumento3.getSonar();
	
	}
}
