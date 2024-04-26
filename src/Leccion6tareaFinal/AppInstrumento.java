package Leccion6tareaFinal;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInstrumento {

	public static void main(String[] args) {
		//CARGA DEL ARCHIVO DE CONFIGURACIÓN DE BEANS
		AnnotationConfigApplicationContext contexto = new AnnotationConfigApplicationContext(Config.class);
		
		
		// CREACIÓN DE OBJETOS: SOLICITUDES DE BEANS AL CONTENEDOR
		
		Violin VIOLIN = contexto.getBean("violin",Violin.class); 
		Trompeta TROMPETA = contexto.getBean("trompeta",Trompeta.class);
		Bombo BOMBO = contexto.getBean("bombo",Bombo.class);
				
		/*Como el dato material es propio de cada clase (Violin, Trompeta o Bombo) y no de la interfaz Instrumento,
		* hay que crear cada objeto de tipo Violin, Trompeta o Bombo.
		* También hay que solicitar el bean espeficando la clase DirectorFinanciero
		*/
		
				
		//LLAMADA A MÉTODOS DE CADA OBJETO
		VIOLIN.sonar();
		System.out.println("Material: " + VIOLIN.getMaterial() + "\n");
		TROMPETA.sonar();
		System.out.println("Material: " + TROMPETA.getMaterial() + "\n");
		BOMBO.sonar();
		System.out.println("Material: " + BOMBO.getMaterial() + "\n");
				
		
		//CIERRE DEL CONTEXTO
		contexto.close();
				
	}
}
