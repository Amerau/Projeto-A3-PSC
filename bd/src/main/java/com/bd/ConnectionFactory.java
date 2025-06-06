package com.bd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    private static String url = "jdbc:mysql://localhost:3306/acai?useTimezone=true&server=UTC";
    private static String usuario = "root";
    private static String senha = "Overwatch280901@";

    public static Connection getConnection() {
        try {
            Connection conexao = DriverManager.getConnection(url, usuario, senha);
            System.out.println("Conexão estabelecida com sucesso");
            return conexao;
        } catch (SQLException e) {
            System.err.println(e.getMessage());
            return null;
        }
    }
}