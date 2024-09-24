package main;

import java.util.HashMap;
import java.util.Set;
import java.util.TreeSet;

public class Recorrer {

	HashMap<Integer, Integer> combinaciones = new HashMap<Integer, Integer>();

	public int buscarPoder(int[] gemas, int k) {

		Set<Integer> Lista = new TreeSet<Integer>();

		int buscarComplemento;

		for (int i = 0; i < gemas.length; i++) {

			buscarComplemento = k - gemas[i];

			if (Lista.contains(buscarComplemento))
				combinaciones.put(buscarComplemento, gemas[i]);
			else
				Lista.add(gemas[i]);
		}

		return combinaciones.size();

	}

	public String combinacionesPosibles() {
		String resultado = "";
		for (Integer palabra : combinaciones.keySet()) {
			resultado = resultado + "[" + palabra + ", " + combinaciones.get(palabra) + "]";
		}

		return resultado;
	}

}
