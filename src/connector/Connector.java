package connector;

import java.sql.*;

public class Connector {

    private String DB_name = "root";
    private String DB_host = "jdbc:mysql://localhost:3306/RDB_Banking";
    private String DB_pass = "";
    private Connection connection;

    {
        try {
            connection = DriverManager.getConnection(DB_host,DB_name,DB_pass );
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


}
