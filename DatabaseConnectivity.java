import java.sql.*;

class BasicConnection {
    public BasicConnection() {
        try {
            Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/test", "pokemon",
                    "pokemon");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("Select * from users");

            while (resultSet.next()) {
                System.out.println(resultSet.getInt("id"));
            }

            statement.close();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class AdvancedResultSet {
    public AdvancedResultSet() {
        try {
            Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/test", "pokemon",
                    "pokemon");
            Statement statement = connection.createStatement(
                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_UPDATABLE);

            ResultSet resultSet = statement.executeQuery("Select * from users");

            System.out.println("All user IDs:");
            while (resultSet.next()) {
                System.out.println(resultSet.getInt("id") + " - " + resultSet.getString("username"));
            }

            if (resultSet.first()) {
                resultSet.updateString("username", "updatedUser");
                resultSet.updateRow();
                System.out.println("First user's username updated.");
            }

            resultSet.moveToInsertRow();
            resultSet.updateInt("id", 999);
            resultSet.updateString("username", "newUser");
            resultSet.insertRow();
            System.out.println("New user inserted.");

            if (resultSet.absolute(3)) {
                resultSet.deleteRow();
                System.out.println("Third user deleted.");
            }

            System.out.println("\nFinal users in the table:");
            resultSet.beforeFirst();
            while (resultSet.next()) {
                System.out.println(resultSet.getInt("id") + " - " + resultSet.getString("username"));
            }

            statement.close();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

public class DatabaseConnectivity {
    public static void main(String[] args) {
        // new BasicConnection();
        new AdvancedResultSet();
    }
}
