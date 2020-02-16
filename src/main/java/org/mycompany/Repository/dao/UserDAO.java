package org.mycompany.Repository.dao;

import org.mycompany.Repository.model.User;

import java.util.*;

public class UserDAO {
    private static final Map<String, User> userMap = new HashMap<String, User>();

    static {
        initEmps();
    }


    private static void initEmps() {
        User user1 = new User("1", "2", "3", "4", "5");
        User user2 = new User("21", "22", "23", "24", "25");
        User user3 = new User("31", "32", "33", "34", "35");

        userMap.put(user1.getLogin(), user1);
        userMap.put(user2.getLogin(), user2);
        userMap.put(user3.getLogin(), user3);
    }

    public static User getEmployee(String userLogin) {
        return userMap.get(userLogin);
    }


    public static User addEmployee(User newUser) {
        userMap.put(newUser.getLogin(), newUser);
        return newUser;
    }


    public static User updateEmployee(User newUser) {
        userMap.put(newUser.getLogin(), newUser);
        return newUser;
    }

    public static void deleteEmployee(String login) {
        userMap.remove(login);
    }

    public static List<User> getAllEmployees() {
        Collection<User> c = userMap.values();
        List<User> list = new ArrayList<User>();
        list.addAll(c);
        return list;
    }

    List<User> list;
}
