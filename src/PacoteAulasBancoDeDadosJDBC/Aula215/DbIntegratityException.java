package PacoteAulasBancoDeDadosJDBC.Aula215;

public class DbIntegratityException extends RuntimeException {
    private static final long serialVersionUID = 1l;

    public DbIntegratityException(String msg) {
        super(msg);
    }
}
