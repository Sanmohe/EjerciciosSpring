package Leccion6tareaFinal;

/* En este caso no se utiliza ninguna anotación. 
 * Será desde el archivo de configuración (Config.class) donde se cree el bean correspondiente
 */

public class SonidoBombo implements Sonido {

	@Override
	public void getSonido() {
		System.out.println("pom pom pom");
	}

}
