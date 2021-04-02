package pl.coderslab;

import pl.coderslab.entity.User;
import pl.coderslab.entity.UserDao;

public class MainDao {

    public static void main(String[] args) {

        // tworzenie nowego usera
        User user = new User();
        user.setUserName("bozena");
        user.setEmail("bozkan123@gmail.com ");
        user.setPassword("wbozena123");
        UserDao uD = new UserDao();
        uD.create(user);
        User read = uD.read(1);
        System.out.println(read);
        User readNull = uD.read(4);
        System.out.println(readNull);

        // update usera
        UserDao userDaoNew = new UserDao();
        User userUpdate = new User();
        userUpdate = userDaoNew.read(1);
        userUpdate.setUserName("Wiktoria Loria");
        userUpdate.setEmail("wiktorialololo@gmail.com");
        userUpdate.setPassword("wikimikinarkotyki");
        userDaoNew.update(userUpdate);

        // usuwanie usera
        userDaoNew.delete(1);
        System.out.println(userDaoNew.read(1));

        // wyswietlanie wszytstkich urzytkownikow
        UserDao uDFindAll = new UserDao();
        uDFindAll.findAll();


    }
}
