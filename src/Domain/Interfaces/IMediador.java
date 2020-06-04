package Domain.Interfaces;

import Domain.Colega;

/*
 * Define el contrato para la comunicacion entre los colegas
 */
public interface IMediador {
	void Registrar(Colega colega);
	void AnularRegistro(Colega colega);
	void EnviarMensaje(Colega emisor, String mensaje);
}
