package Leccion6tareaFinal;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component		
	// Esta anotación hace que Spring maneje esta clase desde su contenedor (crea el bean automáticamente).

@Scope("singleton")
	/* Esta anotación establece que el patrón de diseño sea SINGLETON
	 * Aunque es el patrón por defecto de Spring, introduzco la anotación para ejemplificar su uso.
	 * SINGLETON indica a Spring que aporte el mismo objeto (misma referencia y dirección de memoria)
	 * a todas las solicitudes que reciba de la clase Violin
	 */

public class Violin implements Instrumento {	//Clase de Instrumento
	
	//INYECCIÓN DE DEPENDENCIA CON EL CAMPO QUE APUNTA A LA INTERFAZ
	@Autowired
	@Qualifier("sonidoViolin")
	private Sonido sonidoViolin;

		/* Con la anotación @Autowired Spring busca en todo el proyecto alguna clase que implemente la interfaz Sonido (dependencia).
		 * Con la anotación @Qualifier se especifica la clase en concreto a inyectar (que implementa la interfaz Sonido)
		 */
	
	// En este caso, no hace falta definir un constructor
	
	//CAMPOS DE PROPIEDADES
	@Value("${materialViolin}")		//Llama al valor de la propiedad establecida en el archivo de propiedades
	private String material;
	
	
	//MÉTODOS GETTER
	public String getMaterial() {
		return material;
	}
	
	
	//CÓDIGO DESPUÉS DE LA CREACIÓN Y ANTES DE LA EJECUCIÓN DEL BEAN (INIT)
	@PostConstruct
	public void inicioAudicion() {		
		System.out.println("INICIO DE LA AUDICIÓN \n");
	}

	
	//CÓDIGO DESPUÉS DE LA CREACIÓN DEL BEAN (DESTROY)
	@PreDestroy
	public void finalAudicion() {		
		System.out.println("FINAL DE LA AUDICIÓN");
	}
		
	
	//MÉTODOS IMPLEMENTADOS DE LA INTERFAZ INSTRUMENTO
	@Override
	public void identificacion() {
		System.out.println("Instrumento Violín");
	}
		
	@Override
	public void sonar() {
		identificacion();			//En el mismo método, el instrumento se identifica y suena
		sonidoViolin.getSonido();	//Se llama al método de la interfaz que genera la dependencia (Sonido)	
		
		
	}

}
