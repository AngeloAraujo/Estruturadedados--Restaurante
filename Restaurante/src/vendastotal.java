
public class vendastotal {
	
		private Nodovenda inicio =null;// Remove no ínicio
		private Nodovenda fim =null; //Adiciona elementos no final
		private int limite =0;
		private int tamanho=0;
		private int mostrarvendas=0;
		
		public vendastotal() { //verificação de espaço
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
		
		public void inserir(int dado) {
			if (temEspaco ()) {
				Nodovenda novoItem = new Nodovenda(dado);
							
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
			Nodovenda aux=inicio;
			while (aux!= null) {
				lista+= aux.getDado()+"\n";
				aux= aux.getProx();
			}
			
		
			return lista;
		}
		
		public int Contavendas() {
			String lista= "";
			Nodovenda aux=inicio;
			int c=0;
			
			while (aux!= null) {
				lista+= aux.getDado()+"\n";
				aux= aux.getProx();
				c++;
			}
		
			return c;
		}
		
		public void mostravenda() {
			if ( mostrarvendas == 1) {
				System.out.println(Contavendas());
			}
			return;
		}
	}

