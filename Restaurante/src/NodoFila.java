public class NodoFila {
		
		private int dado;
		private String nome;
		private NodoFila prox;
		
		
		public NodoFila(int dado, String nome) {
			this.dado = dado;
			this.nome=nome;
			this.prox=null;
		}
		
		public NodoFila(FilaEntraRestaurante fila) {
			// TODO Auto-generated constructor stub
		}

		public int getDado() {
			return dado;
		}
		
		public NodoFila getProx() {
			return prox;
		}
		public void setDado(int dado) {
			this.dado = dado;
		}

		public void setProx(NodoFila prox) {
			this.prox = prox;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}		
		
		
	}

