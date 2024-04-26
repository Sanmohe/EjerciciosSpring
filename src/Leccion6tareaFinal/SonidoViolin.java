package Leccion6tareaFinal;

import org.springframework.stereotype.Component;

@Component		
// Esta anotación hace que Spring maneje esta clase desde su contenedor (crea el bean automáticamente).

public class SonidoViolin implements Sonido {	//Esta clase especifica el sonido concreto de un violín

	@Override
	public void getSonido() {
		System.out.println("Tin tirirín tirirín");		
	}

}
