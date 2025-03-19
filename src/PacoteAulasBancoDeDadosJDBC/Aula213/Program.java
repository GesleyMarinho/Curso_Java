package PacoteAulasBancoDeDadosJDBC.Aula213;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Program {
    public static void main(String[] args) {

        Connection connection = null;
        PreparedStatement st = null;

        try {
            connection = DB.getConnection();

            st = connection.prepareStatement("update seller set basesalary = basesalary + ? where DepartmentId = ?");
            st.setDouble(1, 200);
            st.setInt(2, 2);

            int rows = st.executeUpdate();

            System.out.println("Done! Rows affected:  " + rows);

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (connection != null) {
                DB.closeStatment(st);
                DB.closeConnection();
            }
        }
    }
}