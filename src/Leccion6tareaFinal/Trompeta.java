package Leccion6tareaFinal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Trompeta implements Instrumento {		//Clase de Instrumento
	//CAMPO DE CLASE QUE APUNTA A LA INTERFAZ DE LA DEPENDENCIA
	private Sonido sonidoTrompeta;
	
	//CAMPOS DE PROPIEDADES
	@Value("${materialTrompeta}")		//Llama al valor de la propiedad establecida en el archivo de propiedades
	private String material;
		
	
	//INYECCIÓN DE DEPENDENCIAS CON EL CONSTRUCTOR
	@Autowired
	public Trompeta(@Qualifier("sonidoTrompeta") Sonido sonido) {
		sonidoTrompeta = sonido;
	}
		/*
		* Con la anotación @Autowired Spring busca en todo el proyecto alguna clase que implemente la interfaz Sonido (dependencia).
		* Con la anotación @Qualifier se especifica la clase en concreto a inyectar (que implementa la interfaz Sonido)
		*/
			 

	//MÉTODOS GETTER
	public String getMaterial() {
		return material;
	}

	
	
	//MÉTODOS IMPLEMENTADOS DE LA INTERFAZ
	@Override
	public void identificacion() {
		System.out.println("Instrumento Trompeta");
	}

	@Override
	public void sonar() {
		identificacion();
		sonidoTrompeta.getSonido();		
	}

}
