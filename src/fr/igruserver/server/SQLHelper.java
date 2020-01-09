package fr.igruserver.server;

import java.sql.*;

public class SQLHelper {
    private Connection _connection = null;

    public SQLHelper(String username, String password) {
        try {
            _connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1/igru?useUnicode=yes&characterEncoding=UTF-8", username, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Statement createStatement() {
        try {
            if (_connection != null)
                return _connection.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }
}
