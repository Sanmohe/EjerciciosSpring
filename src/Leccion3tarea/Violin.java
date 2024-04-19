package Leccion3tarea;

public class Violin implements Instrumento {	//Clase de Instrumento

	@Override
	public void identificacion() {
		System.out.println("Instrumento Violín");
	}
	
	
	@Override
	public void sonar() {
		identificacion();	//En el mismo método, el instrumento se identifica y suena
		System.out.println("Tin tirirín tirirín");
	}

}
