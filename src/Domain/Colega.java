package Domain;

import Domain.Interfaces.IMediador;

/*
 * Define el contrato para las notificaciones de los eventos del mediador.
 */
public abstract class Colega {
	public IMediador mediador;
	private String nombre;
	
	public Colega(IMediador mediador, String nombre) {
		this.mediador = mediador;
		this.nombre = nombre;
	}
	
	public String toString() {
		return "#" + this.nombre;
	}
	
	public abstract void NotificacionRegistro(Colega colega);
	public abstract void NotificacionAnularRegistro(Colega colega);
	public abstract void EnviarMensaje(String mensaje);
	public abstract void NotificacionMensaje(String emisor, String mensaje);
}
