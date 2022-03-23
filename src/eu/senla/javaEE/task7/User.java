package eu.senla.javaEE.task7;

public class User {
    String name;
    String password;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public User(String name, String password, int id) {

    }


    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }
}
