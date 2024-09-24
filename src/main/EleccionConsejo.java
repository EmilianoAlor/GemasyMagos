package main;

import java.util.HashMap;
import java.util.HashSet;

public class EleccionConsejo {

	private HashSet<String> listaDeMagos = new HashSet();

	private HashMap<String, Integer> votos = new HashMap();

	public void agregarVoto(String mago, String liderAVotar) {

		if (!listaDeMagos.contains(mago)) {
			// no encontro el mago, puede votar.
			listaDeMagos.add(mago);

			int cantidad = votos.getOrDefault(liderAVotar, 0);

			votos.put(liderAVotar, cantidad + 1);

		}

	}

	@Override
	public String toString() {
		return "EleccionConsejo [Votos=" + votos + "]";
	}

}
