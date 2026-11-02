package padroesprojetos.gof.singleton;

/**
 * 
 * Singleton "Lazy Holder" => encapsulado
 * 
 */

public class SingletonLazyHolder {

	private static class Holder {
		public static SingletonLazyHolder instancia = new SingletonLazyHolder();
	}
	
	public SingletonLazyHolder() {
		// TODO Auto-generated constructor stub
	}
	
	public static SingletonLazyHolder getInstancia() {
		
		return Holder.instancia;
	}
}
