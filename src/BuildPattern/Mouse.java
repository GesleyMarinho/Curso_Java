package BuildPattern;

public class Mouse {
	
	private int tamanho;
	private String cor;
	
	
	public int getTamanho() {
		return tamanho;
	}
	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}
	
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}

	public Mouse(int tamanho, String cor) {
		this.tamanho = tamanho;
		this.cor =cor;
	}
	
}
