package eu.senla.javaEE.task7;

import java.util.List;

public interface Bad {
    boolean create(User user) throws ClassNotFoundException;
    User read(String name, String pass);
    boolean update(Integer id, User newUser) throws ClassNotFoundException;
    List<User> readAll();
    User delete(String name,String pass);
}
