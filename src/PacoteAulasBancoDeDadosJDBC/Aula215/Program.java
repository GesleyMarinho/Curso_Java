package PacoteAulasBancoDeDadosJDBC.Aula215;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;


public class Program {
    public static void main(String[] args) {
        Connection conn = null;
        Statement st = null;

        try {
            conn = DB.getConnection();
            conn.setAutoCommit(false);
            st = conn.createStatement();

            int rows1 = st.executeUpdate("update seller set basesalary = 3500 where departmentid = 1");
            /*int x = 1;
            if (x < 2) {
                throw new SQLException("Fake Error");
            }*/

            int rows2 = st.executeUpdate("update seller set basesalary = 5000 where departmentid = 2");

            conn.commit();


            System.out.println("Rows1: " + rows1);
            System.out.println("Rows2: " + rows2);

        } catch (SQLException e) {
            e.printStackTrace();
            try {
                conn.rollback();
                throw  new DbException("Rollback " + e.getMessage());
            } catch (SQLException ex) {
                throw new DbException("Erro ao fazer Rollback" + e.getMessage());
            }
        } finally {

            DB.closeStatment(st);
            DB.closeConnection();
        }

    }
}