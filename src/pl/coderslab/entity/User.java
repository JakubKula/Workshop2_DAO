package pl.coderslab.entity;

import org.mindrot.jbcrypt.BCrypt;

public class User {
    private static int id;
    private static String userName;
    private static String email;
    private static String password;

    public User() {
    }
    public User (String userName, String email, String password){
        this.userName = userName;
        this.email = email;
        this.password = password;
    }

    @Override
    public String toString() {
        return String.format("User{id=%s, username=%s, email=%s}",getId(),getUserName(),getEmail());
    }

    public  int getId() {
        return id;
    }
    public  void setId(int id) {
        this.id = id;
    }

    public  String getUserName() {
        return userName;
    }
    public  void setUserName(String userName) {
        this.userName = userName;
    }

    public  String getEmail() {
        return email;
    }
    public  void setEmail(String email) {
        this.email = email;
    }

    public  String getPassword() {
        return password;
    }
    public  void setPassword(String password) {
        this.password = password;
    }


}
