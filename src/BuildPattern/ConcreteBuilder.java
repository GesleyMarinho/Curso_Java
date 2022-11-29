package BuildPattern;

public class ConcreteBuilder implements Builder {

	private Tela tela;
	private Teclado teclado;
	private Mouse mouse;
	private HD hd;
	private CPU cpu;

	@Override
	public void buildTela(int tamanho, int bits) {
		tela = new Tela(tamanho, bits);
		System.out.printf("Tela : \n\t" + tela.getTamanho() +" polegadas\n\t" +  tela.getBits() + " bits\n" );
	}

	@Override
	public void buildTeclado(int quantidadeTeclas) {
		teclado = new Teclado(quantidadeTeclas);
		System.out.printf("Teclado : \n\t" + teclado.getQuantidadeTeclas() + " teclas\n");
		
	}

	@Override
	public void buildMouse(int tamanho, String cor) {
		mouse = new Mouse(tamanho, cor);
		System.out.println("Mouse: \n\t" + mouse.getTamanho() + " cm\n\tCor " + mouse.getCor());
		
	}

	@Override
	public void buildHD(int tamanhoHD, String processador) {
		hd = new HD(tamanhoHD, processador);
		System.out.println("\nHD : \n\t" + hd.getTamanhoHd() + "GB\n\t" + " Intel " +hd.getProcessador());
		
	}

	@Override
	public void BuildCPU(int armazenamento) {
		cpu = new CPU(armazenamento);
		System.out.println("\nCPU : \n\t" + cpu.getArmazenamento() + "TB");
		
	}

	@Override
	public Computador getComputador() {
		return new Computador(tela, teclado, mouse, hd, cpu);
	}
	

}
