package BuildPattern;

public class Director {
	
	private Builder builder;

	public Director(Builder builder) {
		this.builder = builder;
	}

	public void construct() {
		builder.buildTela(15, 64);
		builder.buildTeclado(104);
		builder.buildMouse(20, "Preto");
		builder.buildHD(8, "i7");
		builder.BuildCPU(1);
	}

}
