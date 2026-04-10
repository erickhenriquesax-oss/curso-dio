import java.util.List;

import dao.GenericDAO;
import dao.UserDAO;
import domain.UserDomain;

public class App {

    static final GenericDAO<Integer, UserDomain> dao = new UserDAO();
    public static void main(String[] args) throws Exception {
        var user = new UserDomain(1, "João", 36);
       System.out.println(dao.count());
       System.out.println(dao.save(user));
       System.out.println(dao.findAll());
       System.out.println(dao.find(d -> d.getId().equals(1)));
       System.out.println(dao.find(d -> d.getId().equals(2)));
       System.out.println(dao.count());
       System.out.println(dao.delete(new UserDomain(1, "", -1)));
       System.out.println(dao.delete(user));
       System.out.println(dao.findAll());
       System.out.println(dao.count());

    }
}
