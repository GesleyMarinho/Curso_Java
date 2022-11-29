package BuildPattern;

public class RodarBuildPattern {

	public static void main(String[] args) {
		try {
			Builder builder = new ConcreteBuilder();
			Director director = new Director(builder);
			director.construct();
			Computador computador = builder.getComputador();

		}
		
		catch( Exception e) {
			e.printStackTrace();
		}
		
	}
	
}