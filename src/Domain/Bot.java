package Domain;

import Domain.Interfaces.IMediador;

public class Bot extends Colega {

	public Bot(IMediador mediador, String nombre) {
		super(mediador, nombre);
		mediador.Registrar(this);
	}

	@Override
	public void NotificacionRegistro(Colega colega) {
		System.out.println("Nuevo usuario registrado con nombre: " + colega + 
				". --Recibido por " + this);
		EnviarMensaje("Bienvenido " + colega);
	}

	@Override
	public void NotificacionAnularRegistro(Colega colega) {
		System.out.println("Un usuario ha salido con nombre: " + colega + 
				". --Recibido por " + this);
	}

	@Override
	public void NotificacionMensaje(String emisor, String mensaje) {
		System.out.println(emisor + " dice: \"" + mensaje + "\" --Recibido por bot " + this);
	}

	@Override
	public void EnviarMensaje(String mensaje) {
		mediador.EnviarMensaje(this, mensaje);
	}

}
