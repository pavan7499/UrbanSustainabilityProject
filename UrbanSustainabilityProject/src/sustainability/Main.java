package sustainability;

import sustainability.*;
import java.sql.*;

public class Main {
    public static void main(String[] args) {
        // Database connection details
        String url = "jdbc:mysql://localhost:3306/urban_sustainability"; // Replace with your DB name
        String user = "root"; // Replace with your MySQL username
        String password = "pavan"; // Replace with your MySQL password

        // SQL query to fetch data from the 'emergency_services' table
        String query = "SELECT * FROM emergency_services"; // Replace with your actual table name

        // Connect to the database and fetch data
        try {
            // Load the JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish connection
            Connection conn = DriverManager.getConnection(url, user, password);

            // Create a Statement object to execute the query
            Statement stmt = conn.createStatement();

            // Execute the query and get a result set
            ResultSet rs = stmt.executeQuery(query);

            // Process the result set
            System.out.println("Service Type | Contact Number | Location");
            while (rs.next()) {
                // Adjust with your actual column names
                String serviceType = rs.getString("service_type"); // Adjust column name
                String contact = rs.getString("contact"); // Adjust column name
                String location = rs.getString("location"); // Adjust column name
                System.out.println(serviceType + " | " + contact + " | " + location);
            }

            // Close the resources
            rs.close();
            stmt.close();
            conn.close();

        } catch (SQLException | ClassNotFoundException e) {
            // Handle exceptions
            System.out.println("Error: " + e.getMessage());
        }
    }
}

