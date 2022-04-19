
public class Nodovenda {
	
	private int dado;
	private Nodovenda prox;
	
	
	public Nodovenda(int dado) {
		this.dado = dado;
		this.prox=null;
	}
	
	public int getDado() {
		return dado;
	}
	
	public Nodovenda getProx() {
		return prox;
	}
	public void setDado(int dado) {
		this.dado = dado;
	}

	public void setProx(Nodovenda prox) {
		this.prox = prox;
	}
	
	
}

