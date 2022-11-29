package BuildPattern;

public class Computador {
	
	private Tela tela;
	private Teclado teclado;
	private Mouse mouse;
	private HD hd;
	private CPU cpu;
	
	
	public Tela getTela() {
		return tela;
	}

	public Teclado getTeclado() {
		return teclado;
	}

	public Mouse getMouse() {
		return mouse;
	}

	public HD getHd() {
		return hd;
	}

	public CPU getCpu() {
		return cpu;
	}

	
	protected Tela criarTela(int tamanho, int bits) {
		return new Tela(tamanho, bits);
	}

	protected Teclado criarTeclado(int quantidadeTeclas) {
		return new Teclado(quantidadeTeclas);
	}
	
	protected Mouse criarMouse(int tamanho, String cor) {
		return new Mouse(tamanho, cor);
	}
	
	protected HD criarHD(int tamanhoHd, String processador) {
		return new HD(tamanhoHd, processador);
	}
	
	protected CPU criarCPU(int armazenamento) {
		return new CPU(armazenamento);
	}
	
	public Computador(Tela tela, Teclado teclado, Mouse mouse, HD hd, CPU cpu) {
		this.tela = tela;
		this.teclado = teclado;
		this.mouse = mouse;
		this.hd = hd;
		this.cpu = cpu;
	}
	
	public String toString() {
		return "Computador\n" +
				"Tela - Tamanho: " + tela.getTamanho() +
				"\n\tBits: " + tela.getBits() + 
				"\n\nTeclado - Quantidade de teclas: " + teclado.getQuantidadeTeclas() +
				"\n\nMouse - Tamanho do Mouse: " + mouse.getTamanho() +
				"\n\tCor do Mouse: " + mouse.getCor() + 
				"\n\nHD - Tamanho do HD: " + hd.getTamanhoHd() + 
				"\n\tProcessador: " + hd.getProcessador() +
				"\n\nCPU - Capacidade de Armazenamento: " + cpu.getArmazenamento() + " GB";
	}
}
