package Leccion6tareaFinal;

import org.springframework.beans.factory.annotation.Value;

/* En este caso no se utiliza ninguna anotación. 
 * Será desde el archivo de configuración (Config.class) donde se creen los beans correspondiente
 */

public class Bombo implements Instrumento {		//Clase de Instrumento

	//CAMPO QUE APUNTA A LA INTERFAZ DE LA DEPENDENCIA
	private Sonido sonidoBombo;
	
	//CAMPOS DE PROPIEDADES
	@Value("${materialBombo}")		//Llama al valor de la propiedad establecida en el archivo de propiedades
	private String material;
	
	
	//CONSTRUCTOR DONDE SE INYECTA LA DEPENDENCIA
	public Bombo(Sonido sonido) {
		sonidoBombo = sonido;
	}

	
	//MÉTODOS GETTERS
	public String getMaterial() {
		return material;
	}

		
	//MÉTODOS IMPLEMENTADOS DE LA INTERFAZ INSTRUMENTO
	@Override
	public void identificacion() {
		System.out.println("Instrumento Bombo"); ;
	}

	@Override
	public void sonar() {
		identificacion();			//En el mismo método, el instrumento se identifica y suena
		sonidoBombo.getSonido();	//Se llama al método de la interfaz que genera la dependencia (Sonido)
	}

		
}
