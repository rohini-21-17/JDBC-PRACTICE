import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class JDBC {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/jdbc";
    private static final String USER = "root";
    private static final String PASS = "Rohini#1821";

    public static void main(String[] args){
        String insertSql = "INSERT INTO Employeee (name, salary) VALUES (?,?)";
        String selectSql = "SELECT id, name, salary FROM Employeee";

        try(
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            PreparedStatement insertStmt = conn.prepareStatement(insertSql);
        ){
            System.out.println("EXECUTING INSERT OPERATION");
            insertStmt.setString(1, "Rohini");
            insertStmt.setDouble(2,50000.00);
            int rowsAffected = insertStmt.executeUpdate();
            System.out.println(rowsAffected+ " row(s) inserted successfully.");

            insertStmt.setString(1, "Rohi");
            insertStmt.setDouble(2,70000.00);
            rowsAffected = insertStmt.executeUpdate();
            System.out.println(rowsAffected+ " row(s) inserted successfully.");

            insertStmt.setString(1, "Kavya");
            insertStmt.setDouble(2,80000.00);
            rowsAffected = insertStmt.executeUpdate();
            System.out.println(rowsAffected+ " row(s) inserted successfully.");

            insertStmt.setString(1, "Deepika");
            insertStmt.setDouble(2,90000.00);
            rowsAffected = insertStmt.executeUpdate();
            System.out.println(rowsAffected+ " row(s) inserted successfully.");

            System.out.println("\n---EXECUTING SELECT OPERATION---");
            try(
                PreparedStatement selectStmt =  conn.prepareStatement(selectSql);
                ResultSet rs = selectStmt.executeQuery();
            ) {
                System.out.println("EMPLOYEE DATA");
                System.out.println("--------");
                while(rs.next()){
                    int id = rs.getInt("id");
                    String name = rs.getString("name");
                    double salary = rs.getDouble("salary");
                    System.out.printf("ID: %d, NAME: %s, SALARY: $%.2f%n", id, name, salary);
                }
            }
        }
        catch(SQLException e){
            System.err.println("SQL Exception occurred: "+e.getMessage());
            e.printStackTrace();
        }
    }
}
