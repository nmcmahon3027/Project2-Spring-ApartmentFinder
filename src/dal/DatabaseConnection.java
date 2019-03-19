package dal;

import java.sql.Connection;
import java.sql.SQLException;

public class DatabaseConnection {
    private static Connection connection;

    public static Connection getConnection() throws SQLException{
        if(connection==null || connection.isClosed()) {
            connection = createNewConnection();
        }
        return connection;
        }
        private static Connection createNewConnection(){
        return null;

    }
}
