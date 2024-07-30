<%@ page import="java.sql.*" %>
<html>
<head>
    <title>JSP Database Connection Example</title>
</head>
<body>
    <h1>Users List</h1>
    <table border="1">
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Email</th>
        </tr>
        <%
            // Database connection parameters
            String url = "jdbc:sqlite:/path/to/your/sample.db"; // Adjust path as needed
            Connection conn = null;
            Statement stmt = null;
            ResultSet rs = null;

            try {
                // Load the JDBC driver (SQLite driver)
                Class.forName("org.sqlite.JDBC");

                // Establish the connection
                conn = DriverManager.getConnection(url);

                // Create a statement
                stmt = conn.createStatement();

                // Execute a query
                String sql = "SELECT * FROM users";
                rs = stmt.executeQuery(sql);

                // Process the result set
                while (rs.next()) {
                    int id = rs.getInt("id");
                    String name = rs.getString("name");
                    String email = rs.getString("email");
        %>
        <tr>
            <td><%= id %></td>
            <td><%= name %></td>
            <td><%= email %></td>
        </tr>
        <%
                }
            } catch (Exception e) {
                e.printStackTrace();
        %>
        <tr>
            <td colspan="3">Error: <%= e.getMessage() %></td>
        </tr>
        <%
            } finally {
                // Clean up resources
                try { if (rs != null) rs.close(); } catch (SQLException e) { e.printStackTrace(); }
                try { if (stmt != null) stmt.close(); } catch (SQLException e) { e.printStackTrace(); }
                try { if (conn != null) conn.close(); } catch (SQLException e) { e.printStackTrace(); }
            }
        %>
    </table>
</body>
</html>
