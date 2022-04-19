
public class FilaCaixa {

	private NodoFila inicio =null;// Remove no ínicio
	private NodoFila fim =null; //Adiciona elementos no final
	private int limite =0;
	private int tamanho=0;
	private float valorapagar=0;
	private float dinheiro =0;
	private float troco =0;
	private float valorrecebido =0;
	private int mostrarvendas=0;
	private int pagar=0;

	
	public FilaCaixa (int limite) { //verificação de espaço
		this.limite = limite;
		
	}
	
	
	public int getLimite() {
		return limite;
	}


	public void setLimite(int limite) {
		this.limite = limite;
	}


	public int getTamanho() {
		return tamanho;
	}
	
	public boolean temEspaco (){
		return limite > tamanho;
	}
	
	public boolean estaVazio() {
		return tamanho == 0;
	}
	
	public float getValorapagar() {
		return valorapagar;
	}


	public void setValorapagar(float valorapagar) {
		this.valorapagar = valorapagar;
	}


	public float getDinheiro() {
		return dinheiro;
	}


	public void setDinheiro(float dinheiro) {
		this.dinheiro = dinheiro;
	}


	public float getTroco() {
		return troco;
	}


	public void setTroco(float troco) {
		this.troco = troco;
	}
	
	public void inserir(int dado, String nome) {
		if (temEspaco ()) {
			NodoFila novoItem = new NodoFila(dado,nome);
			
		System.out.println("Comanda: "+ novoItem.getDado()+" \nCliente: "+novoItem.getNome()+"\nInserido na fila do caixa");
		
		if (estaVazio()) {
			inicio= novoItem;
			fim = novoItem;
		}else {
			fim.setProx(novoItem);
			fim = novoItem;
		}
		tamanho++;
		} else System.out.println(" Fila cheia!!");
	}
	
	public void remover() {
		if (tamanho>0) {
			System.out.println(inicio.getDado()+" removido da fila");
			if (getTamanho()==1) {
				inicio= null;
				fim= null;
			}else inicio= inicio.getProx();// caso tenha mais de um elemento manda o ínicio p/ frente
			tamanho --; //tira o elemento da fila
		}else System.out.println(" Fila Vazia");//Não tem mais elemento
	}
	
	public int getInicio() {	
		if (!estaVazio())
			return inicio.getDado() ;//Não pode estar vazio
		else{
			System.out.println(" Fila está vazia");
			return -1;
		}
	}
	
	public String mostraLista() {
		String lista= "";
		NodoFila aux=inicio;
		while (aux!= null) {
			lista+= aux.getDado()+" "+aux.getNome()+"\n";
			aux= aux.getProx();
		}
	
		return lista;
	}

	public float trocototal() {
		troco = (getDinheiro()-getValorapagar());	
		return troco; 
	}
	
	
	public float vendas() {
		return valorrecebido+= getValorapagar();
		
	}
	public int Contavendas() {
		String lista= "";
		NodoFila aux=inicio;
		int c=0;
		
		while (aux!= null) {
			lista+= aux.getDado()+"\n";
			aux= aux.getProx();
			c++;
		}
	
		return c;
	}
	
	public void mostravenda(int i) {
		if ( mostrarvendas == 1) {
			System.out.println(Contavendas());
		}
		return;
	}
	
	public int contafila() {
		int contador= getTamanho();
		return contador;
	}
}



