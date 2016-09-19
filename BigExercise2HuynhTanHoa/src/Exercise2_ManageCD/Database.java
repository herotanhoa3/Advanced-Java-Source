
package Exercise2_ManageCD;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author Huynh Tan Hoa
 * @version 1.0
 * @since 19/09/2016
 */
public class Database {
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/cdstore?useUnicode=true&characterEncoding=utf8";
    private static final String JDBC_DRIVE_CLASS = "com.mysql.jdbc.Driver";
    private static final String JDBC_USERNAME = "root";
    private static final String JDBC_PASSWORD = "";
    
    public Connection connect() throws SQLException, ClassNotFoundException{
         Class.forName(JDBC_DRIVE_CLASS);
         Connection conn = (Connection) DriverManager.getConnection(JDBC_URL,JDBC_USERNAME,JDBC_PASSWORD);
         return conn;
     }
}
