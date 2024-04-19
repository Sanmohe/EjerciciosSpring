package Leccion3tarea;

public class Trompeta implements Instrumento {		//Clase de Instrumento

	@Override
	public void identificacion() {
		System.out.println("Instrumento Trompeta");
	}

	@Override
	public void sonar() {
		identificacion();	//En el mismo método, el instrumento se identifica y suena
		System.out.println("Pupuru purupú");
	}

}
