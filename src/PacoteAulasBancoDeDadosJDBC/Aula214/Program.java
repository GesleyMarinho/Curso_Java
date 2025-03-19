package PacoteAulasBancoDeDadosJDBC.Aula214;


import java.sql.*;


public class Program {
    public static void main(String[] args) {
        Connection conn = null;

        PreparedStatement st = null;

        try {
            conn = DB.getConnection();

            st = conn.prepareStatement("DELETE FROM DEPARTMENT WHERE ID  = ?");
            st.setInt(1, 2);
            int rows = st.executeUpdate();

            System.out.println("Done! Rows affected: " + rows);

        } catch (SQLException e) {
            throw new DbIntegratityException(e.getMessage());
        } finally {

            DB.closeStatment(st);
            DB.closeConnection();
        }

    }
}