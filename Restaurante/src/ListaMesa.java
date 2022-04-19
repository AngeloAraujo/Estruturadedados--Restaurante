
public class ListaMesa {

		
		private NodoListamesa inicio = null;
		private NodoListamesa fim = null;
		private int tamanho=0;
		private int limite =20;
		
		public int getTamanho() {
			return tamanho;
		}
		
		public boolean temEspaco (){
			return limite > tamanho;
		}
		
		public boolean estaVazio() {
			return tamanho == 0;
		}
		
		
		public NodoListamesa getInicio() {
			return inicio;
		}

		public void setInicio(NodoListamesa inicio) {
			this.inicio = inicio;
		}

		public NodoListamesa getFim() {
			return fim;
		}

		public void setFim(NodoListamesa fim) {
			this.fim = fim;
		}

		public int getLimite() {
			return limite;
		}

		public void setLimite(int limite) {
			this.limite = limite;
		}

		public void setTamanho(int tamanho) {
			this.tamanho = tamanho;
		}

		public void inserirInicio (int dado, String nome) {
			NodoListamesa novoinicio= new NodoListamesa(dado, nome);
			if (temEspaco()) {
			if(inicio!= null) {
				inicio.setAnt(novoinicio);
				novoinicio.setProx(inicio);
				tamanho++;
			}
			inicio = novoinicio;
			if(fim== null) {
				fim= novoinicio;
				tamanho++;
			}
		}
		}
		
		public void inserirFinal(int dado, String nome) {
			NodoListamesa novoFim = new NodoListamesa(dado, nome);
			if (temEspaco()) {
			if (fim!= null) {
				fim.setProx(novoFim);
				tamanho++;
			}
		}
		}
		
		public void removeInicio() {
			NodoListamesa nodoRemovido = inicio;
			if (inicio == null) return;
			inicio = inicio.getProx();
			if (inicio!= null) {
				inicio.setAnt(null);
				tamanho--;
			}
			if (nodoRemovido==fim) {
				removeFinal();
				tamanho--;
			}
		}
		
		public void removeFinal() {
			NodoListamesa nodoRemovido = fim;
			if (fim ==null) return;
			fim=fim.getAnt();
			if(fim!= null) {
				fim.setProx(null);
				tamanho--;
			}
			if (nodoRemovido == inicio) {
				removeInicio();
				tamanho--;
			}
		}
		
		public void removeComValor (int dado) {
			NodoListamesa nodoRemovido = null;
			NodoListamesa aux = inicio;// o auxiliar que vai percorrer a lista
			while (aux!=null) {
				if (aux.getDado() == dado) {// aqui o auxiliar recebe dado
					nodoRemovido = aux;// aqui a variavel recebe o valor a ser removido
					break;
				}
		
			aux = aux.getProx();// esse mando o auxiliar para a próxima posição	
			
			}
			if (nodoRemovido == null) return;// se ele não encontrar no inicio ele já retorna
			if (nodoRemovido == inicio)removeInicio();// se ele encontrar o valor no inicio , já chama a função removeinicio 
			else if (nodoRemovido == fim) removeFinal(); // se ele encontrar o valor no final, já chama a função removefinal
			else {
				nodoRemovido.getAnt().setProx(nodoRemovido.getProx()); // aqui ele referencia o anterior e seta o próximo e o set do primeiro vai para o último
				nodoRemovido.getProx().setAnt(nodoRemovido.getAnt());//aqui ele referencia o anterior do próximo dado e o set do último para o primeiro
				
			}
		}
		
		public String mostraLista() {
			String lista="";
			NodoListamesa aux= inicio;
			while(aux!=null) {
				lista+=aux.getDado()+"\n";
				aux=aux.getProx();
			}
			return lista;
		}
		
		public int disponiveis() {
			int mesadisponiveis= (getLimite()-getTamanho());
			return mesadisponiveis;
		}
		public int almocando() {
			int pessoasalmoco= (getTamanho());
			return pessoasalmoco;
		}
	}
