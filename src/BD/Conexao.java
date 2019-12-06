package BD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conexao {

	static final String URL = "jdbc:postgresql://localhost:5432/postgres";
	static final String USER = "postgres";
	static final String PASSWORD = "thiago";

	public static Connection getConnection() {

		try {
			Class.forName("org.postgresql.Driver");
			return DriverManager.getConnection(URL, USER, PASSWORD);

		} catch (ClassNotFoundException | SQLException ex) {
			throw new RuntimeException("ERROR in Connection!");
		}
	}

	public static void closeConnection(Connection con) {

		try {
			if (con != null)
				con.close();
		} catch (SQLException ex) {
			Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
		}
	}

	public static void closeConnection(Connection con, PreparedStatement stmt) {

		try {
			if (stmt != null)
				stmt.close();
		} catch (SQLException ex) {
			Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
		}
		closeConnection(con);

	}

	public static void closeConnection(Connection con, PreparedStatement stmt, ResultSet rs) {

		try {
			if (rs != null) {
				rs.close();
			}
		} catch (SQLException ex) {
			Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
		}
		closeConnection(con, stmt);
	}
}
