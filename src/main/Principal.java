package main;

public class Principal {

	public static void main(String[] args) {

//		Recorrer re = new Recorrer();
//		int k = 10;
//		int[] arrayint = { 1, 3, 4, 6, 8, 9, 2 };
//
//		System.out.println("Se encontraron " + re.buscarPoder(arrayint, k) + " Combinaciones.");
//
//		System.out.println("Las combinaciones de gemas que suman " + k + " son: " + re.combinacionesPosibles());

		/**
		 * Parte 1: El mensajero mágico El reino tiene un mensajero mágico encargado de
		 * entregar los mensajes entre los castillos. Los mensajes se transmiten en el
		 * orden en que fueron recibidos, excepto si un mensaje es de alta prioridad, en
		 * cuyo caso debe ser entregado antes que los demás.
		 * 
		 * Usar una LinkedList para gestionar la lista de mensajes que el mensajero debe
		 * entregar. Los mensajes normales se añaden al final, mientras que los de alta
		 * prioridad se añaden al frente de la lista
		 **/

//		MensajeroMagico Men = new MensajeroMagico();
//
//		Men.recibirMensaje("hola");
//		Men.recibirMensaje("Dios");
//		Men.recibirMensajeAltaPrioridad("Mama");
//
//		System.out.println(Men);

		/**
		 * Parte 2: Comparación de hechizos Dos magos, que pertenecen a castillos
		 * diferentes, comparan sus libros de hechizos para ver qué hechizos tienen en
		 * común. A cada mago se le ha entregado una lista de hechizos únicos, pero
		 * necesitan encontrar aquellos que ambos comparten para utilizarlos en la
		 * batalla final.
		 * 
		 * Pista: Usar HashSets * para representar los libros de hechizos de cada mago.
		 * Deberán encontrar * el conjunto de hechizos que ambos magos tienen en común
		 */

//		Mago mago1 = new Mago();
//
//		mago1.agregarHechizo("Hechizo1");
//		mago1.agregarHechizo("Hechizo2");
//		mago1.agregarHechizo("Hechizo3");
//		mago1.agregarHechizo("Hechizo4");
//		mago1.agregarHechizo("Hechizo5");
//
//		Mago mago2 = new Mago();
//
//		mago2.agregarHechizo("Hechizo6");
//		mago2.agregarHechizo("Hechizo2");
//		mago2.agregarHechizo("Hechizo7");
//		mago2.agregarHechizo("Hechizo4");
//		mago2.agregarHechizo("Hechizo8");
//
//		System.out.println(mago1.buscarHechizosEnComun(mago2));

		/**
		 * Parte 3: La elección del líder Durante el consejo, cada mago vota una sola
		 * vez por el líder que desea elegir. Sin embargo, algunos magos intentan votar
		 * más de una vez, lo cual está prohibido. Queremos saber quién ha sido elegido
		 * líder, asegurándonos de que cada mago haya votado solo una vez. 
		 * 
		 * Pista:Usar un
		 * HashMap para contar los votos, donde la clave es el nombre del líder y el
		 * valor es el número de votos que ha recibido. Usar un HashSet para asegurarse
		 * de que ningún mago vote más de una vez
		 */
		
		EleccionConsejo elec = new EleccionConsejo();
		
		elec.agregarVoto("mago1", "Lider1");
		elec.agregarVoto("mago2", "Lider1");
		elec.agregarVoto("mago3", "Lider1");
		elec.agregarVoto("mago1", "Lider2");
		elec.agregarVoto("mago4", "Lider2");
		elec.agregarVoto("mago5", "Lider1");
		elec.agregarVoto("mago6", "Lider1");
		elec.agregarVoto("mago7", "Lider1");
		elec.agregarVoto("mago8", "Lider1");
		
		System.out.println(elec);
		
	}

}
