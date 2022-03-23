package eu.senla.javaEE.task7;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import static java.sql.DriverManager.getConnection;


public class BadRequest implements Bad {


    @Override
    public boolean create(User user) throws ClassNotFoundException {

        String url = "jdbc:mysql://127.0.0.1:3306/app1";
        String userName = "root";
        String passsword = "root";
        Class.forName("com.mysql.jdbc.Driver");
        try (
                Connection connection = getConnection(url, userName, passsword)) {
            System.out.println("Connections to BD is succefull");
            PreparedStatement pstm = (PreparedStatement) connection.prepareStatement("INSERT INTO users (name, password) VALUES (?,?)");
            pstm.setString(1, user.name);
            pstm.setString(2, user.password);
            pstm.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return true;
    }

    @Override
    public User read(String name, String pass) {
        String url = "jdbc:mysql://127.0.0.1:3306/app1";
        String userName = "root";
        String passsword = "root";
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try (
                Connection connection = getConnection(url, userName, passsword)) {
            System.out.println("Connections to BD is succefull");
            PreparedStatement pstm = (PreparedStatement) connection.prepareStatement("SELECT * FROM users WHERE name=? AND password=?");
            pstm.setString(1, name);
            pstm.setString(2, pass);
            ResultSet resultSet = pstm.executeQuery();
            while (resultSet.next()) {
                resultSet.getString("name");
                resultSet.getString("password");
                int id = resultSet.getInt("id");
                System.out.println("-----------");
                System.out.println(id);

                System.out.println(name);
                System.out.println(pass + "\n");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public boolean update(Integer id, User newUser) throws ClassNotFoundException {
        String url = "jdbc:mysql://127.0.0.1:3306/app1";
        String userName = "root";
        String passsword = "root";
        Class.forName("com.mysql.jdbc.Driver");
        try (
                Connection connection = getConnection(url, userName, passsword)) {
            System.out.println("Connections to BD is succefull");
            PreparedStatement pstm = (PreparedStatement) connection.prepareStatement("UPDATE users SET name=?, password=? WHERE id=?");
            pstm.setString(1, newUser.name);
            pstm.setString(2, newUser.password);
            pstm.setInt(3, 1);
            pstm.execute();


        } catch (SQLException e) {
            e.printStackTrace();
        }
        return true;
    }

    @Override
    public User readAll() {
        String url = "jdbc:mysql://127.0.0.1:3306/app1";
        String userName = "root";
        String passsword = "root";
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try (
                Connection connection = getConnection(url, userName, passsword)) {
            System.out.println("Connections to BD is succefull");
            PreparedStatement pstm = (PreparedStatement) connection.prepareStatement("SELECT * FROM users");

            ResultSet resultSet = pstm.executeQuery();
            String name;
            String pass;
            Integer id;
            while (resultSet.next()) {
                name = resultSet.getString("name");
                pass = resultSet.getString("password");
                id = resultSet.getInt("id");
                System.out.println("-----------");
                System.out.println(id);
                System.out.println(name);
                System.out.println(pass + "\n");
            }


        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public User delete(String name, String pass) {
        String url = "jdbc:mysql://127.0.0.1:3306/app1";
        String userName = "root";
        String passsword = "root";
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try (
                Connection connection = getConnection(url, userName, passsword)) {
            System.out.println("Connections to BD is succefull");
            PreparedStatement pstm = (PreparedStatement) connection.prepareStatement("DELETE FROM users WHERE name=? AND password=?");
            pstm.setString(1, name);
            pstm.setString(2, pass);
            pstm.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}