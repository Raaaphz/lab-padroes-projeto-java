package padroesprojetos.gof;

import padroesprojetos.gof.facade.Facade;
import padroesprojetos.gof.singleton.SingletonEager;
import padroesprojetos.gof.singleton.SingletonLazy;
import padroesprojetos.gof.singleton.SingletonLazyHolder;
import padroesprojetos.gof.strategy.Comportamento;
import padroesprojetos.gof.strategy.ComportamentoAgressivo;
import padroesprojetos.gof.strategy.ComportamentoDefensivo;
import padroesprojetos.gof.strategy.ComportamentoNormal;
import padroesprojetos.gof.strategy.Robo;

public class Test {
	
	public static void main(String[] args) {
		
		//Singleton
		
		SingletonLazy lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);
		lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);
		
		SingletonEager eager = SingletonEager.getInstancia();
		System.out.println(eager);
		eager = SingletonEager.getInstancia();
		System.out.println(eager);
		
		SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
		System.out.println(lazyHolder);
		lazyHolder = SingletonLazyHolder.getInstancia();
		System.out.println(lazyHolder);
		
		//Strategy
		
		Comportamento normal = new ComportamentoNormal();
		Comportamento defensivo = new ComportamentoDefensivo();
		Comportamento agressivo = new ComportamentoAgressivo();
		
		Robo robo = new Robo();
		robo.setComportamento(normal);
		robo.mover();
		
		robo.setComportamento(defensivo);
		robo.mover();
		
		robo.setComportamento(agressivo);
		robo.mover();
		
		//Facade
		Facade facade = new Facade();
		
		facade.migrarCliente("Raphael", "17012530");
		
		}
	
		 

}
