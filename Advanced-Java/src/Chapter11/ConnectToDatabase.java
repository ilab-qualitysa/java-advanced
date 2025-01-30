package Chapter11;
import java.sql.*;
public class ConnectToDatabase {
    public static void main(String[] args) {
        //readData();
        insertData();
    }

    static void readData() {
        Connection con = null;

        try {
            con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/northwind","root","root");

            Statement stm = con.createStatement();
            ResultSet results = stm.executeQuery("Select * from Customer");

            System.out.println("Cust ID\tCompany\tContact");
            while(results.next()) {
                System.out.println(results.getInt(1) + "\t" + results.getString(2) + "\t" + results.getString(3));
            }
            con.close();
        } catch (SQLException e) {
            System.out.println("Coonection to database failed. " + e.getMessage() + "\n" + e.getCause());
        }
    }

    static void insertData() {
        Connection con = null;
        try {
            con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/northwind","root","root");

            String insertLine = "insert into shipper(companyName,phone) values('Avis','011-456-7890')";
            Statement stm = con.createStatement();
            stm.executeUpdate(insertLine);
            con.close();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }
}
