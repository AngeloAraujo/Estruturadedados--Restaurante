
public class MovimentoCaixa {

	float valorapagar=0;
	float dinheiro =0;
	float troco =0;
	
	
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


	public float troco() {
	return troco = (getValorapagar()- getDinheiro());
				
	}
}
