package bazyDanych2Lab1;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Start {
    public static Connection connect() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection conn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databasename=test;User=sa;Password=sql123;encrypt=true;trustServerCertificate=true");
            return conn;
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            System.exit(1);
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            System.exit(1);
        }
        return null;
    }
    public static void createTable(Connection con) {
        String createTableCoffees = "CREATE TABLE COFFEES (COF_NAME VARCHAR(32), SUP_ID INTEGER, PRICE FLOAT, SALES INTEGER, TOTAL INTEGER)";
        try {
            Statement stmt = con.createStatement();
            stmt.executeUpdate(createTableCoffees);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public static void createTableClients(Connection con) {
        String createTableClients = "CREATE TABLE KLIENCI (ID INTEGER, FIRST_NAME CHAR(50), LAST_NAME CHAR(50), STREET VARCHAR(200), BUILDING INTEGER,APARTMENT INTEGER, POSTAL_CODE CHAR(6),CITY CHAR(50),ITEMS INTEGER)";
        try {
            Statement stmt = con.createStatement();
            stmt.executeUpdate(createTableClients);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    
    public static void insertClients(Connection con) {
    	for(int i=0;i<10;i++) {
    		String insertClient = "INSERT INTO Klienci VALUES ("+i+",'Artur','Kozioł','Wrocławska',10,27,'53-145','Wrocław',10)";
    		try {
    			Statement stmt = con.createStatement();
    			stmt.executeUpdate(insertClient);
    		} catch(SQLException e) {
    			e.printStackTrace();
    		}
    	}
    }
    
    public static void printClients(Connection con) {
    	try {
    		Statement stmt =con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
    		ResultSet srs =stmt.executeQuery("SELECT * FROM KLIENCI");
    		while(srs.next()) {
    			int id = srs.getInt("ID");
    			String fname = srs.getString("FIRST_NAME").trim();
    			String lname = srs.getString("LAST_NAME").trim();
    			String street = srs.getString("STREET").trim();
    			System.out.println(id + " " + fname + lname + street);
    		}
    	} catch(SQLException e) {
    		e.printStackTrace();
    	}
    }
    
    public static void main(String[] args) {
        Connection c=connect();
//        createTableClients(c);
//        insertClients(c);
        printClients(c);
        System.out.println("Ok");
    }
}
