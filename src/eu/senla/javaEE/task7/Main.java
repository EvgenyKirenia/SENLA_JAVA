package eu.senla.javaEE.task7;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        BadRequest create = new BadRequest();
        BadRequest update = new BadRequest();
        BadRequest delete = new BadRequest();
        BadRequest read = new BadRequest();
        BadRequest readAll = new BadRequest();
        create.create(new User("lol","lol"));
        create.create(new User("lol","lol"));
        update.update(1,new User("qwer","123"));
        read.read("lol","lol");
        delete.delete("qwer","123");
        readAll.readAll();



    }
}
