package padroesprojetos.gof.singleton;

/**
 * 
 * Singleton APRESSADO
 * 
 */

public class SingletonEager {

	private static SingletonEager instancia = new SingletonEager();
	
	public SingletonEager() {
		// TODO Auto-generated constructor stub
	}
	
	public static SingletonEager getInstancia() {
		
		return instancia;
	}
}
