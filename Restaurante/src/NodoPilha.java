
public class NodoPilha {
		
		private int dado;
		private NodoPilha prox;
		
		
		public NodoPilha(int dado) {
			this.dado = dado;
			this.prox=null;
		}
		
		public int getDado() {
			return dado;
		}
		
		public NodoPilha getProx() {
			return prox;
		}
		public void setDado(int dado) {
			this.dado = dado;
		}

		public void setProx(NodoPilha prox) {
			this.prox = prox;
		}
		
		
	}
