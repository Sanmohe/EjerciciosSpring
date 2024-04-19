package Leccion3tarea;

public class Bombo implements Instrumento {		//Clase de Instrumento

	@Override
	public void identificacion() {
		System.out.println("Instrumento Bombo");

	}

	@Override
	public void sonar() {
		identificacion();		//En el mismo método, el instrumento se identifica y suena
		System.out.println("pom pom pom");

	}

}
