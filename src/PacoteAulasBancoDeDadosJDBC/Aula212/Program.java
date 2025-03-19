package PacoteAulasBancoDeDadosJDBC.Aula212;


import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

public class Program {
    public static void main(String[] args) {



        List<Vendedor> vendedores = Vendedor.LeituraArquivo();

        if (vendedores.isEmpty()) {
            System.out.println("Nenhum vendedor encontrado no arquivo.");
            return;
        }
        Connection connection = null;
        PreparedStatement ps = null;
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        try {
            connection = DB.getConnection();
            connection.setAutoCommit(false);

            ps = connection.prepareStatement(
                    "INSERT INTO seller "
                            + "(Name, Email, BirthDate, BaseSalary, DepartmentId) "
                            + "VALUES "
                            + "(?, ?, ?, ?, ?)",
                    Statement.RETURN_GENERATED_KEYS);


            /*

            st.setString(1, "Carl Purple");
			st.setString(2, "carl@gmail.com");
			st.setDate(3, new java.sql.Date(sdf.parse("22/04/1985").getTime()));
			st.setDouble(4, 3000.0);
			st.setInt(5, 4);

			// EXAMPLE 2:
			//st = conn.prepareStatement(
			//		"insert into department (Name) values ('D1'),('D2')",
			//		Statement.RETURN_GENERATED_KEYS);
                */

            for (Vendedor vendedor : vendedores) {
                ps.setString(1, vendedor.getNome());
                ps.setString(2, vendedor.getEmail());
                ps.setString(3, sdf.format(sdf.parse(vendedor.getDataNascimento()))); //ajuste da data para o SQLite
                ps.setDouble(4, vendedor.getSalario());
                ps.setInt(5, vendedor.getDepartamentoId());
                ps.executeUpdate();
            }

            connection.commit();
            System.out.println("Vendedores inseridos com Sucesso");

            /*int rowsAffected = ps.executeUpdate();

            if (rowsAffected > 0) {
                ResultSet rs = ps.getGeneratedKeys();
                while (rs.next()) {
                    int id = rs.getInt(1);
                    System.out.println("Done! Id: " + id);
                }
            } else {
                System.out.println("No rows affected!");
            }*/

        } catch (SQLException | ParseException e) {
            e.printStackTrace();
            try {
                if (connection != null) {
                    connection.rollback(); // Reverter transação em caso de erro
                }
            } catch (SQLException rollbackEx) {
                rollbackEx.printStackTrace();
            }
        } finally {
            DB.closeStatment(ps);
            DB.closeConnection();
        }


        /*catch (SQLException | ParseException e) {
            e.printStackTrace();
        } finally {
            if (connection != null) {
                DB.closeStatment(ps);
                DB.closeConnection();
            }
        }*/
    }

}
