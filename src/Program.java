import java.sql.*;

public class Program {
  public static void main(String[] args) {
    Connection conn = null;
    try {
      Class.forName("com.mysql.cj.jdbc.Driver");
      conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bancoteste", "root", "senhaaleatoria");
      System.out.println("Conexão bem-sucedida!");
    } catch (ClassNotFoundException ex) {
      System.out.println("Erro ao carregar o driver!");
    } catch (SQLException ex) {
      System.out.println("Erro ao conectar com o banco de dados!");
    } finally {
      try {
        if (conn != null) {
          conn.close();
        }
      } catch (SQLException ex) {
        System.out.println("Erro ao fechar a conexão!");
      }
    }
  }
}





