package Domain;

import Domain.Interfaces.IMediador;

import java.util.ArrayList;
import java.util.List;

/*
 * Actua como el centro para la comunicacion entre los diferentes colegas.
 * Notifica los eventos producidos por los colegas.
 */
public class Sala implements IMediador {
	List<Colega> colegas = new ArrayList<Colega>();
	
	public Sala() {}
	
	@Override
	public void Registrar(Colega colega) {
		colegas.add(colega);
		colegas.forEach(otro -> {
			if (otro != colega) otro.NotificacionRegistro(colega);
		});
	}

	@Override
	public void AnularRegistro(Colega colega) {
		colegas.remove(colega);
		colegas.forEach(otro -> {
			if (otro != colega) otro.NotificacionAnularRegistro(colega);
		});
	}

	@Override
	public void EnviarMensaje(Colega colega, String mensaje) {
		if (colegas.contains(colega)) {
			colegas.forEach(otro -> {
				if (otro != colega) otro.NotificacionMensaje(colega.toString(), mensaje);
			});
		} else {
			System.out.println("Colega no registrado.");
		}
	}
}
