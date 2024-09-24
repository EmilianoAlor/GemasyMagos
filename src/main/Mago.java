package main;

import java.util.HashSet;

public class Mago {
	private HashSet<String> LibroDeHechisos = new HashSet<>();

	public void agregarHechizo(String nombreHechizo) {
		LibroDeHechisos.add(nombreHechizo);
	}

	public String buscarHechizosEnComun(Mago mago2) {

		HashSet<String> ListaComun = new HashSet<>();
		
		for (String hechizo : this.LibroDeHechisos) {
			if (mago2.LibroDeHechisos.contains(hechizo))
				ListaComun.add(hechizo);
		}

		return "Hechisos en Comun:" + ListaComun;
	}

}
