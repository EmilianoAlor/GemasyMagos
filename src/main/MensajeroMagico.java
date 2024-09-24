package main;

import java.util.LinkedList;

public class MensajeroMagico {

	private LinkedList<String> lista;

	public MensajeroMagico() {
		lista = new LinkedList<>();
	}

	public void recibirMensaje(String mensaje) {
		this.lista.addLast(mensaje);
	}

	public void recibirMensajeAltaPrioridad(String mensaje) {
		this.lista.addFirst(mensaje);
	}

	@Override
	public String toString() {
		return "MensajeroMagico [lista=" + lista + "]";
	}

}
