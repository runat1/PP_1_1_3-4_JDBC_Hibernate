package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;

import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {
        UserDaoJDBCImpl userService=new UserDaoJDBCImpl();
        userService.createUsersTable();
        userService.saveUser("Dodo", "Piza", (byte)15);
        userService.saveUser("Mak", "Dac", (byte)4);
        userService.saveUser("Dilivery", "Clab", (byte)8);
        userService.saveUser("Piza", "Mia", (byte)30);
        System.out.println(userService.getAllUsers().toString());
        userService.cleanUsersTable();
        userService.dropUsersTable();

    }
}

