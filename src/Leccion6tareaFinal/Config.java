package Leccion6tareaFinal;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;


//ESTABLECER COMO ARCHIVO DE CONFIGURACIÓN DE SPRING
@Configuration

//INDICAR EL PAQUETE DONDE ESCANEAR LAS ANOTACIONES
@ComponentScan("Leccion6tareaFinal")

//CARGAR EL ARCHIVO EXTERNO DE PROPIEDADES
@PropertySource("classpath:instrumentos.propiedades")
	
public class Config {
	
	//DEFINICIÓN DE BEANS
	@Bean
	public Sonido sonidoBombo() {
		return new SonidoBombo();
	}

		/* Con la anotación @bean se genera el bean
		 * Se crea un método que devuelve la clase que se quiere inyectar (en este caso SonidoBombo), 
		 * El nombre del método pasará a ser el nombre o ID del Bean para manejarlo posteriormente.
		 */
				
	@Bean
	public Bombo bombo() {
		return new Bombo(sonidoBombo());
	}
	
		/* Idem al caso anterior, pero en este caso, se inyecta la clase Bombo
		 * a la que se le pasa como dependencia el Bean SonidoBombo.
		 * El nombre del método pasará a ser el nombre o ID de Bean para manejarlo posteriormente.
		 */
		
}
