

public class Pilhapratos {

	private NodoPilha topo;
	private int tamanho =0;
	private int limite=0;
	private int qtd=0;
	
	public Pilhapratos(int limite) {
		this.limite=limite;
		
	}
	public boolean estaVazio() {
		return tamanho == 0;
	}
	
	public boolean temEspaço() {
		return limite > tamanho;
		
	}
	public int getTamanho() {
		return tamanho;
	}
	
	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}
	
	public int getLimite() {
		return limite;
	}
	
	public void setLimite(int limite) {
		this.limite = limite;
	}
	
	public void setTopo(NodoPilha topo) {
		this.topo = topo;
	}
	
	public void push(int dado) {
		if(temEspaço()) {
			NodoPilha novoitem = new NodoPilha(dado);
			novoitem.setProx(topo); 
			topo = novoitem;
			tamanho ++;
		}else {
			System.out.println("Não há mais pratos");
		}
	}
	
	public void pop () {
		if(!estaVazio()) {
			System.out.println(topo.getDado()+" foi retirado da pilha");
			topo= topo.getProx();
			tamanho --;
		}
		else {
			System.out.println("Há pratos disponíveis");
		}
	}
	
	public int getTopo() {
		return topo.getDado();
	}
	
	public int quantidadepratosdisponiveis() {
		 qtd = (limite-tamanho);
		return qtd;
	}
	
	public void repor (int reporpratos) {
		
		while(reporpratos >0) {
			
		}
		
	}
}

