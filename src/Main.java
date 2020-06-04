import Domain.Bot;
import Domain.Colega;
import Domain.Sala;
import Domain.Usuario;
import Domain.Interfaces.IMediador;

public class Main {
	public static void main(String[] args) {
		IMediador sala = new Sala();
		Colega ramiro = new Usuario(sala, "RmrGnzlz");
		Colega daniela = new Usuario(sala, "Danii");
		Colega karen = new Usuario(sala, "Karito");
		Colega bot = new Bot(sala, "BoyBot");
		
		bot.EnviarMensaje("Inicio de sala. Escribe un mensaje y saluda a los demas.");
		daniela.EnviarMensaje("Hola a todos");
		sala.AnularRegistro(ramiro);
		karen.EnviarMensaje("Hola #Danii");
	}
}
