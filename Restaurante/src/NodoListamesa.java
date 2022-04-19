
public class NodoListamesa {
	
	private int dado;
	private String nome;
	private NodoListamesa prox;
	private NodoListamesa ant;
	
	
	public NodoListamesa(int dado, String nome) {
		this.dado = dado;
		this.nome = nome;
		this.prox=null;
	}
	
	public int getDado() {
		return dado;
	}
	
	public NodoListamesa getProx() {
		return prox;
	}
	
	public void setDado(int dado) {
		this.dado = dado;
	}

	public void setProx(NodoListamesa prox) {
		this.prox = prox;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public NodoListamesa getAnt() {
		return ant;
	}

	public void setAnt(NodoListamesa ant) {
		this.ant = ant;
	}
	
}
