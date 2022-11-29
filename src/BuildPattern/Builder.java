package BuildPattern;

public interface Builder {

	void buildTela(int tamanho, int bits);
	void buildTeclado(int quantidadeTeclas);
	void buildMouse(int tamanho, String cor);
	void buildHD(int tamanhoHD, String processador);
	void BuildCPU(int armazenamento);
	
	Computador getComputador();
}
