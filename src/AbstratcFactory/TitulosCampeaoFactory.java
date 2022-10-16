package AbstratcFactory;

public class TitulosCampeaoFactory extends TitulosFactory {
    @Override
    public Brasileirao titulo() {
        return new Brasileirao();
    }
}
