package BuildPattern;

public class HD {
	
	private int tamanhoHd;
	private String processador;
	
	
	public int getTamanhoHd() {
		return tamanhoHd;
	}
	public void setTamanhoHd(int tamanhoHd) {
		this.tamanhoHd = tamanhoHd;
	}
	
	
	public String getProcessador() {
		return processador;
	}
	public void setProcessador(String processador) {
		this.processador = processador;
	}
	
	public HD(int tamanhoHd, String processador) {
		this.tamanhoHd = tamanhoHd;
		this.processador = processador;
	}
	
}
