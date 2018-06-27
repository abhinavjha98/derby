
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class NewClass {
    private static final String dbUrl = "jdbc:derby://localhost:1527/" + "student;create=true;user=sa;password=target";
    private static final String tableName = "STUDENTS";
    private static Connection con =null;
    
    public static void main(String[] args) throws InstantiationException,IllegalAccessException, ClassNotFoundException {
        try{
            Class.forName("org.apache.derby.jdbc.ClientDriver").newInstance();
            con = DriverManager.getConnection(dbUrl);
            System.out.println("Connected");
        }catch(SQLException |ClassNotFoundException e){
            System.out.println("No man"+e.toString());
        }
    }
}
