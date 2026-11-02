package subsistema2.cep;

public class CepApi {

	private static CepApi instancia = new CepApi();
	
	private CepApi() {
		// TODO Auto-generated constructor stub
	}
	
	public static CepApi getInstancia() {
		return instancia;
	}
	
	public String recuperarCidade(String cep) {
		return "Dado Mockado";
	}
	
	public String recuperarEstado() { 
		return "Estado Mockado";
	}
}
