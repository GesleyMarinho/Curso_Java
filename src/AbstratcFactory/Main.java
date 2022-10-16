package AbstratcFactory;

public class Main {
    static Campeonatos gerarTitulo(String tipo) {

        TitulosFactory time = null;

        switch (tipo){
            case "Brasileirao":
                time=new TitulosCampeaoFactory();
                break;
        }

        Campeonatos campeonatos = new Campeonatos();
        campeonatos.setBrasileirao(time.titulo());
        return campeonatos;
    }

    public static void main(String args[]){
        Campeonatos time = Main.gerarTitulo("Brasileirao");

    }
}
