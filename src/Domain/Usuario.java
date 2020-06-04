package Domain;

import Domain.Interfaces.IMediador;

/*
 * Procesa las notificaciones enviadas por otro colega a traves del mediador.
 */
public class Usuario extends Colega {

	public Usuario(IMediador mediador, String nombre) {
		super(mediador, nombre);
		mediador.Registrar(this);
	}

	@Override
	public void NotificacionRegistro(Colega colega) {
		System.out.println("Nuevo colega registrado con nombre: " + colega + 
				". --Recibido por " + this);
	}

	@Override
	public void NotificacionAnularRegistro(Colega colega) {
		System.out.println("Un colega ha salido con nombre: " + colega + 
				". --Recibido por " + this);
	}

	@Override
	public void NotificacionMensaje(String emisor, String mensaje) {
		System.out.println(emisor + " dice: \"" + mensaje + "\" --Recibido por " + this);
	}

	@Override
	public void EnviarMensaje(String mensaje) {
		mediador.EnviarMensaje(this, mensaje);
	}
}
